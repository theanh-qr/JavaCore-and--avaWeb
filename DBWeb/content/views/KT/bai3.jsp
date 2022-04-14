<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<mark>${message}</mark>
<form action="Bai3" method="post">
	User name:<input type="text" name="username"><br>
	Pass word:<input type="password" name="password"><br>
	<input type="checkbox" name="remember">Remember me ?
	<hr>
	<input type="submit" value="Login">
</form>
</body>
</html>