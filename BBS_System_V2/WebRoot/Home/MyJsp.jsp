<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%
 request.setAttribute("message", "大王");
 session.setAttribute("message", "二王");
  application.setAttribute("message", "小王");
  pageContext.setAttribute("message", "首当其冲");
 
  //request.getRequestDispatcher("MyJsp2.jsp").forward(request, response);
  
  %>
<%--  <jsp:forward page="MyJsp2.jsp"> </jsp:forward> --%>
  <body>
    This is my JSP page. <br>
     测试结果是：${pageScope.message }
   
  </body>
</html>
