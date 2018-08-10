document.write("問1<br>");
for(var a=1;a<6;a++){
    document.write("★");
}

document.write("<br>問2<br>");
for(var b=1;b<=3;b++){
    document.write("★");
}
document.write("<br>");
for(var b=1;b<=3;b++){
    document.write("★");
}

document.write("<br>問3<br>");
for(var c=1;c<=2;c++){
    for(var d=1;d<=5;d++){
        document.write("☆");
    }
    document.write("<br>");
}

document.write("問4<br>");
for(var e=1;e<=4;e++){
    for(var f=1;f<=5;f++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("問5<br>");
for(var g=1;g<=4;g++){
    for(var h=1;h<=3;h++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("問6<br>");
for(var i=1;i<=3;i++){
    for(j=1;j<=3;j++){
        if(j%2==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}

document.write("問7<br>");
for(var k=1;k<=4;k++){
    for(l=1;l<=5;l++){
        if(l%2==1){
            document.write("★");
        }else{
            document.write("☆");
        }
    }
    document.write("<br>");
}

document.write("問8<br>");
for(var m=1;m<=5;m++){
    for(var n=1;n<=m;n++){
        document.write("★");
    }
    document.write("<br>");
}