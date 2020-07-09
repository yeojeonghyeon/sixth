<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
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
		<h3>사용자 정보 입력 창</h3>
		<article class="main_article">
			<form method="post" action="HelloServlet">
				<div class="container_div">
					<div class="item"><span>이름 : </span><input type="text" name="user_name" value="${userName}"></div>
					<div class="item"><span>나이 : </span><input type="text" name="user_age" value="${userAge}"></div>
					<div class="item">
						<span>성별 : </span>
						<input type="radio" name="user_gender" value="male" ${userGender=="male"?"checked":""}><label for="male">Male</label>
						<input type="radio" name="user_gender" value="female" ${userGender=="female"?"checked":""}><label for="female">Female</label>
					</div>
					<div class="item">
						<input type="submit" value="제출">
					</div>
				</div>
			</form>
		</article>
	</section>
</body>
</html>