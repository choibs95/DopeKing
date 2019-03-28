<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link rel="stylesheet" href="resources/css/p_join.css" type="text/css">
<title>Insert title here</title>
<script type="text/javascript">
	function goModify() {
		document.form.action="member_modify";
		document.form.submit();
	}
	function goDelete() {
		location.href="member_delete";
	}
</script>
</head>
<%@include file="jspcss/us_header.jsp"%>

<body>
	<main>
	
	<div id="title">
		<h2>회원정보 확인</h2>
	</div>
	<hr />
	
	
	<div id="login-input">

	<img src="resources/image/img/user-shape.png" width="40" height="40"/><br><br>

	<a>"<b></font></b><font color="blue">${dto.userName }</font>"님 회원정보</a><br><br><br>
		<form name="form" method="post">
		<!-- 이름 -->
		이름&nbsp;&nbsp;&nbsp;&nbsp;<input id="name" type="text" name="jfId" value="${dto.userName }" readonly="readonly"/> <br><br>
		<!--생일-->
 		생일&nbsp;&nbsp;&nbsp;&nbsp;<input id="name" type="text" name="jfBirthday" value="${dto.userBirthday }" readonly="readonly"/> <br><br>
		<!-- 성별 -->
		성별&nbsp;&nbsp;&nbsp;&nbsp;<input id="name" type="text" name="jfGender" value="${dto.userGender }" readonly="readonly"> <br><br>
		<!-- 휴대폰 -->
		휴대폰 <input id="name" type="text" name="jfPhone" value="${dto.userPhone }"> <br><br>
		<!-- 주소 -->
		주소&nbsp;&nbsp;&nbsp;&nbsp;<input id="name" type="text" name="jfAddress" value="${dto.userAddress }"> <br><br>
		<!-- 이메일  -->
		e-mail&nbsp;&nbsp;<input id="name" type="text" name="jfEmail" value="${dto.userEmail }"> <br><br>
		<!-- 가입일 -->
		가입일&nbsp;<input id="name" type="text" name="jfDate" value="${dto.userDate }" > <br><br><br><br>


		<input type="button" name="btn_modify" value="수정" onclick="goModify()">
		<input type="button" name="btn_delete" value="회원 탈퇴" onclick="goDelete()">             

			</form>
			</div>
		</main>
	</table> 
	
	<%@include file="jspcss/footer.jsp"%>
</body>
</html>