$BlockData = Get-Content -Path BlockAPINames.txt
$RecipeBlueprint = Get-Content -Path StonecutterRecipeBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_ = $BlockInfo -split '\t'
    $Tag = "all"+$ApiName.Substring(0, $ApiName.IndexOf("_"))
    $NamespacedTag = "masonry:" + $Tag
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    
    $ModelData = $RecipeBlueprint.Replace('{TAG}', $NamespacedTag).Replace('{CHILD_ITEM}', $ApiNameNoUnd).Replace('{COUNT}', 1)
    $OutputFilepath = "Output\recipes\items\{0}_from_{1}_stonecutting.json" -f $ApiNameNoUnd,$Tag
    $ModelData | Out-File $OutputFilepath -Encoding utf8
}