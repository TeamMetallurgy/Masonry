$BlockData = Get-Content -Path BlockAPINames.txt
$PostModelDataBlueprint = Get-Content -Path WallPostBlockModelBlueprint.txt
$SideModelDataBlueprint = Get-Content -Path WallSideBlockModelBlueprint.txt
$InventoryModelDataBlueprint = Get-Content -Path WallInventoryBlockModelBlueprint.txt
$ItemModelDataBlueprint = Get-Content -Path WallItemModelBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_,$ParticleTexture,$_ = $BlockInfo -split '\t'
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    
    $PostModelData = $PostModelDataBlueprint.Replace('{API_NAME}', $ParticleTexture)
    $SideModelData = $SideModelDataBlueprint.Replace('{API_NAME}', $ParticleTexture)
    $InventoryModelData = $InventoryModelDataBlueprint.Replace('{API_NAME}', $ParticleTexture)
    $ItemModelData = $ItemModelDataBlueprint.Replace('{API_NAME}', $ApiNameNoUnd)

    $PostFilepath = "Output\models\blocks\{0}post.json" -f $ApiNameNoUnd
    $SideFilepath = "Output\models\blocks\{0}side.json" -f $ApiNameNoUnd
    $InventoryFilepath = "Output\models\blocks\{0}inventory.json" -f $ApiNameNoUnd
    $ItemFilepath = "Output\models\items\{0}wall.json" -f $ApiNameNoUnd
    
    $PostModelData | Out-File $PostFilepath -Encoding utf8
    $SideModelData | Out-File $SideFilepath -Encoding utf8
    $InventoryModelData | Out-File $InventoryFilepath -Encoding utf8
    $ItemModelData | Out-File $ItemFilepath -Encoding utf8
    
}