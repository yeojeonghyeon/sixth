<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>hello jsp</title>
<script src='../js/jquery-3.4.1.js'></script>
</head>
<body>
	<div>
		<h5><%=request.getParameter("userName")%></h5>
		<h5><%=request.getParameter("gender")%></h5>
		<textarea><%=request.getParameter("etc")%></textarea>
	</div>
	<div>
		<h5>${param.userName}</h5>
		<h5>${param.gender}</h5>
		<textarea>${param.etc}</textarea>
	</div>
</body>
</html>