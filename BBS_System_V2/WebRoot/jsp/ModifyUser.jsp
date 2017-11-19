<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.edmund.web.*,com.edmund.tool.*,com.edmund.dao.*" %>

<%

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String username = request.getParameter("username");
String info="修改密码";
if("success".equals(username)){
info="修改成功！";

}else if("exist".equals(username)){
info="密码错误！";
}else if("fail".equals(username)){
info="两次密码不一致！";}



%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>BBS修改用户</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/AddUser.css">
	

  </head>
 
  <body>
   <%@include file="Daohang.jsp"%>
  <div style="position:absolute;top:60px;left:170px;width:1094px;height:534px;background-image: url('${pageContext.request.contextPath}/img/password.jpg');">
    <div id="divinfo"><%=info%></div>

  <div id="login">
  
    <form action="ModifyUser.edmund" method="post">



        <table style="margin-top: 20px;">
            <tr>
            <td class=" td1">用户名</td>   <td colspan="2"><%=session.getAttribute("username") %></td>
        </tr>
            <tr>
                <td class=" td1"> 原始密码</td>   <td colspan="2"><input type="password" class="input" name="password"/> <tr>
        </tr>
            <tr>
                <td class=" td1">新密码</td>   <td colspan="2"><input type="password" class="input" name="newpassword"/> <tr>
        </tr>
               <tr>
                <td class=" td1">确认密码</td>   <td colspan="2"><input type="password" class="input" name="newpassword1"/> <tr>
        </tr>
            <tr>
               <td colspan="3" style="text-align: center"><input type="submit" value="确认修改" /> <input type="reset" value="重置"/><tr>
        </tr>

        </table>


    </form>
 

</div>

</div>

  </body>


</html>
