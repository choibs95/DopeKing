<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="resources/css/nstyle.css">
<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link rel="stylesheet" href="resources/css/main.css" type="text/css">
<link rel="stylesheet" href="resources/css/style.css" type="text/css">
<link rel="stylesheet" href="resources/css/bootstrap.css">
<title>Insert title here</title>
</head>
<body>
<%@include file="jspcss/header.jsp"%>

	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="reply" method="post">
			<input type="hidden" name="pId" value="${reply_view.pId}">
			<input type="hidden" name="pGroup" value="${reply_view.pGroup}">
			<input type="hidden" name="pStep" value="${reply_view.pStep}">
			<input type="hidden" name="pIndent" value="${reply_view.pIndent}">
			<tr>
				<td> 번호 </td>
				<td> ${reply_view.pId} </td>
			</tr>
			<tr>
				<td> 히트 </td>
				<td> ${reply_view.pHit} </td>
			</tr>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="pName" value="${reply_view.pName}"></td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="pTitle" value="${reply_view.pTitle}"></td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea rows="10"  name="pContent">${reply_view.pContent}</textarea></td>
			</tr>
			<tr >
				<td colspan="2"><input type="submit" value="답변"> <a href="list" >목록</a></td>
			</tr>
		</form>
	</table>
	<%@include file="jspcss/footer.jsp"%>
	
</body>
</html>