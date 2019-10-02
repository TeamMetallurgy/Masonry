$BlockData = Get-Content -Path BlockAPINames.txt
$RecipeBlueprint = Get-Content -Path StonecutterRecipeBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_ = $BlockInfo -split '\t'
    $Tag = $ApiName.Substring(0, $ApiName.IndexOf("_"))
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    
    $ModelData = $RecipeBlueprint.Replace('{TAG}', $Tag).Replace('{CHILD_ITEM}', $ApiNameNoUnd).Replace('{COUNT}', 1)
    $ModelData | Out-File "Output\recipes\items\"$ApiNameNoUnd"_from_"$Tag"_stonecutting.json" -Encoding utf8

}