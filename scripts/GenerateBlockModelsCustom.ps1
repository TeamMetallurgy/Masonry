$BlockData = Get-Content -Path BlockAPINames.txt
$ModelDataBlueprint = Get-Content -Path BlockModelBlueprintCustom.txt

foreach($BlockInfo in $BlockData){
    $ApiName,$DisplayName,$Particle,$DownTexture,$UpTexture,$NorthTexture,$EastTexture,$SouthTexture,$WestTexture,$Material,$MaterialColor,$Hardness,$Resistance = $BlockInfo -split '\t'
    
    $ModelData = $ModelDataBlueprint.Replace('{API_NAME_PARTICLE}', $Particle).Replace('{API_NAME_DOWN}', $DownTexture).Replace('{API_NAME_UP}', $UpTexture).Replace('{API_NAME_NORTH}', $NorthTexture).Replace('{API_NAME_EAST}', $EastTexture).Replace('{API_NAME_SOUTH}', $SouthTexture).Replace('{API_NAME_WEST}', $WestTexture)
    $ApiNameNoUnd = $ApiName.Replace('_', '')
    $ModelData | Out-File "Output\models\blocks\$ApiNameNoUnd.json" -Encoding utf8
}