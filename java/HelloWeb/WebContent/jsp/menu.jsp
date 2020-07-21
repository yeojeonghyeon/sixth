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
<!-- 		directive 지시자 -->
		<%@include file="today.jsp"%>
<br>		
<%=String.format("%TY년 %Tm월 %Td일", now, now, now)%>
<br>
<!-- 		표준 액션 태그 -->
		<jsp:include page="today.jsp">
			<jsp:param name="param1" value="파라미터1" />
			<jsp:param name="param2" value="파라미터2" />
		</jsp:include>
		<br>
		<c:import url="today.jsp">
			<c:param name="param1" value="파라미터11" />
			<c:param name="param2" value="파라미터22" />
		</c:import>
</body>
</html>