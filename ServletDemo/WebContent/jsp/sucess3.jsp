<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.edmund.entity.*"
    %>  
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% User user = new User();
 user.setName("Edmund");
 user.setPassword("sword");
pageContext.setAttribute("user",user); %>
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
<%-- 姓名：<%=session.getAttribute("name") %> <br>
密码：<%=session.getAttribute("password") %> --%>
姓名：${requestScope.user.name} <br>
密码：${requestScope.user.password}
爱好：<c:forEach items="${requestScope.user.hobbies}" var="hobby">
	<h1>${hobby }</h1><br/>
	</c:forEach>

<br/>
<c:out value="${requestScope.user.hobbies[0]}" default="没有"/><br/>
Application :${app }<br/>
<c:set value="Frank" var="name" scope="request"/>
<c:remove 	var="name"/>
set的值为：${requestScope.name }

<c:catch var="error">
<%=2/0 %>
</c:catch>
错误信息为：${error }
<h1>kjakdsjlka djkajdkl</h1>

<c:if test="${requestScope.user.name == 'Edmund'}" var="result">
	欢迎${requestScope.user.name}登录 
</c:if>
<c:choose>
	<c:when test="${requestScope.user.name == 'Edmund'}">
		Edmund
	</c:when>
	<c:when test="${requestScope.user.name == 'vhudp'}">
		vhudp
	</c:when>
	<c:otherwise>
		Others
	</c:otherwise>
</c:choose>
 
 
  </body>
</html>