$BlockData = Get-Content -Path BlockAPINames.txt
$LangBlueprint = Get-Content -Path LangBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$_ = $BlockInfo -split '\t'
    
    $ApiNameWall = "{0}wall" -f $ApiName.Replace('_', '')
    $DisplayNameWall = "{0} Wall" -f $DisplayName
    $LangEntry = $LangBlueprint.Replace('{API_NAME}', $ApiNameWall).Replace('{DISPLAY_NAME}', $DisplayNameWall)
    $LangEntry >> "Output\LangAddon.txt"
}
