$SlabData = Get-Content -Path BlockAPINames.txt
$TopModelDataBlueprint = Get-Content -Path SlabModelTopBlueprint.txt
$BottomModelDataBlueprint = Get-Content -Path SlabModelBottomBlueprint.txt
$ItemModelDataBlueprint = Get-Content -Path SlabItemModelBlueprint.txt

foreach($SlabInfo in $SlabData){
    $ApiName,$_,$ParticleTexture,$_ = $SlabInfo -split '\t'
    
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    $TopModelData = $TopModelDataBlueprint.Replace('{API_NAME}', $ParticleTexture)
    $BottomModelData = $BottomModelDataBlueprint.Replace('{API_NAME}', $ParticleTexture)
    $ItemModelData = $ItemModelDataBlueprint.Replace('{API_NAME}', $ApiNameNoUnd)

    $TopFilepath = "Output\models\blocks\{0}slabtop.json" -f $ApiNameNoUnd
    $BottomFilepath = "Output\models\blocks\{0}slab.json" -f $ApiNameNoUnd
    $ItemFilepath = "Output\models\items\{0}slab.json" -f $ApiNameNoUnd
    
    $TopModelData | Out-File $TopFilepath -Encoding utf8
    $BottomModelData | Out-File $BottomFilepath -Encoding utf8
    $ItemModelData | Out-File $ItemFilepath -Encoding utf8
}