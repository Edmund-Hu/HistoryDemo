<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import ="com.edmund.tool.*,com.edmund.web.*,com.edmund.dao.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body><%  String s = (String)session.getAttribute("username"); %>
   登录成功！欢迎<%=s %>登录. <br>
  <%  

  User a =mj.getUser(s);
   %>
   <form action="Success.jsp" method="post">
   <table>
   <tr><td><%=a.getName()%> 请修改您的密码：</td><td><input type ="text"  value=原密码为：<%=a.getPassword()%> name="password"></td><td><input type="submit" value="确认修改"></td>
   </tr>
   </table>
   </form>
   <div id="1"><%=a.getName()%></div> <br>
   <div id="1"><%=a.getPassword()%></div>
   
   
   <%
 // String pw = request.getParameter("password");
   //if(mj.modify("password", "username", s, pw)){
   %><!-- <script>alert("修改密码成功");window.location.assign("") </script>--><%
  // };
   
   
    %>
   
  </body>
</html>
