<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "bai2serlet" method="post" enctype="multipart/form-data">
	<label>Họ và tên</label>
	<input type="text" name="username" placeholder="Họ và tên"><br>
	<label>Tài liệu</label>
	<input type="file" name="docfile">
	
	<label>Ngày sinh</label>
	<input type="date" id="birthday" name="birthday"><br>
	
	<label>Giới tính</label>
	<input type="radio" name="sex" value="Male">Nam
	<input type="radio" name="sex" value="Female">Nữ<br>
	
	<label>TT hôn nhân</label><input type="checkbox" name="check" value="Đã có gia đình">Đã có gia đình chưa ?<br>
	
	<label>Quốc tịnh</label>
	<input list="nationality" name="nationality"><br>
		<datalist id ="nationality">
			<option value="Việt nam">
			<option value="Trung quốc">
			<option value="Ấn độ">
			<option value="Nga">
			<option value="Mỹ">
		</datalist>
		
	<label>Sở thích</label>
	<input type="checkbox" name="hobby" value="Read book"><lable for="favorite1">Read book</lable>
	<input type="checkbox" name="hobby" value="Travel"><lable for="favorite2">Travel</lable>
	<input type="checkbox" name="hobby" value="Listen to music"><lable for="favorite3">Listen to music</lable>
	<input type="checkbox" name="hobby" value="Different"><lable for="favorite4">Different</lable><br>
	
	<label>Ghi chú</label>
	<textarea name="message" rows="10" cols="30">Oke</textarea><br>
	
	<hr>
	
	<input type="submit" name="submit" value="Đăng ký">
	
</form>
</body>
</html>