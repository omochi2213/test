document.write("問1<br>");
function a(hankei){
   　return "半径"+hankei+"cmの円の面積は"+hankei*hankei*3.14+"cm^2<br>";
}
document.write(a(5));
document.write(a(7));
document.write(a(10));

document.write("問2<br>");
function b(otona,kodomo){
    return "グループの合計金額は"+ (otona*500+kodomo*200) +"円です。<br>";
}
document.write("A"+b(2,4));
document.write("B"+b(1,5));
document.write("C"+b(3,7));