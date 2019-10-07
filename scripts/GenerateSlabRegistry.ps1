$BlockData = Get-Content -Path BlockAPINames.txt
$BlockRegistryBlueprint = Get-Content -Path SlabRegistryBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_ = $BlockInfo -split '\t'
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    
    $BlockRegistry = $BlockRegistryBlueprint.Replace('{API_NAME_CAP}', $ApiName.ToUpper()).Replace('{API_NAME}', $ApiNameNoUnd)
    $BlockRegistry >> "Output\SlabRegistryAddon.txt"
}
