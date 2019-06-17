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
		<h6>배열에서 꺼내오는 el</h6>
		<ul>
			<c:if test="${not empty students}">
				<c:forEach items="${students}" var="student">
					<li>${student.name} ${student.gender} ${student.hobby}</li>
				</c:forEach>
			</c:if>
		</ul>
	</div>
	<div>
		<h6>List에서 꺼내오는 el</h6>
		<ul>
		</ul>
	</div>
</body>
</html>