<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="jspcss/ad_header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link type="text/css" rel="stylesheet" href="resources/css/bstyle.css">
<title>Insert title here</title>
</head>
<body>

<main>
	<div id="title">
		<h2>FAQ</h2>
	</div>
	<hr />
	<br><br>
	<table class="view">
	<thead>
		<form action="bmodify" method="post">
			<input type="hidden" name="pId" value="${bcontent_view.pId}">			
			<tr>
				<th> 질문유형 </th>
				<td> <input type="text" name="pName" value="${bcontent_view.pName}" size="95"></td>
			</tr>
			<tr>
				<th> 질문 </th>
				<td> <input type="text" name="pTitle" value="${bcontent_view.pTitle}" size="95"></td>
			</tr>
			</thead>
			<tbody>
			<tr>
				<th> 내용 </th>
				<td> <textarea rows="17" cols="95" name="pContent" >${bcontent_view.pContent}</textarea></td>
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="수정"> &nbsp;&nbsp;
				 <a href="board">목록보기</a> &nbsp;&nbsp;
				 <a href="bdelete?pId=${bcontent_view.pId}">삭제</a> &nbsp;&nbsp;</td>
			</tr>
		</form>
		</tbody>
	</table>
	</main>
	<br><br> 
<%@include file="jspcss/footer.jsp"%>
	
</body>
</html>