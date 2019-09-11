$SlabData = Get-Content -Path SlabAPINames.txt
$ModelDataBlueprint = Get-Content -Path BlockModelBlueprintCustom.txt

foreach($SlabInfo in $SlabData){
    $ApiName,$DisplayName,$BottomTexture,$TopTexture,$SideTexture,$DoubleTexture,$Material,$MaterialColor,$Hardness,$Resistance = $SlabInfo -split '\t'
    
    $ModelData = $ModelDataBlueprint.Replace('{BOTTOM}', $BottomTexture).Replace('{TOP}', $TopTexture).Replace('{SIDE}', $SideTexture)
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    $ModelData | Out-File "Output\models\blocks\$ApiNameNoUnd.json" -Encoding utf8
}