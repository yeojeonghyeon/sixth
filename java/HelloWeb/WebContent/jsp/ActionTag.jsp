<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean class="com.helloworld.vo.Bean" id="bean" />
<jsp:setProperty name="bean" property="*" />
<jsp:getProperty name="bean" property="address" />
<jsp:getProperty name="bean" property="age" />
</body>
</html>