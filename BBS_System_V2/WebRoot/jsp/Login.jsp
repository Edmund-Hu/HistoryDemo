<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.edmund.web.*,com.edmund.tool.*,com.edmund.dao.*" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

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
info = "";
}else if(ans.equals("?")){
info = "用户名不存在！";
}else if(ans.equals("*")){
info = "密码有误，请确认密码！";
}else if (ans.equals("!")){
info = "请先登录，您才能访问！";
}else if (ans.equals("!!")){
info = "你没有审核权限！请更换账号！";
}else if(ans.endsWith("??")){
info = "验证码不正确！";
}
 
 
  %><div id="login">
    <form action="LoginJudge.edmund" method="post">

        <table style="margin-top: 10px;">
            <tr>
            <td class=" td1">用户名</td>   <td colspan="2"><input type="text" class="input" name="username"/> </td>
        </tr>
            <tr>
                <td class=" td1">密码</td>   <td colspan="2"><input type="password" class="input" name="password"/> </td>
        </tr>
       
            <tr>
                <td class=" td1">验证码</td>   <td ><input type="text" class="input2" name="safecode"/> </td><td><img id= "safecode" alt="验证码" src="LoginJudge.edmund?method=drawpic" onclick="change();" width="65px" height="25px"></td>
        </tr>
            <tr>
               <td colspan="3" style="text-align: center"><input type="submit" value="登陆" onclick="a();"/> <input type="reset" value="重置"/></td>
        </tr>

        </table>


    </form>
    <div id="divinfo"><%=info%></div>

</div>


  </body>
<script> 
function a(){

document.getElementById("divinfo").style.color="red";
}

function change(){

document.getElementById("safecode").src="LoginJudge.edmund?method=drawpic&t="+Math.random();
}
</script>
</html>
