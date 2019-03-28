<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@include file="jspcss/ad_header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="resources/css/bstyle.css">
<title>Insert title here</title>
</head>
<body>
<div id="title">
<h2>FAQ</h2>
</div>
	<table class="write">
	<thead>
		<form action="bwrite" method="post">
			<tr>
				<th>질문유형</th>
				<td><input type="text" name="pName" size="95"></td>				
			</tr>
			<tr>
			<th>질문</th>
				<td><input type="text" name="pTitle" size="95"></td>
				</tr>
			</thead>
			<tbody>
			<tr>
			<th>내용</th>
				<td colspan="2">
				<textarea rows="17" name="pContent" cols="95"></textarea>
				</td>
			</tr>			
			<tr>
				<td colspan="2"><input type="submit" value="입력">
					&nbsp;&nbsp; <a href="adboard">목록보기</a></td>
			</tr>
			</tbody>
		</form>
	</table>
</body>
</html>
<%@include file="jspcss/footer.jsp"%>