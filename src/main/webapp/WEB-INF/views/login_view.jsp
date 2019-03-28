<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link rel="stylesheet" type="text/css" href="resources/css/login_view.css">
<html>
<head>
<style>
body {
	text-align: center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%@include file="jspcss/us_header.jsp"%>

<script type="text/javascript">
	function goMember_view() {
		location.href = "member_view";
	}
	function goLogout() {
		location.href = "logout_controller";
	}
</script>

</head>
<body>
	<main>
	<div  id="login-input">
		<h2>도프킹 스토어에 오신걸 환영합니다. </h2>
		<br>
		<img src="resources/image/img/dpstore.png" width="300" height="300"/>
		<br><br><br>
		
		<input id="j_button" type="button" value="회원정보" onclick="goMember_view()"> 
		<input id="l_button" type="button" value="로그아웃" onclick="goLogout()"> 
		
		
		</div>
	</main>
		<%@includefile="jspcss/us_footer.jsp"%>
</body>
</html>







