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
	<ul>
<%
	Cookie[] cookies = request.getCookies();
	for(Cookie cookie : cookies){%>
		<li>쿠키이름: <%=cookie.getName()%> 값:<%=cookie.getValue()%></li>
<%	}
%>
	</ul>
	<ul>
		<c:choose>
			<c:when test="${not empty cookie}">
				<c:forEach items="${cookie}" var="eachCookie">
					<li>${eachCookie.key} ${eachCookie.value.value}</li>
				</c:forEach>
			</c:when>
		</c:choose>
	</ul>
</body>
</html>