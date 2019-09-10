$BlockData = Get-Content -Path BlockAPINames.txt
$ModelDataBlueprint = Get-Content -Path ItemModelBlueprint.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$_,$_,$_,$_,$_,$_,$_,$Material,$MaterialColor,$Hardness,$Resistance = $BlockInfo -split '\t'
    
    $ModelData = $ModelDataBlueprint.Replace('{API_NAME}', $ApiName.Replace('_', ''))
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    $ModelData | Out-File "Output\models\items\$ApiNameNoUnd.json" -Encoding utf8
}
