<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String username = (String)session.getAttribute("username");
String password = (String)session.getAttribute("password");
if(username==null){
response.sendRedirect("http://localhost:8080/BBS_System/jsp/Login.jsp");
}

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
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

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
<form action="AddMessage.edmund.k19j34adsd" method="post">
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
</div>

</body>
</html>
