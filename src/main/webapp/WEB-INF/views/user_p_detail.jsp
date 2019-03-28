 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link rel="stylesheet" href="resources/css/style.css" type="text/css">
<link rel="stylesheet" href="resources/css/pizza_detail.css" type="text/css">
<link rel="stylesheet" href="resources/css/side_detail.css" type="text/css">

<script type="text/javascript">
function totalvalue(){
	sPrice = parseInt(form.sPrice.value);
	cQuantity = parseInt(form.cQuantity.value);
	
	form.cPrice.value = sPrice*cQuantity;
}
	
</script>

<title>Insert title here</title>
</head>
<body>
<%@include file="jspcss/us_header.jsp"%>
<!-------------------------------------------->

<main>
<form name="form" action="cart" method="post"> 
	<input type="hidden" name="picture_url" value="${user_p_datail.picture_url }">
	<div id="title">
        <h2>피자</h2>
    </div>
    <hr/>
    <nav>
        <h1>&nbsp;</h1>
        <figure>
            <img id="pp" width="650" height="620" src="resources/upload/${user_p_datail.picture_url }"></a>
        </figure>
        
    </nav>
    <section id="main">
       <br><br>
        <article>
             <h1 id="c"><input type="hidden" name="cId" value="${user_p_datail.pId}"></h1>
             <h1 id="a"><input type="hidden" name="cName" value="${user_p_datail.pName}"></h1>
             
            <h1 id="a" >${user_p_datail.pName}</h1>
            <p id="b"><strong>L</strong>&nbsp;${user_p_datail.lprice} &nbsp;&nbsp;&nbsp;&nbsp;
            <strong>R</strong>&nbsp;${user_p_datail.rprice}</p>
        </article>
        <br>
        <hr>
        <br>
   		
   		<article>
           &#8226; 사이즈
            <select id="ae" name="sPrice" onkeyup="totalvalue()">
                <option value="${user_p_datail.lprice}"><strong>L</strong>&nbsp;${user_p_datail.lprice}</option>
                <option value="${user_p_datail.rprice}"><strong>R</strong>&nbsp;${user_p_datail.rprice}</option>
            </select>
        </article>
       <article>
           &#8226; 수량
            <input id="ae2" name="cQuantity" type="text" min="0" step="1" value="0" onkeyup="totalvalue()"/> 
        </article>
         <br><br>
         <article>
             <section>
                 <strong>총 금액 : </strong>
                 <input id="ae3" name="cPrice" type="text" size="8" value="0" readonly/>
             </section>
         </article>
         <br><hr><br>
         <article>
             <section>
              
              <input id="ae5" type="submit" value="장바구니"/>
              <input id="ae5" type="reset" name="reset" value="초기화"/>
             </section>
         </article>

    </section>
	</form>
    </main>
	
	
		<%@include file="jspcss/footer.jsp"%>
</body>
</html> 