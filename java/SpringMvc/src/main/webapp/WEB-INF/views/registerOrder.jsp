<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Register Order</title>
<style>
.content-body {
	display: flex;
	flex-direction: row;
	justify-content: space-between;
	background-color: grey;
}
.content-body > .content-left, .content-body > .content-right {
	border: 1px solid;
	width: 50%; 
}
</style>
</head>
<body>
	<header><h1>우리들 서점 상품 주문</h1></header>
	<nav></nav>
	<article class="content-body">
		<section class="content-left">
			<h4>고객 리스트</h4>
			<div>
				<table>
					<thead>
						<tr>
							<th>고객ID</th>
							<th>고객명</th>
							<th>주소</th>
							<th>전화번호</th>							
						</tr>
					<thead>
					<tbody>
						<c:forEach var="customer" items="${customers}">
							<tr>
								<td>${customer.custId}</td>
								<td>${customer.custNm}</td>
								<td>${customer.address}</td>
								<td>${customer.phone}</td>								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</section>
		<section class="content-right">
			<h4>주문 하기</h4>
			<div></div>
			<div></div>
			<div></div>
		</section>
	</article>
</body>
</html>