<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./signUpAction" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id"> <button type="button" name="dupl">중복확인</button></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<th>비밀번호 확인</th>
				<td><input type="password" name="password2"></td>
			</tr>
			<tr>
				<th>회원구분</th>
				<td><input type="radio" name="type" value="s">판매자 &nbsp; <input type="radio" name="type" value="c">구매자
			</tr>
			<tr>
				<th>email</th>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name= "location"></td>
			</tr>
		</table>
		<button type="submit">회원가입</button>
		<button type="button" onclick="history.back()">취소</button>
	</form>
</body>
</html>