$BlockData = Get-Content -Path BlockAPINames.txt
$BlockstateBlueprint = Get-Content -Path WallBlockstateBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_ = $BlockInfo -split '\t'

    $Blockstate = $BlockstateBlueprint.Replace('{API_NAME}', $ApiName.Replace('_', ''))
    $Filepath = "Output\blockstates\{0}wall.json" -f $ApiName.Replace('_', '')
    $Blockstate | Out-File $Filepath -Encoding utf8
}
