<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
	#title{
			text-align: center;
		}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link rel="stylesheet" href="resources/css/style.css" type="text/css">
<link rel="stylesheet" href="resources/css/p_login.css" type="text/css">
<title>Insert title here</title>
<script type="text/javascript">
	function checkValue() {
		/* inputForm = eval("document.loginInfo"); */
		if (!document.loginInfo.jfId.value) {
			alert("���̵� �Է��ϼ���");
			document.loginInfo.jfId.focus();
			return false;
		}
		if (!document.loginInfo.jfPassword.value) {
			alert("��й�ȣ�� �Է��ϼ���");
			document.loginInfo.jfPassword.focus();
			return false;
		}
	}
	function goJoin_view() {
		location.href = "join_form";
	}
	function gotest_page() {
		location.href = "test_page";
	}
</script>
</head>
<%@include file="jspcss/header.jsp"%>

<body>

	<main>
	<div id="title">
		<h2>�α���</h2>
	</div>
	<hr />
	<br>
	
	<div id="login-input">

		<form name="loginInfo" method="post" action="login_controller"
			onsubmit="return checkValue()">
			<!-- �α��� -->
			<img id="icon1" src="resources/image/img/user-shape.png" width="19"
				height="19" /> &nbsp; <input id="useID" name="jfId"
				placeholder="���̵�" type="text" required class="validate"
				autocomplete="off"> <br> <br>
			<!--  ��� -->
			<img id="icon2" src="resources/image/img/vintage-key-outline.png"
				width="19" height="19" /> &nbsp; <input id="password"
				name="jfPassword" placeholder="��й�ȣ" type="password" required
				class="validate" autocomplete="off"> <br> <br> <br>
			<input id="l_button" type="submit" value="�α���"
				onclick="goJoin_view()" />


		</form>
	</div>
	</main>
	<%@include file="jspcss/footer.jsp"%>
</body>
</html>



