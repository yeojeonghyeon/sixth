<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<ul>
			<li>${id}</li>
			<li>${pwd}</li>
			<li>${sessionScope.id}</li>
			<li>${sessionScope.pwd}</li>
		</ul>
	</div>
	<form method="post" action="../SecondStepServlet">
		<input type="text" name="favoriteFood" value="" placeholder="좋아하는 음식">
		<input type="text" name="favoriteSport" value="" placeholder="좋아하는 스포츠">
		<input type="submit" value="전송">
	</form>
</body>
</html>