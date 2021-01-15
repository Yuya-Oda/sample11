<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>第5章 練習問題②</title>
<style>
#body {
  white-space: pre-wrap;
}
</style>
</head>
<body>
<form action="/sample05/Practice05_02" method="post">
<h1>お問い合わせフォーム</h1>
お名前：<input type="text" name="name"><br />
<br />
お問い合わせの種類：
<select name="qtype">
	<option value="company">会社について</option>
	<option value="product">製品について</option>
	<option value="support">アフターサポートについて</option>
</select><br />
<br />
お問い合わせ内容：<br />
<textarea name="body" wrap="hard"></textarea><br />
<br />
<input type="submit" value="送信">
</form>
</body>
</html>