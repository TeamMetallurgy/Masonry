$BlockData = Get-Content -Path BlockAPINames.txt
$BlockRegistryBlueprint = Get-Content -Path WallRegistryBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_ = $BlockInfo -split '\t'
    
    $BlockRegistry = $BlockRegistryBlueprint.Replace('{API_NAME_CAP}', $ApiName.ToUpper()).Replace('{API_NAME}', $ApiName)
    $BlockRegistry >> "Output\WallRegistryAddon.txt"
}
