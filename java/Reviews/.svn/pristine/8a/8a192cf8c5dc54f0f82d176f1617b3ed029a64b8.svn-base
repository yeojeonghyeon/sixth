<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% session.invalidate(); %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 창</title>
<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css" />">
<script>
	$(function(){
	   $("#btnJoin").click(function(){
	      //회원가입 버튼을 누르면 join.do로 간다
	      document.loginForm.action="join.do";
	      document.loginForm.submit();
	   });
	});
</script>
<style>
   body{
      background-color:#ffe0ad;
   }
   form{
     width:500px;   
 	 left: 50%;
 	 position: absolute;
 	 top: 50%;
 	 margin-left: -250px;
 	 margin-top: -250px;

출처: https://aspdotnet.tistory.com/1015 [심재운 블로그]
   }
   td{
      font-weight:bold;
      background-color:#fff;
   }
   p{
   font-size:25px;
   }
   tr .form-control{
      width:250px;
   }
</style>
</head>
<body>



<form action="login.do" method="post" name="loginForm">
<table border="1" class="table table-bordered">
   <tr class="warning">
      <td colspan="2"><p class="text-center">로그인</p></td>
   </tr>
   <tr>
      <td align="center">아이디</td>
      <td><input type="text" name="userid" class="form-control"></td>
   </tr>
   <tr>
      <td align="center">비밀번호</td>
      <td><input class="form-control" type="password" name="userpw"></td>
   </tr>
   <tr>
      <td colspan="2" align="center"><input type="submit" value="로그인" class="btn btn-warning">
                              <input type="button" id="btnJoin" value="회원가입 "class="btn btn-warning">
</table>
</form>
</body>
</html>