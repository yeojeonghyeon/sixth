<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<span>${initParam.DB_NAME}</span>
	<span>${initParam["DB_NAME"]}</span>
	<span>${pageContext.request.requestURI}</span>
	<span>${pageContext.request.contextPath}</span>
</body>
</html>