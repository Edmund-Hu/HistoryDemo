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
    
    <title>添加留言</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page" >
	<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<%-- <%
if("yes".equals((String)request.getAttribute("cont"))){
%><script>	if(confirm("添加成功！是否继续添加？")){
window.location.assign("jsp/AddMessage.jsp");
}else{
window.location.assign("jsp/DaoHangHome.jsp");
}

</script><% 
}; %> --%>

<c:if test="${requestScope.cont =='yes'}" var="result">
<script>	if(confirm("添加成功！是否继续添加？")){
window.location.assign("jsp/AddMessage.jsp");
}else{
window.location.assign("jsp/DaoHangHome.jsp");
}
</script>
</c:if>



  </head>
  
 <style>
td{
    border: 1px solid rgb(200,200,200);
}
    tr{
        background-color:rgba(230,230,230,0.2);
    }
</style>
<body  style="width:1360px;height:500px;">
<%@include file="Daohang.jsp"%>


<div style="position:absolute;top:60px;left:170px;width:1094px;height:534px;">
<form action="AddMessage.edmund" method="post">
    <table style="width:1090px;border-collapse: collapse;">
        <tr style="background-color:rgb(230,230,230);">
            <td colspan="2" style="font-weight:bold">&nbsp;留言内容</td>
        </tr>
  
        <tr>
            <td style="text-align:center;width:8%;">内容</td>
            <td style="width:80%">
                <textarea cols=60 rows=8 style="border:1px #cccccc solid;outline:none;font-size:16px;" name="contents"></textarea>
            </td>
        </tr>
        <tr>
            <td style="text-align:center;width:8%;">日期</td>
            <td style="width:80%;color:white">

            </td>
        </tr>
        <tr>
            <td style="text-align:center;width:8%;">留言人</td>
            <td style="width:80%;">
			<%=session.getAttribute("username") %>
            </td>
        </tr>
        <tr>
            <td></td>
            <td style="width:80%;color:white">
                <a href=><input type="reset" value="取消填写" style="border:1px white solid;background:rgba(0,0,0,0.3);float:left"></a>
                <input type="submit" value="发布留言" style="border:1px white solid;background:rgba(0,0,0,0.3);float:left">
            </td>
        </tr>
    </table>
    
    </form>

  <form method="post" action="fileload.edmund" enctype="multipart/form-data">
  <table style="width:1090px;border-collapse: collapse;">
 <tr>
  	 <td style="width:200px;">  <input type="file"  name="file"></td>
		<td> <input type="submit" value="上传" ></td>
	 </tr>
      </table>  
     </form>

</div>

</body>
</html>
