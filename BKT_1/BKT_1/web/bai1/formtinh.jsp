<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	form{
		text-align: center;
	}
</style>
<body>
	<form action="pheptinh" method="post">
	<h1>CALCULATOR</h1><br>
	<label>so A</label>
	<input type="number" name="soa" placeholder = "Nhap so a"><br><br>
	<label>so B</label>
	<input type="number" name="sob" placeholder = "Nhap so b"><br><br>
	<label>so C</label>
	<input type="number" name="soc" placeholder = "Nhap so c"><br><br>
	<input type="submit" value="+" name="tinh">
	<input type="submit" value="-" name="tinh">
	<input type="submit" value="*" name="tinh">
	<input type="submit" value="/" name="tinh">
</form>
</body>
</html>