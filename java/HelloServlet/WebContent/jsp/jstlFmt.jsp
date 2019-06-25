<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.Date" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>JSTL format</title>
</head>
<body>
<%
 	Date date = new Date();
 	request.setAttribute("date", date);
%>
	<c:set var="date" value="<%=new Date()%>" scope="page" />
	<c:set var="firstStr" value="i love you. i hate you. i like you." scope="page" />
	<c:set var="secondStr" value="hate" scope="page" />
	<c:set var="str" value=" hate " scope="page" />
	<c:set var="nonEscapedStr" value="this value<abc>hello wolrd</abc>" scope="page" />
	<header>
		<h2>jstl example</h2>
		<nav>
			<ul>
				<li><a href="../index.html">홈으로</a></li>
			</ul>
		</nav>
	</header>
	<section>
		<article>
			<h4>formatDate</h4>
			<div>
				<p>페이지 스코프 : <fmt:formatDate value="${pageScope.date}" /></p>
				<p>리퀘스트 스코프 : <fmt:formatDate value="${requestScope.date}" /></p>
				<p>세션 스코프 : <fmt:formatDate value="${sessionScope.date}" /></p>
			</div>
		</article>
		<article>
			<h4>formatNumber</h4>
			<div>
				<p>내 통장 잔고 : <fmt:formatNumber value="1532356752" groupingUsed="true" /></p>
				<p>원주율 : <fmt:formatNumber value="3.14158" pattern="#.##" /></p>
				<p>내 학점 : <fmt:formatNumber value="3" pattern="#.00" /></p>
				<p>내 학점 : <fmt:formatNumber value="3" pattern="#.##" /></p>
				<p>월급 : <fmt:formatNumber value="15000000" type="currency" /></p>
				<p>세율 : <fmt:formatNumber value="0.05" type="percent" /></p>
			</div>
		</article>
		<article>
			<h4>functions</h4>
			<div>
				<p>${str}:${fn:trim(str)} ${fn:toUpperCase(str)}</p>
				<p>${nonEscapedStr}</p>
				<p><c:out value="${nonEscapedStr}" escapeXml="true"/></p>
			</div>
		</article>
	</section>
	<footer>
		<h4>이 저작물은 저작권법에 보호받지 않습니다.</h4>
	</footer>
</body>
</html>