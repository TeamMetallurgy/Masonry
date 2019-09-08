$BlockData = Get-Content -Path BlockAPINames.txt
$BlockstateBlueprint = Get-Content -Path BlockstateBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$Material,$MaterialColor,$Hardness,$Resistance = $BlockInfo -split '\t'
    
    $Blockstate = $BlockstateBlueprint.Replace('{API_NAME}', $ApiName)
    $Blockstate | Out-File "Output\blockstates\$ApiName.json"
}
