<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.edmund.web.*,com.edmund.tool.*,com.edmund.dao.*" %>
<%@page import="java.net.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//System.out.println(request.getLocalAddr());//服务器IP
//System.out.println(request.getRemoteAddr());//
//System.out.println(InetAddress.getLocalHost().getHostAddress());//服务器IP
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>BBS登录页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/Login.css">
	

  </head>
 
  <body>
<% 
String ans = (String)request.getParameter("username");
String info= "欢迎登陆！";
if(ans==null){
info = "欢迎登陆！";
}else if(ans.equals("?")){
info = "用户名不存在！";
}else if(ans.equals("*")){
info = "密码有误，请确认密码！";
}
 
  %><div id="login">
    <form action="LoginJudge.edmund.k19j34adsd" method="post">

        <table style="margin-top: 20px;">
            <tr>
            <td class=" td1">用户名</td>   <td colspan="2"><input type="text" class="input" name="username"/> <tr>
        </tr>
            <tr>
                <td class=" td1">密码</td>   <td colspan="2"><input type="password" class="input" name="password"/> <tr>
        </tr>
            <tr>
               <td colspan="3" style="text-align: center"><input type="submit" value="登陆" "/> <input type="reset" value="重置"/><tr>
        </tr>

        </table>


    </form>
    <div id="divinfo"><%=info%></div>

</div>


  </body>

</html>
