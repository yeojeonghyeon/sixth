<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>cookie creation</title>
</head>
<body>
<%
	response.addCookie(new Cookie("name", "John"));
	response.addCookie(new Cookie("gender", "Male"));
	response.addCookie(new Cookie("age", "15"));
%>
	<h3>쿠키가 구워졌습니다.</h3>
</body>
</html>