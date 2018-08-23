<?php
mb_internal_encoding("utf8");

$pdo = new PDO("mysql:dbname=lesson01_kamiseki;host=localhost;","root","mysql");

$pdo->exec("insert into contactform(name,mail,age,comments)
values('".$_POST['name']."','".$_POST['mail']."','".$_POST['age']."','".$_POST['comments']."');");
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charaset="UTF-8">
        <title>お問い合わせフォーム</title>
        <link rel="stylesheet"type="text/css"href="style2.css">
    </head>
    <body>
        <h3>お問い合わせフォーム</h3>
        <div class="confirm">
            <p>お問い合わせ有難うございました。<br>３営業日以内に担当者よりご連絡差し上げます。</p>
        </div>
    
    </body>
</html>