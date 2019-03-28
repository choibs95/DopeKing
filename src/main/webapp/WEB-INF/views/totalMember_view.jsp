<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link rel="stylesheet" href="resources/css/total_m.css" type="text/css">
<link rel="stylesheet" href="resources/css/side_detail.css" type="text/css">
<title>Insert title here</title>
</head>
<body>
<%@include file="jspcss/ad_header.jsp"%>

<main>
    <div id="title">
        <h2>회원 관리</h2>
    </div>
    <hr/>
         <br><br><br>
         <div id="total_m">
          
		  <table id="member">
		  <form>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>생일</th>
				<th>성별</th>
				<th>핸드폰 번호</th>
				<th>주소</th>
				<th>가입일</th>
			</tr>
			<c:forEach items="${dtos }" var="dtos">
				<tr>
					<td>${dtos.userId }</td>
					<td><a href="member_content_view?userId=${dtos.userId }" >
					${dtos.userName }</a></td>
					<td>${dtos.userBirthday }</td>
					<td>${dtos.userGender }</td>
					<td>${dtos.userPhone }</td>
					<td>${dtos.userAddress }</td>
					<td>${dtos.userDate }</td>
				</tr>
			</c:forEach>
	</form>
	</table>
	<br><br><br>
	</main>
	<%@include file="jspcss/footer.jsp"%>
</body>
</html>