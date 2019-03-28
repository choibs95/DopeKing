<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
 
	function Cart_Delete() {
		
		location.href = "cart_delete";
		
	}
	function Cart_End() {
		sssssss
	alter("결제완료")		
		
	}
	</script>

</head>
<body>

<%@include file="jspcss/us_header.jsp"%> 

	  <main>
    <div id="title">
        <h2>장바구니 </h2>
    </div>
    <hr/>
      
        <!-- 로그인정보입력-->
            <div id="cart-input">
                <table id="cart-table">
                    <tr id="tt">
                        
                        <th>상품명</th>
                        <th>판매가격</th>
                        <th>수량</th>
                        <th>금액</th>
                    </tr>
                   <c:forEach items="${dtos }" var="dto">
            <tr>
               <td> <img id="pp" width="70" height="70" src="resources/upload/${dto.picture_url}">${dto.cName }</td>
               <td>${dto.sPrice}</td>
               <td><input id="quantity" type="number" value="${dto.cQuantity }" />
                        <button>수정</button></td>
               <td>${dto.cPrice }</td>
            </tr>
         </c:forEach>
          
                    
                </table>

                
                <br><br><br>
              
                <input id="reset" type="button" value="장바구니비우기" onclick="Cart_Delete()"/>&nbsp;
                <input id="buy" type="button" value="구매하기" onclick="Cart_End()" />
                
            </div>
   
    </main> 
    <%@include file="jspcss/footer.jsp"%>
    
</body>
</html>