<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.edmund.web.*,com.edmund.tool.*,com.edmund.dao.*" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'CheckUserName.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body><% 
String username = request.getParameter("username");
		String password =request.getParameter("pw");
		String sexm = request.getParameter("sexm");
		String email =request.getParameter("email");
		String sex=null;
	
		if(sexm.equals("1")){
			sex="男";
		}else{
			sex="女";
		}
		
		String sql="select username from userinfo where username="+"'"+username+"'";
			String sql2="select email from userinfo where email="+"'"+email+"'";
 
 
 if(mj.queryExist(sql,username)){
			out.print("<script>alert('用户名已经存在，请重新输入用户名');window.location.assign('jsp/register.jsp')</script>");
			
		}
	else if(mj.queryExist(sql2, email)){
		out.print("<script>alert('邮箱已经存在，请重新输入邮箱');window.location.assign('jsp/register.jsp')</script>");
	}else{
		
		if(mj.updatedata(username, password, sex, email)){
			out.print("<script>alert('注册成功！请登录') ;window.location.assign('jsp/Login.jsp')</script>");
		}
	}
	
 %>
 
  </body>
</html>
