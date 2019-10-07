$BlockData = Get-Content -Path BlockAPINames.txt
$LootTableBlueprint = Get-Content -Path LootTableBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_ = $BlockInfo -split '\t'
    
    $ModelData = $LootTableBlueprint.Replace('{API_NAME}', $ApiName.Replace('_', ''))
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    $ModelData | Out-File "Output\loottables\$ApiNameNoUnd.json" -Encoding utf8
}
