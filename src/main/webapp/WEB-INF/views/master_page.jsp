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

<script type="text/javascript">
	function goLogout() {
		location.href = "logout_controller";
	}
	function goTotalMember_view() {
		location.href = "totalMember_view";
	}
	function goMember_view() {
		location.href = "member_view";
	}
</script>
</head>
<body>
	 <%@include file="jspcss/ad_header.jsp"%>
	<main>
		<div id="login-input">
		<h2>관리자페이지로 로그인 되었습니다.</h2>
	
		<img src="resources/image/img/login_icon.png" width="150" height="150" />
		<br><br><br> 
		<input id="j_button" type="button" value="관리자정보"
			onclick="goMember_view()">
		</div>
	</main>

	<%@include file="jspcss/ad_footer.jsp"%>

</body>
</html>







