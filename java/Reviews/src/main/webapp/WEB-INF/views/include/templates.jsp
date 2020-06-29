<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Responsive Auto Show/Hide Toggle Menu Demo</title>
<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="<c:url value="/resources/js/homeJs.js" />"></script>

<link rel="stylesheet" href="<c:url value="/resources/css/homeStyleCss.css" />">
<style>
section{
   margin: 200px 0 200px 0;
   background: #f5f7fa;
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
	  <a href="#search_box" class="btn" id="search">&#9740;</a>
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
</body>
</html>