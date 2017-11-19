<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   	 
	  <link rel="stylesheet" href="css/HomePage.css"/>
  </head>
  <body>
  <div class="hp_divhead">
    <span class="hp_logobefore">欢迎光临</span>
    <span class="hp_logoafter">网上订餐系统</span>
    <span class="hp_logoright"><a href="jsp/HomePage.jsp">网站首页</a></span>
    <span class="hp_logoright">|</span>
    <span class="hp_logoright"><a href="">我的资料</a></span>
    <span class="hp_logoright">|</span>
    <span class="hp_logoright"><a href="shopcart/order">我的订单</a></span>
</div>
  </body>
</html>
