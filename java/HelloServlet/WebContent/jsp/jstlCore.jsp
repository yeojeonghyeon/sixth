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
	<c:catch var="e">
		<c:set var="num" value="100" />
		<c:set var="sum" value="${param.num1+param.num2}" />
		<h3>${num}</h3>
		<h3>${param.num1}+${param.num2}=${sum}</h3>
		
		<c:set var="firstOp" value="7" />
		<c:set var="secondOp" value="9" />
		<c:set var="result" value="${firstOp+secondOp}" />
		<h3>${firstOp}*${secondOp}=${result}</h3>
		
		<c:if test="${param.num1-param.num2>=0}">
			${param.num1}
		</c:if>
		<c:if test="${param.num1-param.num2<0}">
			${param.num2}
		</c:if>
		
		<c:choose>
			<c:when test='${param.type == "A"}'>
				hello world
			</c:when>
			<c:when test='${param.type == "B"}'>
				good bye world
			</c:when>
			<c:otherwise>
				who are you?
			</c:otherwise>
		</c:choose>
		
		<ul>
			<c:forEach var="index" begin="1" end="10">
				<li>${index}</li>
			</c:forEach>
		</ul>
		<ul>
			<c:forTokens var="str" items="apple banana tomato mango" delims=" ">
				<li>${str}</li>
			</c:forTokens>
		</ul>
			<%double result = Integer.parseInt(request.getParameter("num1"))/(double)Integer.parseInt(request.getParameter("num2"));%>
			<p>나누기 결과는 ? <%=result%></p>
	</c:catch>
	<c:if test="${e != null}">
		<p>에러메시지는 ${e.message}</p>
	</c:if>
	
	<c:url var="today" value="today.jsp">
		<c:param name="param1" value="파라미터1" />
		<c:param name="param2" value="파라미터2" />
	</c:url>
	<c:import url="${today}" />
	
	<p>안녕하세요 <c:out value="${param.id}" default="guest" />님</p>
		
</body>
</html>