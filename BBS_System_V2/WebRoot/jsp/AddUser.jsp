<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.edmund.web.*,com.edmund.tool.*,com.edmund.dao.*" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String username = request.getParameter("username");
String info="欢迎注册！";
if("success".equals(username)){
info="注册成功！";

}/* else if("exist".equals(username)){
info="用户名已经存在！";
} */else if("fail".equals(username)){
info="两次密码不一致！";}

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>BBS添加用户</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/AddUser.css">
	

  </head>
 
  <body>
   <%@include file="Daohang.jsp"%>
  <div style="position:absolute;top:60px;left:170px;width:1094px;height:534px; background-image: url('${pageContext.request.contextPath}/img/password.jpg');">
     <div id="divinfo"><%=info%></div>

  <div id="login">
    <form action="AddUser.edmund" method="post">



        <table style="margin-top: 20px;">
            <tr>
            <td class=" td1">用户名</td>   <td colspan="2"><input type="text" class="input" name="username" id="username"/> <tr>
        </tr>
            <tr>
                <td class=" td1">密码</td>   <td colspan="2"><input type="password" class="input" name="password"/> <tr>
        </tr>
            <tr>
                <td class=" td1">确认密码</td>   <td colspan="2"><input type="password" class="input" name="password1"/> <tr>
        </tr>
            <tr>
               <td colspan="3" style="text-align: center"><input type="submit" value="注册"/> <input type="reset" value="重置"/><tr>
        </tr>

        </table>


    </form>


</div>

</div>

  </body>
<script>
window.onload = function(){
	document.getElementById("username").onblur = function(){
	var httpxml = new XMLHttpRequest;
	httpxml.open("get", "AddUser.edmund?username="+this.value, true);
	httpxml.send();
	httpxml.onreadystatechange= function(){
		if(httpxml.readyState==4){
			if(httpxml.status==200){
			document.getElementById("divinfo").innerHTML=httpxml.responseText;
			}else{
			alert("服务器故障！我们会尽快修复！");
			}
			
		}
	};
	}


}

</script>
</html>
