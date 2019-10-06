$BlockData = Get-Content -Path BlockAPINames.txt
$LootTableBlueprint = Get-Content -Path SlabLootBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$_ = $BlockInfo -split '\t'
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    
    $ModelData = $LootTableBlueprint.Replace('{API_NAME}', $ApiNameNoUnd)
    $Filepath = 'Output\loottables\{0}slab.json' -f $ApiNameNoUnd
    $ModelData | Out-File $Filepath -Encoding utf8
}
