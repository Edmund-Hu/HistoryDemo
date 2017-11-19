<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'LoginTest.jsp' starting page</title>
    
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
   <form action="LoginTest.edmund" method="get">
   用户名：<input type="text" name="name">
   密码：<input type="text" name="password">
   <input type="submit" >
   <input type="button" value="注销">
   </form>
<c:catch var="error">
<c:when test=""  ></c:when>

</c:catch>
${error}
   <c:set value="vhudp" var="name" scope="page"></c:set>
   <c:set value="123" var="password" scope="page"></c:set>
   <c:out value="${requestScope.name}"></c:out>
 		  ${pageScope.name}
   
  <c:out value="${requestScope.password}"></c:out>
   		 ${pageScope.password}
   <c:if test="${requestScope.name!=null}" var="result">
   <c:choose>
   	<c:when test="${pageScope.name eq requestScope.name && pageScope.password eq requestScope.password}" >
   	 	<c:out value="登录成功！"></c:out>
   	 	</c:when>
   <c:otherwise>
   		<c:out value="登录失败！"></c:out>
   </c:otherwise>
   </c:choose>

   </c:if>


  </body>
</html>
