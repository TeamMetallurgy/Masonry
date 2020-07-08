$files = Get-ChildItem "C:\Users\josep\Desktop\Masonry116\src\main\resources\assets\masonry\models\block" -Filter *side.json

foreach($file in $files){
    $contents = Get-Content $file.FullName
    $contents = $contents.Replace('wall_side', 'wall_side_tall')
    $path = $file.FullName.Replace('side.json', 'sidetall.json')
    $contents | Out-File $path -Encoding utf8
}