<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty param.num}">
		<c:forEach items="${arr}" var="item" varStatus="status" begin="0" end="${param.num-1}">
			<p>${status.count} : ${item}</p>
		</c:forEach>
	</c:if>
</body>
</html>