$SlabData = Get-Content -Path BlockAPINames.txt
$BlockstateBlueprint = Get-Content -Path SlabBlockstateBlueprint.txt

foreach($SlabInfo in $SlabData){
    $ApiName,$_ = $SlabInfo -split '\t'
    
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    $Blockstate = $BlockstateBlueprint.Replace('{API_NAME}', $ApiNameNoUnd)
    $Filepath = 'Output\blockstates\{0}slab.json' -f $ApiNameNoUnd

    $Blockstate | Out-File $Filepath -Encoding utf8
}
