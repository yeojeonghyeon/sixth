<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>directive include</title>
<style>
article.menu_article{
	float: left;
	margin: 10px;
	width: 20%;
}
section.menu_section::after{
	content: '';
	display: block;
	clear: both;
}
</style>
</head>
<body>
	<header>
		<h3>철수's favorite menu</h3>
	</header>
	<section class="menu_section">
		<article class="menu_article">
			<h4>봄 음식</h4>
			<ul>
				<c:choose>
					<c:when test="${not empty spring}">
						<c:forEach items="${spring}" var="foodName">
							<li>${foodName}</li>
						</c:forEach>
					</c:when>
				</c:choose>
			</ul>
		</article>
		<article class="menu_article">
			<h4>여름 음식</h4>
			<ul>
				<c:choose>
					<c:when test="${not empty summer}">
						<c:forEach items="${summer}" var="foodName">
							<li>${foodName}</li>
						</c:forEach>
					</c:when>
				</c:choose>				
			</ul>
		</article>
		<article class="menu_article">
			<h4>가을 음식</h4>
			<ul>
				<c:choose>
					<c:when test="${not empty fall}">
						<c:forEach items="${fall}" var="foodName">
							<li>${foodName}</li>
						</c:forEach>
					</c:when>
				</c:choose>				
			</ul>
		</article>	
		<article class="menu_article">
			<h4>겨울 음식</h4>
			<ul>
				<c:choose>
					<c:when test="${not empty winter}">
						<c:forEach items="${winter}" var="foodName">
							<li>${foodName}</li>
						</c:forEach>
					</c:when>
				</c:choose>				
			</ul>
		</article>
	</section>
<div>
<!-- 		directive 지시자 -->
		<%@ include file="today.jsp" %>
<br>		
<%=String.format("%TY년 %Tm월 %Td일", now, now, now)%>
<br>
<!-- 		표준 액션 태그 -->
		<jsp:include page="today.jsp">
			<jsp:param name="param1" value="파라미터1" />
			<jsp:param name="param2" value="파라미터2" />
		</jsp:include>
		
		<c:import url="today.jsp">
			<c:param name="param1" value="파라미터1" />
			<c:param name="param2" value="파라미터2" />
		</c:import>
</div>		
</body>
</html>