<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script>
document.addEventListener("DOMContentLoaded", function(){
	document.getElementById("ajaxBtn").addEventListener("click", function(){
		var httpRequest = new XMLHttpRequest();
		httpRequest.onreadystatechange = function(){
			if ( httpRequest.readyState == XMLHttpRequest.DONE ){
				if ( httpRequest.status == '200' ){
					console.log(JSON.parse(httpRequest.responseText));
				}
			}
		};
		var custId = document.querySelector("#custId");
		var params = 'custId='+custId.value;
	    httpRequest.open('post', 'orderInfo.ajax');
		httpRequest.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
	    httpRequest.send(params);
	});
});
</script>
</head>
<body>
	<form>
		<input type="text" name="custId" id="custId" value="">
		<input type="button" value="ajax 요청" id="ajaxBtn">
	</form>
	<div id="container"></div>
</body>
</html>