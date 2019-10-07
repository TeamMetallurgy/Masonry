$BlockData = Get-Content -Path BlockAPINames.txt
$LangBlueprint = Get-Content -Path TagBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$_ = $BlockInfo -split '\t'
    #$LangBlueprint.Replace('{API_NAME}', $ApiName.Replace('_', ''))
    $LangBlueprint.Replace('{API_NAME}', $ApiName.Replace('_', '')) >> "Output\TagAddon.txt"
}
