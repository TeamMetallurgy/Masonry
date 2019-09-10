$BlockData = Get-Content -Path BlockAPINames.txt
$BlockstateBlueprint = Get-Content -Path BlockstateBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$Material,$MaterialColor,$Hardness,$Resistance = $BlockInfo -split '\t'
    
    $Blockstate = $BlockstateBlueprint.Replace('{API_NAME}', $ApiName.Replace('_', ''))
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    $Blockstate | Out-File "Output\blockstates\$ApiNameNoUnd.json" -Encoding utf8
}
