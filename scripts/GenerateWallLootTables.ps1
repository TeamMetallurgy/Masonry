$BlockData = Get-Content -Path BlockAPINames.txt
$LootTableBlueprint = Get-Content -Path LootTableBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_ = $BlockInfo -split '\t'
    $ApiNameWall = "{0}_wall" -f $ApiName

    $ModelData = $LootTableBlueprint.Replace('{API_NAME}', $ApiNameWall)
    $ModelData | Out-File "Output\loottables\$ApiNameWall.json" -Encoding utf8
}
