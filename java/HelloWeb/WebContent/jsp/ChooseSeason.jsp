<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Choose Season</title>
</head>
<body>
	<ul>
		<c:if test="${not empty result}">
			<c:forEach items="${result}" var="item">
				<li>${item.foodName}</li>
				<li>${item["foodName"]}</li>
			</c:forEach>
		</c:if>
	</ul>	
</body>
</html>