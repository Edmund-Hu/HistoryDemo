<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My jsp</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	<script type="text/javascript" src="js/script.js"> </script>
	-->
  </head>
  
  <body>
  this is my jsp index file
  
  <form action="Demo5" method="POST">
  用户名：<input type="text" name="name">
   密码：<input type="password" name="password">
   爱好：<input type="checkbox" value="basketball" name="hobby"/> 篮球
  	 <input type="checkbox" value="football" name="hobby"/> 足球
  	 <input type="checkbox" value="volleyball" name="hobby"/>排球
  <input type="submit" value="submit">
  </form>
  </body>
</html>