<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>animal jsp</title>
</head>
<body>
<%
	session.setAttribute("food", request.getParameter("food"));
%>
	<form action="result.jsp">
		<input type="text" name="animal">
		<input type="submit" value="전송">
	</form>
</body>
</html>