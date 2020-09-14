<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>addCustomer</title>
	<script>
		var result = "${affectedCount}";
		if ( result ) alert(result+"건이 추가 되었습니다");
	</script>
</head>
<body>
	<h1>
	</h1>
	<form action="addCustomer" method="post">
		<table>
			<thead>
				<tr>
					<th>고객ID</th>
					<th>고객명</th>
					<th>주소</th>
					<th>전화</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="text" name="custId" value="${customerVO.custId}"></td>
					<td><input type="text" name="custNm" value="${customerVO.custNm}"></td>
					<td><input type="text" name="address" value="${customerVO.address}"></td>
					<td><input type="text" name="phone" value="${customerVO.phone}"></td>
				</tr>
			</tbody>
		</table>
		<input type="submit" value="제출">
	</form>
</body>
</html>
