<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>       
<c:set var="productCode" value="${param.productCode}" scope="request" />
<c:set var="productName" value="${param.productName}" scope="request" />
<c:set var="productPrice" value="${param.productPrice}" scope="request" />
<jsp:forward page="./ProductInfo.jsp" />