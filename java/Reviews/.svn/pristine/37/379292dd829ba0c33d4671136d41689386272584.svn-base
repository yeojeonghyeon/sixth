<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/templates.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	$(document).ready(function(){
		$("#btnSave").click(function(){
			document.boardForm.submit();
			location.href="BoardList.do";
		});
	});
</script>
<style>
body{
	margin:200px;
}
</style>
</head>
<body>
	<form name="boardForm" method="post" action="insertBoard.do">
		<div>
			제목<input name="B_TITLE" id="title" size="80" placeholder="제목을 입력하세요">
		</div>
		<div>
			내용<textarea name="B_CONTENT" id="content" rows="10" cols="80" placeholder="내용을 입력하세요"></textarea>
		</div>
		<div>
			이름<input name="B_WRITER" id="writer" placeholder="이름을 입력하세요">
		</div>
		<div>
			<button type="button" id="btnSave">작성</button>
			<button type="reset">취소</button>
		</div>
	</form>
</body>
</html>