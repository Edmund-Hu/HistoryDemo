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
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/Background.css">
	

  </head>
  

<body>
   <%
  request.setCharacterEncoding("UTF-8");
 response.setCharacterEncoding("UTF-8");
 String username = request.getParameter("username");
 String password = request.getParameter("password");
 User user = UserDao.getUser(username);
 System.out.println(username);
  System.out.println(password);
 if(user.getUsername()==null){
session.setAttribute("username", "");
 //response.sendRedirect("http://localhost:8080/BBS_System/jsp/Login.jsp");


/*  <script>
 window.location.assign("jsp/Login.jsp");
 </script>
 */
 //System.out.println("用户名不存在");
 }else if(user.getUsername()!=null && user.getPassword().equals(password)){
 System.out.println("登录成功");
 }else{
 System.out.println("密码错误");
 }
   %>
  


<div class="body"><img style="width:1300px"src="${pageContext.request.contextPath}/img/background.jpg"></div>
<div  class="row" id="div1" onmouseover="fontChange('arrow1','list1');" onmouseout="fontChange2('arrow1','list1');">留言管理</div>
<div  class="pic"><img src="${pageContext.request.contextPath}/img/arrowdown.png" id="arrow1"></div>
<div class= "list" id="list1" onmouseover="fontChange('arrow1','list1');" onmouseout="fontChange2('arrow1','list1');"><ul>
    <li><a href="">新增留言</a></li>
    <li><a href="">查询留言</a></li>
    <li><a href="">留言回收站</a></li>
</ul></div>
<div class="row" style="margin-top:10px" id="div2" onmouseover="fontChange('arrow2','list2');" onmouseout="fontChange2('arrow2','list2');">用户管理</div>
<div  class="pic"><img src="${pageContext.request.contextPath}/img/arrowdown.png" id="arrow2"></div>
<div class="list"  id="list2" onmouseover="fontChange('arrow2','list2');" onmouseout="fontChange2('arrow2','list2');"><ul>
    <li><a href="">用户添加</a></li>
    <li><a href="">用户修改</a></li>



</ul></div>

<iframe class="frame" src="" frameborder="0" name="iframe_1"></iframe>
</body>
<script>

    function fontChange(a,b){
        var pic = document.getElementById(a);
        var list1 = document.getElementById(b);
       pic.src="${pageContext.request.contextPath}/img/arrowup.png";
        list1.style.display="block";


    }
    function fontChange2(a,b){
        var pic = document.getElementById(a);
        var list1 = document.getElementById(b);
        pic.src="${pageContext.request.contextPath}/img/arrowdown.png";
        list1.style.display="none";


    }

</script>
</html>
  
