<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="">
			<table>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<th>이미지</th>
					<td><input type="file" name="imageFile"></td>
				</tr>
				<tr>
					<th>마감일</th>
					<td><input type="date" name="date"></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" name="location"></td>
				</tr>
				<tr>
					<td colspan="2"><textarea rows="10" cols="20"></textarea>
				</tr>
			</table>
			<button>등록</button>
		</form>
	</div>
</body>
</html>