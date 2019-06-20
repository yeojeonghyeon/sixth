<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="member" class="com.scggi.servlet.temp.Member" />
	<jsp:setProperty name="member" property="id" value="hope" />
	<jsp:setProperty name="member" property="name" value="alie" />
	<jsp:setProperty name="member" property="pwd" value="drinkhope" />
	
	<jsp:useBean id="memberParam" class="com.scggi.servlet.temp.Member" />
	<jsp:setProperty name="memberParam" property="id" param="id" />
	<jsp:setProperty name="memberParam" property="name" param="name" />
	<jsp:setProperty name="memberParam" property="pwd" param="pwd" />
	
	<jsp:useBean id="memberAstrik" class="com.scggi.servlet.temp.Member" />
	<jsp:setProperty name="memberAstrik" property="*" />

	
	<div>
		<span>이름 :</span><span><jsp:getProperty name="member" property="name" /></span><br>
		<span>id :</span><span><jsp:getProperty name="member" property="id" /></span><br>
		<span>패스워드 :</span><span><jsp:getProperty name="member" property="pwd" /></span>
	</div>
	<div>
		<span>이름 :</span><span><jsp:getProperty name="memberParam" property="name" /></span><br>
		<span>id :</span><span><jsp:getProperty name="memberParam" property="id" /></span><br>
		<span>패스워드 :</span><span><jsp:getProperty name="memberParam" property="pwd" /></span>
	</div>
	<div>
		<span>이름 :</span><span><jsp:getProperty name="memberAstrik" property="name" /></span><br>
		<span>id :</span><span><jsp:getProperty name="memberAstrik" property="id" /></span><br>
		<span>패스워드 :</span><span><jsp:getProperty name="memberAstrik" property="pwd" /></span>
	</div>
</body>
</html>