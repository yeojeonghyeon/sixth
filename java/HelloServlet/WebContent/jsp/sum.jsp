<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script>
</script>
</head>
<body>
<%!int total = 0;%>
<%
	for(int i=0; i<101; i++){
		total += i;
	}
%>
	<header>
		<h3>1+2+3+.....+100=<%=total%></h3>
	</header>
</body>
</html>