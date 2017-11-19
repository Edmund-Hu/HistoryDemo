<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp7.jsp' starting page</title>
    
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
    This is my JSP page77777. <br>
    <c:set value="hello word" var="str1"></c:set>
      <c:set value="he ll ow or d" var="str2"></c:set>
    <c:if test="${fn:contains(str1,'hello')}" var="result">
    ${result}
    ${str1}包含hello

    </c:if>
    <br>
    ${fn:length(str1)}  <br>
    替换字符串：${fn:replace(str1,' ','mm') }
   分割字符串：${fn:split(str2,' ') }
   
       <c:set value="${fn:split(str2,' ') }" var="str3"></c:set>
       <br>
    <c:forEach items="${fn:split(str2,' ')}"  var="s">
    ${s }<br>
    </c:forEach>
    连接字符串
    ${fn:join(str3,';') }
    <br>
   截取字符串
   ${str2 }<br>
   ${fn:substring(str2,4,8) }
    
  </body>
</html>
