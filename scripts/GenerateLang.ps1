$BlockData = Get-Content -Path BlockAPINames.txt
$LangBlueprint = Get-Content -Path LangBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$Material,$MaterialColor,$Hardness,$Resistance = $BlockInfo -split '\t'
    
    $LangEntry = $LangBlueprint.Replace('{API_NAME}', $ApiName).Replace('{DISPLAY_NAME}', $DisplayName)
    $LangEntry >> "Output\LangAddon.txt"
}
