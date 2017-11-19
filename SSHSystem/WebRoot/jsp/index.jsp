<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.Cookie"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
 <script>
 $(function(){
 	$("#name").blur(function(){
		alert($(this).val());
		var a = $(this).val();
 		$.ajax({
 		type:"POST",
 		url:"user/testjson",
 		/* data:"name="+a, */
 		dataType:"json",
 		success:function(msg){
 		 alert(msg.username);
 		
 		/* for(var i in msg){
 			alert(3);
 			 alert(msg[i].username);
 			}  */
 		} 
 		
 		});
 	});
 });
 </script>
 
  <body>
    姓名<input type="text" class="name" id="name">
  </body>
</html>
