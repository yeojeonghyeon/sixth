<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Second Step</title>
</head>
<body>
	<div>
		<ul>
			<li>${sessionScope.id}</li>
			<li>${sessionScope.pwd}</li>
			<li>${sessionScope.favoriteFood}</li>
			<li>${sessionScope.favoriteSport}</li>
		</ul>
	</div>
</body>
</html>