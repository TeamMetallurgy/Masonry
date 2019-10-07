$BlockData = Get-Content -Path BlockAPINames.txt
$ModelDataBlueprint = Get-Content -Path BlockModelBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$Material,$MaterialColor,$Hardness,$Resistance = $BlockInfo -split '\t'
    
    $ModelData = $ModelDataBlueprint.Replace('{API_NAME}', $ApiName)
    $ModelData | Out-File "Output\models\blocks\$ApiName.json" -Encoding utf8
}
