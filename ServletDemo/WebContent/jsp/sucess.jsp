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
<%--   <%=application.getAttribute("app")%> --%>
用户名是：<%=request.getAttribute("name")%>
EL表达式:${requestScope.user}
<br/>
密码是：<%=request.getAttribute("password") %>
<%-- Cookie<%Cookie cookie = null;
    	Cookie[] cookies = null;
    	// 获取与该域相关的 Cookie 的数组
    	cookies = request.getCookies();
    	for (int i = 0; i < cookies.length; i++){
            cookie = cookies[i];%>
           名字是：
            <%=cookie.getName() %>
            <br/>
            值是：
        	<%=cookie.getValue()%>
           <% }	%>
    	 --%>
  </body>
  
  <script>
( function (){
	 alert(1);
  document.cookie="userId=828"; 
  document.cookie="userName=hulk"; 
  //获取cookie字符串 
  var strCookie=document.cookie; 
  console.log(strCookie);
  //将多cookie切割为多个名/值对 
  var arrCookie=strCookie.split("; "); 
 
  //遍历cookie数组，处理每个cookie对 
  for(var i=0;i<arrCookie.length;i++){ 
  console.log(arrCookie[i])
  //找到名称为userId的cookie，并返回它的值 
  }
  })();
  </script>
</html>