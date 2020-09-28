<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login V15</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="<c:url value='/resources/images/icons/favicon.ico'/>" />
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/vendor/bootstrap/css/bootstrap.min.css'/>" />
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css'/>" />
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css'/>" />
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/vendor/animate/animate.css'/>" />
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/vendor/css-hamburgers/hamburgers.min.css'/>" />
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/vendor/animsition/css/animsition.min.css'/>" />
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/vendor/select2/select2.min.css'/>" />
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/vendor/daterangepicker/daterangepicker.css'/>" />
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/util.css'/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/main.css'/>" />
<!--===============================================================================================-->
</head>
<body>
	<c:if test="${error eq 'true'}">
		<h3>Incorrect login name or password. Please try again</h3>
	</c:if>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-form-title" style="background-image: url(images/bg-01.jpg);">
					<span class="login100-form-title-1">
						Sign In
					</span>
				</div>
				<form name='loginForm' action="<c:url value='login' />" method='POST' class="login100-form validate-form">
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<span class="label-input100">Username</span>
						<input class="input100" type="text" name="username" placeholder="Enter username">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Password</span>
						<input class="input100" type="password" name="password" placeholder="Enter password">
						<span class="focus-input100"></span>
					</div>

					<div class="flex-sb-m w-full p-b-30">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								Remember me
							</label>
						</div>

						<div>
							<a href="#" class="txt1">
								Forgot Password?
							</a>
						</div>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Login
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
<!--===============================================================================================-->
	<script src="<c:url value='/resources/vendor/jquery/jquery-3.2.1.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resources/vendor/animsition/js/animsition.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resources/vendor/bootstrap/js/popper.js'/>"></script>
	<script src="<c:url value='/resources/vendor/bootstrap/js/bootstrap.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resources/vendor/select2/select2.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resources/vendor/daterangepicker/moment.min.js'/>"></script>
	<script src="<c:url value='/resources/vendor/daterangepicker/daterangepicker.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resources/vendor/countdowntime/countdowntime.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/resources/js/main.js'/>"></script>

</body>
</html>