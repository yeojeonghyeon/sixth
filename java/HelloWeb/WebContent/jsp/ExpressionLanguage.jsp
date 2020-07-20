<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Expression Language</title>
</head>
<body>
<%
// _service 함수의 지역 변수
	int cnt = 1;
%>
<span><%=cnt+1%></span>
<span>${cnt+1}</span>
</body>
</html>