<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	form{
		height: 500px;
		weight: 300px;
		margin-right: 200px;
	}
</style>
</head>
<body>
<h1>Register</h1>
<form action = "Dangky" method="post">
	<label>User name</label>
	<input type="text" name="username" placeholder="User name"><br>
	
	<label>Password</label>
	<input type="date" name="datetime" placeholder="Password"><br>
	
	<label>Sex</label>
	<input type="radio" name="sex" value="Male">Male
	<input type="radio" name="sex" value="Female">Female<br>
	
	<input type="checkbox" name="check" value="Yes">Married<br>
	
	<label>nationality</label>
	<input list="nationality" name="nationality"><br>
		<datalist id ="nationality">
			<option value="Vietnamess">
			<option value="China">
			<option value="India">
			<option value="Russia">
			<option value="America">
		</datalist>
		
	<label>Favorite</label>
	<input type="checkbox" name="favorite1" value="Read book"><lable for="favorite1">Read book</lable>
	<input type="checkbox" name="favorite2" value="Travel"><lable for="favorite2">Travel</lable>
	<input type="checkbox" name="favorite3" value="Listen to music"><lable for="favorite3">Listen to music</lable>
	<input type="checkbox" name="favorite4" value="Different"><lable for="favorite4">Different</lable><br>
	
	<label>Note:</label>
	<textarea name="message" rows="10" cols="30">Oke</textarea><br>
	
	<hr>
	
	<input type="submit" name="submit" value="Đăng ký">
	
</form>
</body>
</html>