<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@include file="jspcss/header.jsp"%>
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
	<table class="view">
	<thead>
					
			<tr>
				<th> 질문유형 </th>
				<td> <input type="text" name="pName" value="${ucontent_view.pName}" size="95" readonly></td>
			</tr>
			<tr>
				<th> 질문 </th>
				<td> <input type="text" name="pTitle" value="${ucontent_view.pTitle}" size="95" readonly></td>
			</tr>
			</thead>
			<tbody>
			<tr>
				<th> 내용 </th>
				<td> <textarea rows="17" cols="95" name="pContent" readonly>${ucontent_view.pContent}</textarea></td>
			</tr>
		
		</tbody>
			<tr >
				
				 <td colspan="3"><a href="uboard">목록보기</a></td> 
				 
				 
			</tr>
	</table>
	
</body>
</html>
<%@include file="jspcss/footer.jsp"%>