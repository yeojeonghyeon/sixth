<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, user-scalable=yes">
<title>Bonus List</title>
<style>
article.content{
	width: 100vw;
}
.contentTable{
	width: 100%;
}
.contentTable > thead.header{
	background-color: #4a0072;
	color: #ffffff;
}
.contentTable > thead.header th{
	vertical-align: text-top;
	height: 30px;
}

.contentTable > tbody.content tr:nth-child(even){
	background-color: #ba6b6c;
}
.contentTable > tbody.content tr:nth-child(odd){
	background-color: #ffcccb;
}
.contentTable > tbody.content td{
	text-align: center;
	color: #1a237e;
}
@media all and (min-width:0px) and (max-width:300px) {
	.contentTable{
		min-width: 300px;
	}
}

</style>
</head>
<body>
	<header>
		<h3>${param.bonusYear}'s 수당 리스트</h3>
	</header>
	<section>
		<article class="content">
			<h4>수당 상세 내역</h4>
			<table class="contentTable">
				<thead class="header">
					<tr>
						<th>성명</th>
						<th>수당명</th>
						<th>금액</th>
					</tr>
				</thead>
				<tbody class="content">
					<c:if test="${empty result}">
						<tr><td colspan=3>no data</td></tr>
					</c:if>
					<c:if test="${not empty result}">
						<c:forEach var="item" items="${result}">
							<tr>
								<td>${item.empNm}</td>
								<td>${item.detNm}</td>
								<td>${item.bonusAmt}</td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		</article>
	</section>
</body>
</html>