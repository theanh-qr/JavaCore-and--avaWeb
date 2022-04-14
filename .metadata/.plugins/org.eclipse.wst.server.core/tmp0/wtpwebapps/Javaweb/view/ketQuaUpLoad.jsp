<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Hinh anh: ${img}</h2>
	<img src="images/${img}" height="100" width="100">
	<h2>Tai lieu: ${doc}</h2>
	<a href="images/${doc}">Tai ve</a>
</body>
</html>