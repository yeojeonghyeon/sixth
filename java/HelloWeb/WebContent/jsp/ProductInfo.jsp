<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>       
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<h3>${requestScope.productName}</h3>
	<h3>${requestScope.productCode}</h3>
	<h3>${requestScope.productPrice}</h3>
	<c:if test="${ requestScope.productPrice > 10000 }">
		<h4>가격이 매우 비쌉니다.</h4>
	</c:if>
	<c:if test="${ param.firstNum - param.secondNum >= 0 }">
		<h4>${param.firstNum}</h4>
	</c:if>
	<c:if test="${ param.firstNum - param.secondNum < 0 }">
		<h4>${param.secondNum}</h4>
	</c:if>
</body>
</html>