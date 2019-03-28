<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link type="text/css" rel="stylesheet" href="resources/css/bstyle.css">
<title>Insert title here</title>
</head>
<body>

<%@include file="jspcss/ad_header.jsp"%>

	<main>
	<div id="title">
		<h2>FAQ</h2>
	</div>
	<hr />
	<br><br>
	<table class="board">
		<thead>
			<tr>
				<th scope="cols">질문유형</th>
				<th scope="cols">질문</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${board }" var="dto">

				<tr>					
					<th scope="row">${dto.pName }</th>
					<td><a href="bcontent_view?pId=${dto.pId }">${dto.pTitle }</a></td>					
				</tr>
			</c:forEach>
			<tr>
				<td colspan="3"><a href="write_view">글작성</a></td>
			</tr>
		</tbody>
	</table>
	</main>
	<br><br> 
	
	<%@include file="jspcss/footer.jsp"%>

</body>
</html>