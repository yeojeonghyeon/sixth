<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="pageName" value="jstl.jsp" />
	<h3>${pageName}</h3>
	<c:set var="firstNum" value="10" />
	<c:set var="secondNum" value="20" />
	<c:set var="totalNum" value="${firstNum+secondNum}" />
	<input type="text" value="${totalNum}">
	<ul>
		<c:forEach var="seq" begin="1" end="10">
			<li>${seq}</li>
		</c:forEach>
	</ul>
</body>
</html>