$BlockData = Get-Content -Path BlockAPINames.txt
$ModelDataBlueprint = Get-Content -Path ItemModelBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$Material,$MaterialColor,$Hardness,$Resistance = $BlockInfo -split '\t'
    
    $ModelData = $ModelDataBlueprint.Replace('{API_NAME}', $ApiName)
    $ModelData | Out-File "Output\models\items\$ApiName.json"
}
