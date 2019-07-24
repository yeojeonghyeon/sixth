<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>꿀단지 : 회원가입</title>
<script src="<c:url value="http://code.jquery.com/jquery-3.2.1.min.js"/>" ></script>
<script src="<c:url value="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.0/jquery.validate.min.js"/>" ></script> 
<script src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.11.0/additional-methods.min.js"/>" ></script> 
<script src="<c:url value="/resources/js/homeJs.js" />"></script>
<script src="<c:url value="/resources/js/validation.js"/>"></script>

<link rel="stylesheet" href="<c:url value="/resources/css/homeStyleCss.css" />">
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css" />">
<style>
/* 회원가입 테이블 상하 가운데정렬 */
section{
	margin: 200px 0 200px 0;
	background: #f5f7fa;
}	
/* 회원가입 테이블 가운데정렬 */
td{
	vertical-align:middle;
	background-color:#ffffff;
}

/* validation에러 텍스트 수정 */
.error{
	color:#ff0000;
	margin:0 0 0;
	font-size:11px;
}

/* 회원가입테이블 줄맞춤 */
tbody tr td p{
	text-align:center;
	margin:5px 0 0 0;
}
</style>
</head>

<body>
	<div class="nav_wrapper"> 
	  <!--<a class="menu-link" href="#menu"></a>-->
	  
	  <div class="spinner-master">
	    <input type="checkbox" id="spinner-form" />
	    <label for="spinner-form" class="spinner-spin">
	    <div class="spinner diagonal part-1"></div>
	    <div class="spinner horizontal"></div>
	    <div class="spinner diagonal part-2"></div>
	    </label>
	  </div>
	  <a href="#search_box" class="btn" id="search"></a>
	  <a href="login.do" class="btn" id="login"><img src="<c:url value="/resources/images/로그인.png"/>" style="width:30px; height:30px;"/></a>  
	  <header>
	     <div id="headermain">
	        <a href="main"><img src="<c:url value="/resources/images/꿀딴지.png"/>" align="middle">꿀딴지</a>
	        <a href="Board.do">게시글 작성</a>      
	        <a href="BoardList.do">게시글 목록</a>      
	     </div>
	  </header>
	  <nav id="menu" class="menu">
	    <ul class="dropdown">
	      <li ><a href="#Link" title="Link">전자제품</a>
	        <ul >
	          <li ><a href="#Link" title="Link">가전제품</a></li>
	          <li ><a href="#Link" title="Link">카메라</a></li>
	          <li ><a href="#Link" title="Link">PC</a></li>
	          <li ><a href="#Link" title="Link">휴대폰</a></li>
	        </ul>
	      </li>
	      <li ><a href="#Link" title="Link">패션잡화</a>
	        <ul >
	          <li ><a href="#Link" title="Link ">의류</a></li>
	          <li ><a href="#Link" title="Link">가방</a></li>
	          <li ><a href="#Link" title="Link">악세사리</a></li>
	          <li ><a href="#Link" title="Link">신발</a></li>
	        </ul>
	      </li>
	      <li ><a href="#Link" title="Link">반려동물용품</a>
	        <ul >
	          <li ><a href="#Link" title="Link">사료</a></li>
	          <li ><a href="#Link" title="Link">간식</a></li>
	          <li ><a href="#Link" title="Link">용품</a></li>
	        </ul>
	      </li>
	      <li ><a href="#Link" title="Link">뷰티</a>
	        <ul >
	          <li ><a href="#Link" title="Link">스킨케어</a></li>
	          <li ><a href="#Link" title="Link">향수</a></li>
	          <li ><a href="#Link" title="Link">메이크업</a></li>
	          <li ><a href="#Link" title=" Link">도구</a></li>
	        </ul>
	      </li>
	      <li ><a href="#Link" title="Link">QNA</a></li>
	    </ul>
	  </nav>
	  <form class="search_box" id="search_box" action="/search/">
	    <input name="search_criteria" placeholder="Search here" value="" type="text">
	    <input class="search_icon" value="Search" type="submit">
	  </form>
	</div>
	<section>
  <form name="join" id="signForm" onsubmit="return validate();" method="post" action="join.do">
     
     <br>
    <table border="1" align="center" class="table table-bordered" style="width:500px;">
        <tr class="warning">
            <td colspan="2" align="center" bgcolor="#CED8F6"><b>회원 기본 정보</b></td>
        </tr>
        <tr>
            <td><p>아이디:</p></td>
            <td><input type="text" name="memberId" id="memberId" size="20" maxlength="12" class="form-control" placeholder="5~12자의 영문 소문자, 숫자를 입력해주세요.">
 
        <tr>
            <td><p>비밀번호:</p></td>
            <td><input type="password" name="memberPw" id="memberPw" maxlength="18" class="form-control" placeholder="6~18자의 영문 대소문자, 숫자를 입력해주세요.">
        </tr>
 
        <tr>
            <td><p>비밀번호 확인:</p></td>
            <td><input type="password" name="checkPw" id="checkPw" maxlength="18" class="form-control" placeholder="6~18자의 영문 대소문자, 숫자를 입력해주세요."></td>
        </tr>
 
        <tr>
            <td><p>이름:</p></td>
            <td><input type="text" name="memberName" id="memberName" class="form-control"></input></td>
        </tr>
        
        <tr>
            <td><p>닉네임:</p></td>
            <td><input type="text" name="memberNickName" id="memberNickName" class="form-control" placeholder="2자 이상 입력해주세요."></input></td>
        </tr>
        
        <tr>
            <td><p>연락처:</p></td>
            <td><input type="text" name="memberCel" id="memberCel" class="form-control" placeholder="-을 제외한 숫자만 입력해주세요.">
        </tr>
        
        <tr>
            <td><p>이메일:</p></td>
            <td><input type="text" name="memberEmail" id="memberEmail" class="form-control">
        </tr>
    </table>
    <p align="center">
        <input type="submit" id="signUp" name="submit" value="회원 가입" class="btn btn-warning"></input>
        <input type="reset" name="reset" value="다시 입력" class="btn btn-warning"></input>
    </p>
    </form>
</section>
</body>
</html>