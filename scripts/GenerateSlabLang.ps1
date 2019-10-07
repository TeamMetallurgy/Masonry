$BlockData = Get-Content -Path BlockAPINames.txt
$LangBlueprint = Get-Content -Path SlabLangBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$_ = $BlockInfo -split '\t'
    
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    $LangEntry = $LangBlueprint.Replace('{API_NAME}', $ApiNameNoUnd).Replace('{DISPLAY_NAME}', $DisplayName)
    $LangEntry >> "Output\LangAddon.txt"
}
