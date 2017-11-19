<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.edmund.entity.*" %>
<%
User user = new User();
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
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
	<script type="text/javascript" src="js/lunbo.js"> </script>
	-->
  </head>
  
  <body>
	this is my first JSP file
	<table>
	<%  for(int i=0;i<=10;i++){
	if(i%2==0){%>
		<tr style="width:100%;background-Color:red;">
				<td>我是第一行<%=i%></td>	
		</tr>
		
	<%}else{
		
		%><tr style="width:100%;">
		<td>我是第一行<%out.print(i);%></td></tr><%
	}
	
	%>
		
	<%}%>
<%out.write("a"); %>
<%out.print("a"); %>
	<%-- <jsp:forward page="NewFile.jsp"></jsp:forward> --%>
	
	</table>
	<%@include file="NewFile1.jsp" %>
	<jsp:include page="NewFile2.jsp">
		<jsp:param name="name" value="Edmund"></jsp:param>
	</jsp:include>
  </body>
</html>