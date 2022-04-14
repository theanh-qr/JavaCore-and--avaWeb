<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="demo2Serlet" method="post">
		<input type="text" name="fullname" placeholder="Fullname"><br>
		<input type="text" name="age" placeholder="Age"><br>
		<input type="radio" name="gender" value="Male">Nam<br> 
		<input type="radio" name="gender" value="Female">Nữ<br> 
		<select name="country">
			<option value="VN">việt nam</option>
			<option value="US">United States</option>
		</select> <br> <input name="salary" placeholder="salary">
		<hr>
		<input type="submit" value="submit">
	</form>
</body>
</html>