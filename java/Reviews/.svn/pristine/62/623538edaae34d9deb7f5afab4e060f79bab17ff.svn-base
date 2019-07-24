<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/templates.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css" />">
<script>
   function fn_openBoardDetail(B_NUMBER, curPage){
      window.location.href="BoardView.do?B_NUMBER=" + B_NUMBER + "&curPage=" + curPage;
   }
   function fn_list(page){
      window.location.href="BoardList.do?curPage=" + page;
   }
</script>
<style>
#content{
   margin-top:100px;
   background-color: #e8ebf0;
}
table{
   width:1000px;
}
</style>
</head>
<body>
   <div id="content">
      <p>${map.count} 개의 게시글이 있습니다.</p>
      <p>현재 페이지 ${map.paging.curPage} </p>
      <table border="1" class="table table-bordered table-striped">
         <tr class="warning">
            <th>번호</th>
            <th>제목</th>
            <th>이름</th>
            <th>작성일</th>
            <th>조회수</th>         
         </tr>
         <c:forEach var="row" items="${map.list}">
            <tr style="background-color:#fff">
               <td>${row.B_NUMBER}</td>
               <td><a href="javascript:fn_openBoardDetail('${row.B_NUMBER}', '${map.paging.curPage}')"><c:out value="${row.B_TITLE}" /></a></td>
               <td>${row.B_WRITER}</td>
               <td><fmt:formatDate value="${row.B_REGDATE}" pattern="yyyy-MM-dd" /></td>
               <td>${row.B_VIEWCNT}</td>
            </tr>
         </c:forEach>
         <tr>
            <td colspan="5">
            <button type="button"  onclick="location='Board.do'" id="btnWriter" class="btn btn-warning">글쓰기</button>
               <ul class="pagination">
                  <!-- 처음 페이지 이동 // 현재 페이지가 1보다 크면 처음을 출력-->
                  <li>
                     <c:if test="${map.paging.curPage > 1}">
                        <a href="javascript:fn_list('1')">[처음]</a>
                     </c:if>
                  </li>
                  <!-- 마지막 페이지 이동 // 현재 페이지 블럭이 1보다 크면 이전 출력-->
                  <li>
                     <c:if test="${map.paging.curBlock > 1}">
                        <a href="javascript:fn_list('${map.paging.prevPage}')">[처음]</a>
                     </c:if>
                  </li>
                  <!-- 하나의 블럭에서 반복문 수행 시작페이지부터 끝페이지까지 -->
                  <li>
                     <c:forEach var="num" begin="${map.paging.blockBegin}" end="${map.paging.blockEnd}">
                        <!-- 현재 페이지이면 하이퍼링크 제거 -->
                        <c:choose>
                           <c:when test="${num == map.paging.curPage}">
                              <span style="color: red">${num}</span>&nbsp;
                           </c:when>
                           <c:otherwise>
                              <a href="javascript:fn_list('${num}')">${num}</a>
                           </c:otherwise>
                        </c:choose>
                     </c:forEach>
                  </li>
                  <!-- 다음 페이지 블록으로 이동 : 현재 페이지 블록이 전체 페이지 블럭보다 작거나 같으면 다음 출력 -->
                     <li>
                        <c:if test="${map.paging.curBlock <= map.paging.totalBlock}">
                           <a href="javascript:fn_list('${map.paging.nextPage}')">[다음]</a>
                        </c:if>
                     </li>
                     <li>
                        <c:if test="${map.paging.curPage < map.paging.totalPage}">
                           <a href="javascript:fn_list('${map.paging.totalPage}')">[끝]</a>
                        </c:if>
                     </li>
               </ul>
            </td>
         </tr>
      </table>
   </div>
</body>
</html>