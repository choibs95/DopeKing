<%-- <%@page import="com.java.login_test.dto.JDto"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인/회원가입 처리화면 - MyBatis</title>
</head>

<%
	request.setCharacterEncoding("UTF-8");
%>

<body>
	
	${userId }
	${userPassword }
	${dto.userPassword }
	<c:if test="${userId eq 'admin' }">
	<c:if test="${dto.userPassword eq userPassword }">
			<script>
				alert('관리자로 로그인 하셨습니다');
				location.href = "master_page";
			</script>
		</c:if>
		<c:if test="${dto.userPassword ne userPassword }">
			<script>
				alert('비밀번호를 확인해 주세요');
				location.href = "login_form";
			</script>
		</c:if>
	</c:if>
	<c:if test="${userId ne 'admin' }">
		<c:if test="${dto.userPassword eq userPassword  }">
			<script>
				alert('로그인을 성공하였습니다');
				location.href = "login_view";
			</script>
		</c:if>
		<c:if test="${dto.userPassword ne userPassword  }">
			<script>
				alert('비밀번호를 확인해 주세요');
				location.href = "login_form";
			</script>
		</c:if>
	</c:if>
		<c:if test="${empty userId }">
			<script>
				alert('아이디가 없습니다');
				location.href = "login_form";
			</script>
		</c:if>


</body>
</html>