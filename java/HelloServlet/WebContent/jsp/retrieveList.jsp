<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
List<HashMap<String, String>> result = (List<HashMap<String, String>>)request.getAttribute("result");
String kind = (String)request.getAttribute("rKind");
%>
	<ul>
	<%for(Map<String, String> e : result){%>
		<li><%=kind.equals("subject")?e.get("subject"):e.get("user")%></li>
	<%}%>
	</ul>
</body>
</html>