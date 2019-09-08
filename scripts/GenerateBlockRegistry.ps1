$BlockData = Get-Content -Path BlockAPINames.txt
$BlockRegistryBlueprint = Get-Content -Path BlockRegistryBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$Material,$MaterialColor,$Hardness,$Resistance = $BlockInfo -split '\t'
    
    $BlockRegistry = $BlockRegistryBlueprint.Replace('{API_NAME}', $ApiName.ToUpper()).Replace('{MATERIAL}', $Material).Replace('{MATERIAL_COLOR}', $MaterialColor).Replace('{HARDNESS}', $Hardness).Replace('{RESISTANCE}', $Resistance)
    $BlockRegistry >> "Output\BlockRegistryAddon.txt"
}
