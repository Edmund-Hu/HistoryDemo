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
	<script type="text/javascript" src="js/lunbo.js"> </script>
	-->
  </head>
  
  <body>
		第二个JSP文件	<%=basePath%>
		<img alt="" src="img/yan5.jpg">
		<form>
		用户名：<input type="text" />
		用户名：<input type="password" />
		</form>
		<%= request.getRequestURI()%>
		<br>
			<%= request.getRealPath("yan5.jpg")%>
  </body>
</html>