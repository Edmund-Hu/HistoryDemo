<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.edmund.tool.* ,com.edmund.dao.*,com.edmund.web.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'checkUser.jsp' starting page</title>
    
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
  String name = request.getParameter("username");
  String pw = request.getParameter("pw");
  
  User u = new User();
		u.setName(name);
		u.setPassword(pw);
		UserDao udao = new UserDao();
		User newusr = udao.checkUser(u);
		if(newusr == null){
			//调转到登录页面
			response.sendRedirect("Login.jsp");
		}else{
		//跳到成功页面
		session.setAttribute("username", u.getName());
		response.sendRedirect("Success.jsp");
			//System.out.println("登录成功");
		}
   %>
  </body>
</html>
