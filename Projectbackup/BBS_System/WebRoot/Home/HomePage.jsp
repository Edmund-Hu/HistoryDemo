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
    
    <title>BBS留言系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/HomePage.css">
	<script language="JavaScript" src="js/HomePage.js"></script>
  </head>

  <body>

  
  
  <div id="container">
<div id="div1">
<div class="label">参与人员</div> <hr style="width:120px;border:none;border-top:1px solid #555555;" >
   <% 
User[] users=(User[])request.getAttribute("users");

if(users!=null){
 for(int i=0;i<users.length;i++){
     %><a href="HomePage.edmund?method=showone&&username=<%=users[i].getUsername() %>"><div  class="user" ><%= users[i].getUsername()%></div></a>
         <div style="clear: both;"></div>
         <%
  }
  }
  %>

</div>
 <div id="button1" "><a href="HomePage.edmund?method=showall">留言列表</a></div>
  <div id="button2" ><a href="LoginJudge.edmund.k19j34adsd?method=jump">后台管理</a></div>
    <div id="div2">
        <div class="label">留言列表</div> <hr style="width:600px;border:none;border-top:1px solid #555555;">
  
    <%Message[] msg=(Message[])request.getAttribute("message"); 
    if(msg!=null){
    for(int i=0;i<msg.length;i++){
    %> <div class="time" id="time1"><%=msg[i].getUsername() %>:<%=msg[i].getInserttime() %></div><%
    %> <div class="content" id="content1"><%=msg[i].getMessage() %></div><%
    }
    
    
    }%>  
      
       
     
       
   
    </div>



    <div id="div3">
   <span style="font-size:25px;"> &copy</span>版权归Edmund所有，若有雷同，纯属巧合
    </div>
</div>
  </body>
  
  
 
</html>
