<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Pizzaworld!</title>

<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link rel="stylesheet" href="resources/css/main.css" type="text/css">
<link rel="stylesheet" href="resources/css/style.css" type="text/css">
<link rel="stylesheet" href="resources/css/pizza.css" type="text/css">

<style>
    .container { margin: 50px auto; max-width: 1120px; }
    </style>

</head>

<body>
<!--로고/로그인-->
  	<%@include file="jspcss/header.jsp"%>
 

<main id="premium">
     <div id="p_title">
         <h2>프리미엄 피자</h2>
         <p>천연발효종을 넣은 생도우에 프리미엄 토핑을 얹어 특별하게 즐기는 피자</p>
    </div> 
    
      <hr/>
      
<!--첫번째 줄-->
<c:forEach items="${list }" var="dto">
   <div class="box1">
       <a href="user_p_detail?pId=${dto.pId }"> <img src="resources/upload/${dto.picture_url}" width="260" height="270"/></a>
       <p>${dto.pName }</p>
       <P><strong>L</strong> ${dto.lprice } &nbsp;&nbsp;&nbsp;
          <strong>R</strong> ${dto.rprice }</P>
       <input type="button" value="상세보기" />
       <input type="button" value="장바구니" />
     </div>
 
     </c:forEach>
      
  </main>



<!--footer -->     
 	<%@include file="jspcss/footer.jsp"%>


</body>
</html>








