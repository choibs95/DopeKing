<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link rel="stylesheet" href="resources/css/style.css" type="text/css">
<link rel="stylesheet" href="resources/css/p_write.css" type="text/css">

<title>Insert title here</title>
<style>
#title {
   text-align: center;
}
</style>

</head>
<body>
   <%@include file="jspcss/ad_header.jsp"%>

   <main>
   <div id="title">
      <h2>상품등록</h2>
   </div>
         <hr />
   <br>
      <img id="top_icon" src="resources/image/container_img/8.png" width="60" height="40"/>
    <br>

   <table id="product">
      <form action="write" method="post" enctype="multipart/form-data">

         <tr>
            <td>상품이름</td>
            <td><input class="pr" type="text" name="pName" /></td>
         </tr>
         <tr>
            <th>(L)사이즈 가격</th>
            <td><input class="pr" type="text" name="lprice" /></td>
         </tr>
         <tr>
            <th>(R)사이즈 가격</th>
            <td><input class="pr" type="text" name="rprice" /></td>
         </tr>
         <tr>
            <td>수량</td>
            <td><input class="pr" type="text" name="pQuantity" /></td>
         </tr>
         <tr>
            <td>상세내용</td>
            <td><input id="pr2" type="text" name="pContent" /></td>
         </tr>
         <tr>
            <td>상품이미지</td>
            <td id="file"><input type="file" name="wFile" /></td>
         </tr>
         
          <tr>
            <td colspan="2"><input type="submit" value="입력">
               &nbsp;&nbsp;&nbsp;&nbsp; <a href="p_board">목록보기</a></td>
         </tr>
         
      </form>
   </table>
</main>
   <%@include file="jspcss/footer.jsp"%>
</body>
</html>