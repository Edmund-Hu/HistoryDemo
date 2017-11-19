<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	  <link rel="stylesheet" href="css/HomePage.css"/>
  <link type="text/css" href="css/bootstrap.min.css" rel="stylesheet">
  </head>
<script src="js/jquery-1.11.0.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/jquery.validate.js" type="text/javascript"></script>
<script src="js/form.js" type="text/javascript"></script>
  <style>
#register-form{
    width: 800px;
    margin: auto;
    border-image: none;
    padding: 30px;
    border-radius: 3px;
    height:350px;
    background-color: rgba(255,255,255,0.8);
}
.registerHead{
margin:auto;
width:1000px;
height:60px;
color:rgb(255,121,0);
display:block;
background-image: url("img/logo.jpg");
text-align: center;
line-height:60px;
font-size:30px;
}
 body{
        font-family: "Microsoft YaHei";
    }
   
</style>
  <body>
<div class="registerHead">新用户注册</div>

<div style="width:1000px;height:500px;margin:auto;background-image:url('img/register.jpg');padding-top:80px;">
<div class="message"><br><br>&nbsp&nbsp&nbsp恭喜注册成功！页面将在<span id="timer">3</span>秒后跳转……<br><br>
<span style="font-size:15px;">________________您也可以点击<a href="jsp/HomePage.jsp" >这里</a>手动跳转_______________</span></div>
	
	  <script>
        function setTime(){
            var $d = $("#timer").html();
            if($d<=1){
                 clearInterval(t);
           		 location.href="jsp/HomePage.jsp";
            }else{
                 $("#timer").html($d-1);
            }
        }
        var t= setInterval("setTime();",1000);
    </script>
	
</div>
	   <div class="hp_divfoot">
        &copy成都贝立美科技有限公司保留所有权利 Reserved all rights by Chengdu BeiLiMei science and technology Co.,Ltd.
 </div>
  </body>
</html>
