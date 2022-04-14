<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Bai1" method="post" enctype="multipart/form-data">
		<input type="date" name="date"><br> 
		<input type="file" name="photo"><br>
		<input type="checkbox" name="favorite1" value="Read book"><lable for="favorite1">Read book</lable>
		<input type="checkbox" name="favorite2" value="Travel"><lable for="favorite2">Travel</lable>
		<input type="checkbox" name="favorite3" value="Music"><lable for="favorite3">Listen to music</lable>
		<input type="checkbox" name="favorite4" value="Other"><lable for="favorite4">Different</lable><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>