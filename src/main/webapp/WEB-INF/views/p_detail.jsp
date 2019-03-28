<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link rel="stylesheet" href="resources/css/style.css" type="text/css">
<link rel="stylesheet" href="resources/css/ad_pizza_detail.css" type="text/css">
<link rel="stylesheet" href="resources/css/side_detail.css" type="text/css">

<title>Insert title here</title>
<script type="text/javascript">
	function gop_board() {
		document.form.action="p_board";
		document.form.submit();
	}
	function goDelete() {
		location.href="delete";
	}
</script>
</head>
<body>
<%@include file="jspcss/ad_header.jsp"%>

<main>
<form action="modify" method="post">
   <input type="hidden" name="fName" value="${p_detail.picture_url }">
   <div id="title">
        <h2>피자</h2>
    </div>
    <hr/>
    <nav>
        <h1>&nbsp;</h1>
        <figure>
            <img id="pp" width="650" height="620" src="resources/upload/${p_detail.picture_url }"></a>
        </figure>
        
    </nav>
    <section id="main">
       <br><br>
        <article>
            <h1><input id="a" type="text" name="pName" value="${p_detail.pName}"></h1>
            <h1 id="c"><input type="hidden" name="pId" value="${p_detail.pId}"></h1>
            <p><input class="b" type="text" name="lprice" value="${p_detail.lprice}"> &nbsp;&nbsp;&nbsp;&nbsp;
            <input class="b" type="text" name="rprice" value="${p_detail.rprice}"></p>
        </article>
        <br>
        <hr>
        <br>
   
       <article>
           &#8226; 수량
            <input id="ae2" type="number" min="0" step="1" value="0" /> 
        </article>
         <br><br>
         <article>
             <section>
                 <strong>총 금액 : </strong>
                 <input id="ae3" type="text" size="8" value="0" />
             </section>
         </article>
         <br><hr><br>
         <article>
             <section>

              <input class="ae4" value="수정" type="submit"> &nbsp;&nbsp; 
               <a href="p_board"><input class="ae4" onclick="gop_board()"value="목록"  type="button"></a> &nbsp;&nbsp; 
              <a href="delete?pId=${p_detail.pId}"><input class="ae4" onclick="goDelete()"  value="삭제"  type="button"></a>
               
<%-- <input id="ae4" type="submit" value="수정"> <input id="ae5" type="submit" value="목록보기"> 
<input id="ae6" type="submit" href="delete?pId=${content_view.pId}">  --%> 
               
             </section>
         </article>

    </section>
   
    </main>
   
   
      <%@include file="jspcss/ad_footer.jsp"%>
   </form>
</body>
</html>