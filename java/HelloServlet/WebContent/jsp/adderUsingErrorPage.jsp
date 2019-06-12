<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="dataError.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	String str1 = request.getParameter("op1");
	String str2 = request.getParameter("op2");
	int total = Integer.parseInt(str1)+Integer.parseInt(str2); 
%>
	<h3><%=str1%>+<%=str2%>=<%=total%></h3>
</body>
</html>