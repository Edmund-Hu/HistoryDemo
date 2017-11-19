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
    
    <title>My JSP 'upload.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
	

  </head>
  
  <body>
    This is my JSP page. <br>
    
    <div>请先上传文件</div>
    
    <form method="post" action="fileload.edmund" enctype="multipart/form-data">
 	<input type="text" name =" name">
     <input type="file"  name="file"><br>
	 <input type="submit">
        
     </form>
     
  <div>下载文件</div>
      <form method="get" action="fileload.edmund" >
 <select name="select">
 <c:forEach var="file" items="${requestScope.filename }">
   <option value="${file }">${file }</option>

</c:forEach>
 </select>
	 <input type="submit" value="下载">
        
     </form>
  
  </body>
</html>
