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
	<div>
		<h5>배열에서 꺼내오는 el</h5>
		<ul>
			<c:if test="${not empty students}">
				<c:forEach items="${students}" var="student">
					<li>${student.name} ${student.gender} ${student.hobby}</li>
				</c:forEach>
			</c:if>
		</ul>
		<span>${students[0].name} ${students[1].name} ${students[2].name} ${students[3].name} ${students[4].name}</span>
	</div>
	<div>
		<h5>List에서 꺼내오는 el</h5>
		<ul>
			<c:if test="${not empty list}">
				<c:forEach items="${list}" var="item">
					<li>${item.name} ${item.gender} ${item.hobby}</li>
				</c:forEach>
			</c:if>		
		</ul>
	</div>
</body>
</html>