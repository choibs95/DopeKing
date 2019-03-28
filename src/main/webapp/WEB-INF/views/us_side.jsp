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
  	<%@include file="jspcss/us_header.jsp"%>
 

<main id="premium">
     <div id="p_title">
         <h2>샐러드 &amp; 사이드 디시</h2>
         <p>샐러드바를 집에서 간편하게 즐기는 샐러드와 부담 없이 즐기는 사이드 메뉴</p>
    </div> 
    
      <hr/>
      
<!--첫번째 줄-->
<c:forEach items="${side }" var="dto">
   <div class="box1">
        <img src="resources/image/${dto.picture_url}" width="260" height="270"/>
       <p>${dto.sName }</p>
       <P>${dto.sPrice }</P>
       <input type="button" value="장바구니" />
     </div>
 
     </c:forEach>
      
  </main>


<!--footer -->     
 	<%@include file="jspcss/footer.jsp"%>


</body>
</html>






