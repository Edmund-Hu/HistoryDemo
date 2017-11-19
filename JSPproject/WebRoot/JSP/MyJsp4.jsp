<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp4.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
  
   
   <%
   request.setCharacterEncoding("UTF-8");
  //response.setCharacterEncoding("UTF-8");
   String username = request.getParameter("username");
   String password = request.getParameter("pw");
  																																																																																																																						 session.setAttribute("username", username);
   
    %>
  当前用户是： <span id="id"><%=username %></span><br>
   当前密码是：<%=password %>
   <script type="text/javascript">
   var a=document.getElementById("id").innerHTML;
   alert("欢迎"+a);
   </script>
   <%
   //重定向；
   //response.sendRedirect("MyJsp5.jsp");
   
    %>
   <a href="MyJsp5.jsp">my555jsp</a>
  </body>
</html>
