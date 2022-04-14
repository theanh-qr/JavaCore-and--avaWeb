<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="upLoad" method="post" enctype="multipart/form-data">
	Hình ảnh<input name="photo" type="file"><br>
	Tài liệu<input type="file" name="docfile"><hr>
	<input type="submit" value="submit">
	</form>
</body>
</html>