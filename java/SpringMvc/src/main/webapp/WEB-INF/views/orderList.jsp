<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>주문 리스트</title>
    <link rel="stylesheet" href="<c:url value='/resources/vendor/bootstrap/css/bootstrap.min.css'/>">
    <!-- Font Awesome JS -->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css'/>" />
    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="<c:url value='/resources/vendor/jquery/jquery-3.2.1.min.js'/>"></script>
    <!-- Popper.JS -->
    <script src="<c:url value='/resources/vendor/bootstrap/js/popper.min.js'/>"></script>
    <!-- Bootstrap JS -->
    <script src="<c:url value='/resources/vendor/bootstrap/js/bootstrap.min.js'/>"></script>	
</head>

<body>
    <div class="wrapper">
    	<table class="table table-hover">
    		<thead>
				<tr>
	    			<th>주문ID</th>
	    			<th>고객명</th>
	    			<th>고객ID</th>
	    			<th>주문금액</th>
	    			<th>주문일자</th>
    			</tr>    		
    		</thead>
    		<tbody>
    			<c:if test="${not empty result}">
    				<c:forEach items="${result}" var="order">
    					<tr>
    						<td><c:out value="${order.ORD_ID}" /></td>
    						<td><c:out value="${order.CUST_NM}" /></td>
    						<td><c:out value="${order.CUST_ID}" /></td>
    						<td><c:out value="${order.TOT_AMT}" /></td>
    						<td><c:out value="${order.ORD_DT}" /></td>
    					</tr>
    				</c:forEach>
    			</c:if>
    		</tbody>
    	</table>
    </div>
</body>
</html>