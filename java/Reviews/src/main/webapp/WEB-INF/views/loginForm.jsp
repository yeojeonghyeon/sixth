<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% session.invalidate(); %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>로그인 창</title>
<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
	$(function(){
	   $("#btnJoin").click(function(){
	      //회원가입 버튼을 누르면 join.do로 간다
	      document.loginForm.action="join.do";
	      document.loginForm.submit();
	   });
	});
</script>
	<link rel="stylesheet" href="../css/bootstrap.css">
<style>
body {
	background-color: #ffe0ad;
}

form {
	width: 500px;
}

td {
	font-weight: bold;
	background-color: #fff;
}

p {
	font-size: 25px;
}

tr .form-control {
	width: 250px;
}
</style>

</head>
<body>
	<center>
		<h2>로그인 화면</h2>
		<form action="login.do" method="post" name="loginForm">
			<table border="1">
				<tr>
					<td align="center">아이디</td>
					<td><input name="userid"></td>
				</tr>
				<tr>
					<td align="center">비밀번호</td>
					<td><input type="password" name="userpw"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="로그인"> <input type="button" value="회원가입"
						id="btnJoin">
			</table>
		</form>
	</center>
</body>
</html>