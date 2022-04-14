<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>THONG TIN NHAN VIEN</h1>
	<ul>
	<li>Ho va ten: <b>${bean.user}</b></li>
	<li>Ngay sinh: <b>${bean.birth}</b></li>
	<li>Gioi Tinh: <b>${bean.sex}</b></li>
	<li>Quoc tich: <b>${bean.country}</b></li>
	<li>Gia đinh: <b>${bean.family}</b></li>
	<li>So thich: <b>${bean.hobby}</b></li>
	<li>Ghi chu: <b>${bean.text}</b></li>
	</ul>
</body>
</html>