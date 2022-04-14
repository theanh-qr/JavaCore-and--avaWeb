<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.a{
		
	}
	
</style>
</head>
<body>
<form action = "hinhtamgiac" method = "post">
	<div class="a">
		<input type="text" name="a" placeholder="Nhap A"><br>
		<input type="text" name="b" placeholder="Nhap B"><br>
		<input type="text" name="c" placeholder="Nhap C">
		<hr>
		<input type="submit" formaction="dientich" value="dien tich">
		<input type="submit" formaction="chuvi" value="chu vi">
	</div>
	<hr>
	<h2>${{kq}}</h2>
</form>
</body>
</html>