<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="DataError.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Adder.jsp</title>
</head>
<body>
<%
	String num1 = request.getParameter("num1");	
	String num2 = request.getParameter("num2");
	int result = Integer.parseInt(num1) + Integer.parseInt(num2);
%>
<p><%=num1%>+<%=num2%>=<%=result%></p>
</body>
</html>