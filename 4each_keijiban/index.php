<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>掲示板</title>
        <link rel="stylesheet"type="text/css"href="style.css">
    </head>
    
    <body>
        <?php
        mb_internal_encoding("utf8");
        $pdo = new PDO("mysql:dbname=lesson01_kamiseki;host=localhost;","root","mysql");
        $stmt = $pdo->query("select * from 4each_keijiban");
        ?>
       <img src="4eachblog_logo.jpg"width="200px">
        <header>
            <ul>
                <li>トップ</li>
                <li>プロフィール</li>
                <li>4eachについて</li>
                <li>登録フォーム</li>
                <li>問い合わせ</li>
                <li>その他</li>
            </ul>
        </header>
        <main>
            <div class="left">
                <h2>プログラミングに役立つ掲示板</h2>
                <form method="post"action="insert.php">
                    <h3>入力フォーム</h3>
                    ハンドルネーム<br>
                    <input type="text"name="handlename"size="30px"><br>
                    タイトル<br>
                    <input type="text"name="title"size="30px"><br>
                    コメント<br>
                    <textarea name="comments"cols="50"rows="8"></textarea>
                    <br>
                    <input class="submit" type="submit"value="投稿する">
                </form>
                <?php
                while($row=$stmt->fetch()){
                echo "<div class='keiji'>";
                echo "<h3>".$row['title']."</h3>";
                echo "<div class='comments'>";
                echo $row['comments'];
                echo "<br><div class='handlename'>posted by ".$row['handlename']."</div>";
                echo "</div>";
                echo "</div>";
                }
                ?>
            </div>
            <div class="right">
                <div class="A">
                <h3>人気の記事</h3>
                <ul>
                    <li>PHPオススメ本</li>
                    <li>PHP MyAdminの使い方</li>
                    <li>いま人気のエディタTop5</li>
                    <li>HTMLの基礎</li>
                </ul>
                <h3>オススメリンク</h3>
                <ul>
                    <li>インターノウス株式会社</li>
                    <li>XAMPPのダウンロード</li>
                    <li>Edipseのダウンロード</li>
                    <li>Braketsのダウンロード</li>
                </ul>
                <h3>カテゴリ</h3>
                <ul>
                    <li>HTML</li>
                    <li>PHP</li>
                    <li>MySQL</li>
                    <li>JavaScriot</li>
                </ul>
                </div>
            </div>
        </main>
        <footer>
            <dev class="B">
            copyright internous | 4each blog is the one which provides A to Z about programming.
            </dev>
        </footer>
    </body>
</html>