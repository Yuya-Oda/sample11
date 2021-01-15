<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>第5章 フォームの練習②</title>
</head>
<body>
<h1>ユーザー登録もどき②</h1>
<form action="/sample11/FormSampleServlet" method="post">
名前：<br />
<input type="text" name="name"><br />
<br />
性別：<br />
男<input type="radio" name="gender" value="0">
女<input type="radio" name="gender" value="1"><br />
<br />
年齢：<br />
<input type="text" name="age"><br />
<br />
<input type="submit" value="登録">
</form>
</body>
</html>