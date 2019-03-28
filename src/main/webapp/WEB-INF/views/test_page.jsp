<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
 
	function idCheck() {
		
		location.href = "id_check";
		
		/* if (!document.userInfo.jfId.value) {
			document.getElementById('idCheck').innerHTML = '아이디를 입력해주세요';
			userInfo.jfId.focus()
			return false;
		 if ((document.userInfo.jfId.value)==(document.getElementById('aaa').value)) {
			document.getElementById('idCheck').innerHTML = '중복된 아이디 입니다.';
			alert("(document.getElementById('aaa').value)");
			return false; 
			
		
		} 

		if (document.userInfo.jfId.value) {
			document.getElementById('idCheck').innerHTML = '';
		} */
	}
</script>


</head>
<body>
	<h3>masterPage.jsp</h3>
		ID : ${dtos}<br>
		Value : ${document.getElementById('aaa').value}<br>
	<c:forEach items="${dtos}" var="dtos" >
		<tr>
			<td>아이디</td>
		</tr>
		<tr>
			<td id="aaa"><input type="text" id="aaa" value="${dtos.jfId }"></td>
		</tr>
	</c:forEach>
	<div id="wrap">
		<br> <br> <b><font size="6" color="gray">회원가입</font></b> <br>
		<br> <br>
		<form name="userInfo" action="join_result" method="post"
			onsubmit="return checkValue()">
			<table>
				<tr>
					<td id="title">아이디</td>
					<td><input id="jfId" type="text" name="jfId" maxlength="20"
						onblur="idCheck()">
						<p id="idCheck" style="color: red;" /></td>
				</tr>
			</table>
		</form>

</body>
</html>