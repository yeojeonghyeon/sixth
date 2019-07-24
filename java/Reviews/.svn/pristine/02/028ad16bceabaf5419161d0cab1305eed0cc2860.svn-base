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
	function categorySelect(e){
		var electronics=["가전제품","카메라","PC","휴대폰"];
		var petItems=["사료","간식","용품"];
		var fashionItems=["의류","가방","악세사리","신발"];
		var beauty=["스킨케어","향수","메이크업","도구"];
		var target=document.getElementById("DetailsCategory");
		
		if(e.value == "electronics") var d = electronics;
		  else if(e.value == "petItems") var d = petItems;
		  else if(e.value == "fashionItems") var d = fashionItems;
		  else if(e.value == "beauty") var d = beauty;
		
		  target.options.length = 0;
		  for (x in d) {
			    var opt = document.createElement("option");
			    opt.value = d[x];
			    opt.innerHTML = d[x];
			    target.appendChild(opt);
			  } 
	}
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
			 <select id="category" onchange="categorySelect(this)">
	             <option selected>-----------</option>
	             <option value="electronics">전자제품</option>
	             <option value="petItems">반려동물용품</option>
	             <option value="fashionItems">패션잡화</option>
	             <option value="beauty">뷰티</option>
       		 </select>
       		 <select id="DetailsCategory">
       		 	<option>-----------</option>
       		 </select>
		</div>
		<div>
			내용<textarea name="B_CONTENT" id="content" rows="10" cols="80" placeholder="내용을 입력하세요"></textarea>
		</div>
		<div>
		   별점<input type="radio" name="starPoint" value="5">★★★★★
			<input type="radio" name="starPoint" value="4">★★★★
			<input type="radio" name="starPoint" value="3">★★★
			<input type="radio" name="starPoint" value="2">★★
			<input type="radio" name="starPoint" value="1">★
		</div>
		<div>
			<button type="button" id="btnSave">작성</button>
			<button type="reset">취소</button>
		</div>
	</form>
</body>
</html>