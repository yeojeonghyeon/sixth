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
<c:set var="c" value="aaa" scope="request"></c:set>
	<ul>
		<c:if test="${not empty result}">
			<c:forEach items="${result}" var="item">
				<li>${item.foodName}</li>
				<li>${item["foodName"]}</li>
			</c:forEach>
		</c:if>
	</ul>
	<span>${info.name}</span><span>${info.age}</span>
	<br>
	<span>${info1.food.foodName}</span>
	<br>
	<span>${paramValues.seasons[0]}</span><span>${paramValues["seasons"][0]}</span>
	<span>${paramValues.seasons[1]}</span>
	<br>
	<span>${pageContext.request.contextPath}</span>
	<br>
	<span>${c}</span>
</body>
</html>