$SlabData = Get-Content -Path SlabAPINames.txt
$BlockstateBlueprint = Get-Content -Path BlockstateBlueprint.txt

foreach($SlabInfo in $SlabData){
    $ApiName,$DisplayName,$BottomTexture,$TopTexture,$SideTexture,$DoubleTexture,$Material,$MaterialColor,$Hardness,$Resistance = $SlabInfo -split '\t'
    
    $Blockstate = $BlockstateBlueprint.Replace('{BOTTOM}', $ApiName.Replace('_', ''))
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    $Blockstate | Out-File "Output\blockstates\$ApiNameNoUnd.json" -Encoding utf8
}
