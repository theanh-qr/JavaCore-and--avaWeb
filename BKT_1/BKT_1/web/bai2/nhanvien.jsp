<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.container{
            text-align: center;

        }
</style>
<body>
	<div class="container">
        <form action="nhanvien" method="post" enctype="multipart/form-data">
            <h1></h1>
            <label for="">Ho va ten</label>
            <input type="text" name="user"><br><br>
            <label for="">Ngay sinh</label>
            <input type="date" name="birth"><br><br>
            <input type="file" name="file"><br><br>
            <label for="">Quoc tich</label>
            <select name="country" id="">
                <option>Viet Nam</option>
                <option>Trung Quoc</option>
                <option>My</option>
                <option>Anh</option>
            </select><br><br>
            <label for="">Gioi tinh</label>
            <input type="radio" name="sex" value="Nam">Nam
            <input type="radio" name="sex" value="Nu">Nu<br><br>
            <label for="">Tinh trang hon nhan</label>
            <input type="checkbox" name="family" value="family">
            <input type="checkbox" name="hobby" value="Reading">Reading
            <input type="checkbox" name="hobby" value="Travelving">Music
            <input type="checkbox" name="hobby" value="Music">Watch TV
            <input type="checkbox" name="hobby" value="Other">Other<br>
            <label for="">Ghi chu</label><br>
            <textarea name="ghichu" id="" cols="30" rows="10"></textarea>
            <hr>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>