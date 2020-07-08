$files = Get-ChildItem "C:\Users\josep\Desktop\Masonry116\src\main\resources\assets\masonry\blockstates\" -Filter *wall.json
$blockstate16 = Get-Content -Path blockstate16template.txt

foreach($file in $files){
    $filename = $file.FullName.Replace('wall.json', '').Replace('C:\Users\josep\Desktop\Masonry116\src\main\resources\assets\masonry\blockstates\', '')
    $newBlockstate = $blockstate16.Replace('{name}', $filename)
    $newBlockstate | Out-File $file.FullName -Encoding utf8
}