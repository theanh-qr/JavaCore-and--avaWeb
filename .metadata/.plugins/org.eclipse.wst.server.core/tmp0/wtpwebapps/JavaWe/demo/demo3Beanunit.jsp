<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="demo3Serlet" method="post" enctype="multipart/form-data">
		<input type="data" name="recuiltDate" placeholder="Fullname" placeholder="Recruitment Date?"><br>
		<input type="file" name="photofile" ><br> 
		<input name="hobby" type="checkbox">Travel
		<input name="hobby" type="checkbox">Read Book
		<input name="hobby" type="checkbox">Music
		<input name="hobby" type="checkbox">Other
		<input type="submit" value="submit">
	</form>
</body>
</html>