<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>result jsp</title>
</head>
<body>

	<span><%=%></span>
	<span><%=%></span>

	<span>좋아하는 음식:${sessionScope.food}</span>
	<span>좋아하는 동물:${param.animal}</span>
</body>
</html>