$BlockData = Get-Content -Path BlockAPINames.txt
$PostModelDataBlueprint = Get-Content -Path WallPostBlockModelBlueprint.txt
$SideModelDataBlueprint = Get-Content -Path WallSideBlockModelBlueprint.txt
$InventoryModelDataBlueprint = Get-Content -Path WallInventoryBlockModelBlueprint.txt
$ItemModelDataBlueprint = Get-Content -Path WallItemModelBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_ = $BlockInfo -split '\t'
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    
    $PostModelData = $PostModelDataBlueprint.Replace('{API_NAME}', $ApiNameNoUnd)
    $SideModelData = $SideModelDataBlueprint.Replace('{API_NAME}', $ApiNameNoUnd)
    $InventoryModelData = $InventoryModelDataBlueprint.Replace('{API_NAME}', $ApiNameNoUnd)
    $ItemModelData = $ItemModelDataBlueprint.Replace('{API_NAME}', $ApiName)

    $PostFilepath = "Output\models\blocks\{0}_post.json" -f $ApiName
    $SideFilepath = "Output\models\blocks\{0}_side.json" -f $ApiName
    $InventoryFilepath = "Output\models\blocks\{0}_inventory.json" -f $ApiName
    $ItemFilepath = "Output\models\items\{0}_wall.json" -f $ApiName
    
    $PostModelData | Out-File $PostFilepath -Encoding utf8
    $SideModelData | Out-File $SideFilepath -Encoding utf8
    $InventoryModelData | Out-File $InventoryFilepath -Encoding utf8
    $ItemModelData | Out-File $ItemFilepath -Encoding utf8
    
}