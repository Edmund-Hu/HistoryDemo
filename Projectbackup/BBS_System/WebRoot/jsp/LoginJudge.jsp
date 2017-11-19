<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.edmund.web.*,com.edmund.tool.*,com.edmund.dao.*" %>
<%

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 request.setCharacterEncoding("UTF-8");
 response.setCharacterEncoding("UTF-8");
 String username = request.getParameter("username");
 String password = request.getParameter("password");
  User user = UserDao.getUser(username);
  if(user.getUsername()==null){
  response.sendRedirect("http://"+mj.IP+":8080/BBS_System/jsp/Login.jsp?username=?");
  }  else if(user.getUsername().equals(username) && user.getPassword().equals(password)){
 //System.out.println("登录成功");
 session.setAttribute("username", username);
 session.setAttribute("password", password);
  response.sendRedirect("http://"+mj.IP+":8080/BBS_System/jsp/DaoHangHome.jsp");
 }else{
 response.sendRedirect("http://"+mj.IP+":8080/BBS_System/jsp/Login.jsp?username=*");
 };
%>


















<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'LoginJudge.jsp' starting page</title>
    
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

  </body>
</html>
