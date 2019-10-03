$BlockData = Get-Content -Path BlockAPINames.txt
$BlockstateBlueprint = Get-Content -Path WallBlockstateBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_ = $BlockInfo -split '\t'

    $Blockstate = $BlockstateBlueprint.Replace('{API_NAME}', $ApiName)
    $Filepath = "Output\blockstates\{0}_wall.json" -f $ApiName
    $Blockstate | Out-File $Filepath -Encoding utf8
}
