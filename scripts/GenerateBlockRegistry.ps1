$BlockData = Get-Content -Path BlockAPINames.txt
$BlockRegistryBlueprint = Get-Content -Path BlockRegistryBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$_,$_,$_,$_,$_,$_,$_,$Material,$MaterialColor,$Hardness,$Resistance = $BlockInfo -split '\t'
    
    $BlockRegistry = $BlockRegistryBlueprint.Replace('{API_NAME_CAP}', $ApiName.ToUpper()).Replace('{API_NAME_NO_UND}', $ApiName.Replace('_', '')).Replace('{MATERIAL}', $Material).Replace('{MATERIAL_COLOR}', $MaterialColor).Replace('{HARDNESS}', $Hardness).Replace('{RESISTANCE}', $Resistance)
    $BlockRegistry >> "Output\BlockRegistryAddon.txt"
}
