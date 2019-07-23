<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 가입</title>
</head>
<body>
	<form name="joinForm" onsubmit="return validate();" method="post" action="memberJoin.do">
		<!-- enctype이 있으면 값이 안넘어간다. -->
		<br>
		<table border="1" align="center">
			<tr>
				<td colspan="2" align="center" bgcolor="#CED8F6"><b>회원 기본 정보</b></td>
			</tr>
			<tr>
				<td align="center"><b>아이디:</td>
				<td><input type="text" name="m_id" id="memberId" size="20" maxlength="12"></input>&nbsp4~12자의 영문 대소문자와 숫자로만 입력</td>
			</tr>
			<tr>
				<td align="center"><b>비밀번호:</td>
				<td><input type="password" name="m_pw" id="memberPw" size="21" maxlength="12"></input>&nbsp4~12자의 영문 대소문자와 숫자로만 입력</td>
			</tr>
			<tr>
				<td align="center"><b>비밀번호확인:</td>
				<td><input type="password" name="checkuPw" id="checkuPw" size="21" maxlength="12"></td>
			</tr>
			<tr>
				<td align="center"><b>이름:</td>
				<td><input type="text" name="m_name" id="memberName" size="25"></input></td>
			</tr>
			<tr>
				<td align="center"><b>닉네임:</td>
				<td><input type="text" name="m_nickName" id="memberNickName" size="25"></input></td>
			</tr>
			<tr>
				<td align="center"><b>번호:</td>
				<td><input type="text" name="m_cel" id="memberCel" size="25"></input>&nbsp예) id@domain.com</td>
			</tr>
			<tr>
				<td align="center"><b>메일주소:</td>
				<td><input type="text" name="m_email" id="memberEmail" size="25"></input>&nbsp예) id@domain.com</td>
			</tr>
		</table>
		<br>
		<br>

		<p align="center">
			<input type="submit" name="submit" value="회원 가입">
			</input> <input type="reset" name="reset" value="다시 입력"></input>
		</p>
	</form>
</body>
</html>