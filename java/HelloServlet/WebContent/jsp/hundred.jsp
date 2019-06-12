<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.scggi.servlet.temp.Person" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<%
	Person p = (Person)request.getAttribute("person");
%>
<body>
	<header>
		<h3>1~100 합은?<%=request.getAttribute("result")%></h3>
		<h3>1~100 합은?${result}</h3>
	</header>
	<section>
		<article>
			<div>
				<h4>${requestScope.person.name} ${requestScope.person.weight}</h4>
			</div>
			<div>
				<h4>${requestScope.map.person.name} ${requestScope.map.person.weight}</h4>
			</div>
			<div>
				<h4><%=p.getName()%> <%=p.getWeight()%></h4>
			</div>							
		</article>
	</section>
</body>
</html>