<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#wrap {
	margin-left: auto;
	margin-right: auto;
	text-align: center;
}

table {
	margin-left: auto;
	margin-right: auto;
	border: 3px solid lightyellow;
}

td {
	border: 1px solid lightyellow;
}

#title {
	background-color: lightyellow;
}
</style>
</head>
<body>
<%@include file="jspcss/header.jsp"%>

	<div id="wrap">
		<br> <br> <b><font size="5" color="gray">도프킹의 가족이 되셨습니다.
		</font></b> <br> <br> <font color="blue">${userId }</font>님 가입을
		축하드립니다. <br> <br>
		<table>
			<form action="join" method="post">
				<tr>
					<td id="title">아이디</td>
					<td><input type="text" name="jfId" value="${userId }" readonly></td>
				</tr>

				<tr>
					<td id="title">비밀번호</td>
					<td><input type="password" name="jfPassword"
						value="${userPassword }" readonly></td>
				</tr>

				<tr>
					<td id="title">이름</td>
					<td><input type="text" name="jfName" value="${userName }" readonly></td>
				</tr>

				<tr>
					<td id="title">생일</td>
					<td><input type="text" name="jfBirthday" value="${userBirthday }" readonly></td>
				</tr>

				<tr>
					<td id="title">성별</td>
					<td><input type="text" name="jfGender" value="${userGender }" readonly></td>
				</tr>

				<tr>
					<td id="title">휴대전화</td>
					<td><input type="text" name="jfPhone" value="${userPhone }" readonly/></td>
				</tr>
				<tr>
					<td id="title">주소</td>
					<td><input type="text" name="jfAddress" value="${userAddress }" readonly/></td>
				</tr>
				<tr>
					<td id="title">e-mail</td>
					<td><input type="email" name="jfEmail" value="${userEmail }" readonly/></td>
				</tr>


				<input type="submit" value="확인">
			</form>
		</table>
	</div>
	
<%@include file="jspcss/footer.jsp"%>
</body>
</html>