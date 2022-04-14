<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="luong" scope="session" value="${3000*2 }"/>
lương
<c:out value="${luong }"></c:out>
<c:choose>
<c:when test="${luong <=0 }"> luong thap
</c:when>
<c:when test="${luong <=1000 }"> luong cao
</c:when>
</c:choose>
</body>
</html>