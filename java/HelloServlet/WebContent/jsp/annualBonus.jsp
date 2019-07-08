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
			<c:if test="${not empty result}">
				<c:forEach items="${result}" var="bonus">
					<li>${bonus.empNm} ${bonus.bonusCd} ${bonus.detNm} ${bonus.bonusAmt}</li>
				</c:forEach>
			</c:if>
		</ul>
	</div>
</body>
</html>