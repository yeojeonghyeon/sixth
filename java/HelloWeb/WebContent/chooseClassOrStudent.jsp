<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>chooseClassOrStudent Presentation</title>
<style>
	.main_section h3{
		text-align: center;
	}
	.container_div{
		display: flex;
		flex-direction: column;
		justify-content: space-around;
		align-items: center;
	}
	.container_div .item{
		width: 25%;
		border: 1px solid #bbb;
		border-radius: 5px;
		padding-left: 5px;
	}
</style>
</head>
<body>
	<header>
		<h3>HelloServlet Presentation</h3>
	</header>
	<section class="main_section">
		<h3>${param.classOrStudent} <%=request.getParameter("classOrStudent")%></h3>
		<article class="main_article">
			<ul>
				<c:if test="${not empty result}">
					<c:forEach items="${result}" var="item">
						<li>${item}</li>
					</c:forEach>
				</c:if>
			</ul>		
		</article>
	</section>
</body>
</html>