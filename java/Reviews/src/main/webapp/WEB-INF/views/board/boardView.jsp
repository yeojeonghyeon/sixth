<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/templates.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
	margin:200px;	
}
</style>
</head>
<body>
	<h2>게시글 보기</h2>
	<form name="boardForm" mehthod="post">
		<div>
			작성일자:<fmt:formatDate value="${boarddto.b_REGDATE}" pattern="yyyy-MM-dd HH:mm" />
		</div>
		<div>
			글 번호: <input type="text" name="B_NUMBER" id="number" value="${boarddto.b_NUMBER}">
		</div>
		<div>
			조회수: ${boarddto.b_VIEWCNT}
		</div>
		<div>
			제목 <input name="B_TITLE" id="title" size="80" value="${boarddto.b_TITLE}" >
		</div>
		<div>
			내용<textarea name="B_CONTENT" id="content" rows="10" cols="80">${boarddto.b_CONTENT}</textarea>
		</div>
		<div>
			이름<input name="B_WRITER" id="wirter" value="${boarddto.b_WRITER}">
		</div>
		<div>
			<input type="button" id="listBtn" value="목록으로" onclick="history.back()">
			<input type="button" id="modifyBtn" value="수정">
			<input type="button" id="deleteBtn" value="삭제">
		</div>
	</form>
	<script>
	$(document).ready(function() {
		$("#modifyBtn").click(function() {
			document.boardForm.action = "BoardUpdate.do";
			document.boardForm.submit();
		});
		
		$("#deleteBtn").click(function(){
			document.boardForm.action="BoardDelete.do";
			document.boardForm.submit();
		});
	});
</script>
</body>
</html>