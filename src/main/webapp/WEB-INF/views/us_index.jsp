<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Pizzaworld!</title>
	
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">	
<link rel="stylesheet" href="resources/css/jquery-gallery.css" type="text/css">
<link rel="stylesheet" href="resources/css/main.css" type="text/css">
<link rel="stylesheet" href="resources/css/style.css" type="text/css">
<link href="https://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="resources/js/jquery-gallery.js"></script>
<script type="text/javascript" src="resources/js/demo-main.js"></script>
<script type="text/javascript" src="resources/script/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="resources/script/s3Slider.js"></script>

<style>
    .container { margin: 50px auto; max-width: 1108px; }
    </style>
</head>


 <body>
<%@include file="jspcss/us_header.jsp"%>

     <div class="container">
  <ul class="gallery-slideshow">
    <li><img src="resources/image/container_img/pz1.png"/></li>
    <li><img src="resources/image/container_img/pz2.png"/></li>
    <li><img src="resources/image/container_img/pz3.png"/></li>
    <li><img src="resources/image/container_img/pz4.png"/></li>
    <li><img src="resources/image/container_img/pz5.png"/></li>
    <li><img src="resources/image/container_img/pz6.png"/></li>
  </ul>
</div>

<!--배너 두개-->
  <main id="banner">

    <div id="banner1">
        <img src="resources/image/container_img/dopeking_bn.png" width="545"></div>  
    <div id="banner2">
        <img src="resources/image/container_img/dopeking_bn2.jpg" width="545"></div>
    </main>
    
    
<!--footer -->     
  	<%@include file="jspcss/footer.jsp"%>
      
<!--메인 피자사진 움직이기 -->     
<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha384-tsQFqpEReu7ZLhBV2VZlAu7zcOV+rXbYlF2cqB8txI/8aZajjp4Bqd+V6D5IgvKT" crossorigin="anonymous"></script>
  <script src="resources/script/jquery-gallery.js" type="text/javascript"></script>
  <script src="resources/script/demo-main.js" type="text/javascript"></script>
<script type="text/javascript">


  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-36251023-1']);
  _gaq.push(['_setDomainName', 'jqueryscript.net']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>

</body>

</html>


