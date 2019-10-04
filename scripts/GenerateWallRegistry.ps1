$BlockData = Get-Content -Path BlockAPINames.txt
$BlockRegistryBlueprint = Get-Content -Path WallRegistryBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_ = $BlockInfo -split '\t'
    $ApiNameWall = "{0}wall" -f $ApiName.Replace('_', '')
    
    $BlockRegistry = $BlockRegistryBlueprint.Replace('{API_NAME_CAP}', $ApiName.ToUpper()).Replace('{API_NAME}', $ApiNameWall)
    $BlockRegistry >> "Output\WallRegistryAddon.txt"
}
