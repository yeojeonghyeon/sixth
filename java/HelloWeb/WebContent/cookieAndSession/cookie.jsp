<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Cookie is here</title>
</head>
<body>
	<div>
		<label for="paramUl"> 파라메터 </label>
		<ul>
			<li>${param.favoriteFood}</li>
			<li>${param.favoriteSport}</li>
		</ul>
		<ul>
			<li><%=request.getParameter("favoriteFood")%></li>
			<li><%=request.getParameter("favoriteSport")%></li>
		</ul>		
	</div>
	<div>
		<label for="paramUl"> cookie </label>		
		<ul>
			<li>${cookie.favoriteFood.value}</li>
			<li>${cookie.favoriteSport.value}</li>
		</ul>
	</div>
</body>
</html>