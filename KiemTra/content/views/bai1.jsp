<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="bai1" method="POST">
	<lable>Number A</lable>
	<input type="text" name="soa" placeholder="nhap so a"><br>
	<lable>Number B</lable>
	<input type="text" name="sob" placeholder="nhap so b"><br>
	<lable>Number C</lable>
	<input type="text" name="soc" placeholder="nhap so c"><br>
	<input type="submit" name="tinh" value="+">
	<input type="submit" name="tinh" value="-">
	<input type="submit" name="tinh" value="*">
	<input type="submit" name="tinh" value="/">
</form>
</body>
</html>