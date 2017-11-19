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
User[] users=UserDao.getUsers();   
	List<Message[]> list=new ArrayList<Message[]>();

  	int i=0;
    while(i<=10 && i<users.length) {
     %><div  class="user" onclick="a<%=i+1%>('<%= users[i].getUsername()%>');" ><%= users[i].getUsername()%></div>
         <div style="clear: both;"></div>
         <%
       
       String sql="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
" where a.id=b.userid and b.status = '0' and a.username='"+users[i].getUsername()+"'";
	Message[] msg=MessageDao.getMessages(sql);	
 
	 list.add(msg);
   i++;
   } %>
  
<%
String sql2="select b.id,a.username, b.message,b.inserttime from userinfo  a, message b"+ 
" where a.id=b.userid and b.status = '0' order by inserttime desc limit 0,9";
Message[] msgAll=MessageDao.getMessages(sql2);

	
 %>

</div>
 <div id="button1" onclick="show();">留言列表</div>
  <div id="button2" ><a style=" text-decoration: none; color:black;"href="LoginJudge.edmund.k19j34adsd?method=jump">后台管理</a></div>
    <div id="div2">
        <div class="label">留言列表</div> <hr style="width:600px;border:none;border-top:1px solid #555555;">
  
      
      
        <div class="time" id="time1"></div>
        <div class="content" id="content1"></div>
          <div class="time" id="time2"></div>
         <div class="content" id="content2"></div>
           <div class="time" id="time3"></div>
          <div class="content" id="content3"></div>
            <div class="time" id="time4"></div>
           <div class="content" id="content4"></div>
               <div class="time" id="time5"></div>
           <div class="content" id="content5"></div>
               <div class="time" id="time6"></div>
           <div class="content" id="content6"></div>
               <div class="time" id="time7"></div>
           <div class="content" id="content7"></div>
               <div class="time" id="time8"></div>
           <div class="content" id="content8"></div>
               <div class="time" id="time9"></div>
           <div class="content" id="content9"></div>
               <div class="time" id="time10"></div>
           <div class="content" id="content10"></div>
   
    </div>



    <div id="div3">
   <span style="font-size:25px;"> &copy</span>版权归Edmund所有，若有雷同，纯属巧合
    </div>
</div>
  </body>
  
  
  <script>
  
  function show(){
  <%
  for(int j=0;j<msgAll.length;j++){
 
%>var m<%=j%>="<%=msgAll[j].getUsername()+":"+msgAll[j].getInserttime()%>";
document.getElementById("time<%=j+1%>").innerHTML=m<%=j%>;<%
%>document.getElementById("time<%=j+1%>").style.display="block";<%
%>var s<%=j%>="<%=msgAll[j].getMessage()%>";
document.getElementById("content<%=j+1%>").innerHTML=s<%=j%>;<%
%>document.getElementById("content<%=j+1%>").style.display="block";<%


}
  
  
  %>
  }
  
 
function a1(username){
//alert(username);
<%
 for(int j=0;j<=9;j++){
	%>document.getElementById("time<%=j+1%>").innerHTML="";
	document.getElementById("time<%=j+1%>").style.display="none";
	document.getElementById("content<%=j+1%>").innerHTML="";
	document.getElementById("content<%=j+1%>").style.display="none";
	<%
  }

Message[] msg= list.get(0);
for(int j=0;j<msg.length;j++){
%>var m<%=j%>="<%=msg[j].getInserttime()%>";
document.getElementById("time<%=j+1%>").innerHTML=username+":"+m<%=j%>;<%
%>document.getElementById("time<%=j+1%>").style.display="block";<%
%>var s<%=j%>="<%=msg[j].getMessage()%>";
document.getElementById("content<%=j+1%>").innerHTML=s<%=j%>;<%
%>document.getElementById("content<%=j+1%>").style.display="block";<%


}
%>

}

function a2(username){
//alert(username);
<%
 for(int j=0;j<=9;j++){
	%>document.getElementById("time<%=j+1%>").innerHTML="";
	document.getElementById("time<%=j+1%>").style.display="none";
	document.getElementById("content<%=j+1%>").innerHTML="";
	document.getElementById("content<%=j+1%>").style.display="none";
	<%
  }

Message[] msg2= list.get(1);
for(int j=0;j<msg2.length;j++){
%>var m<%=j%>="<%=msg2[j].getInserttime()%>";
document.getElementById("time<%=j+1%>").innerHTML=username+":"+m<%=j%>;<%
%>document.getElementById("time<%=j+1%>").style.display="block";<%
%>var s<%=j%>="<%=msg2[j].getMessage()%>";
document.getElementById("content<%=j+1%>").innerHTML=s<%=j%>;<%
%>document.getElementById("content<%=j+1%>").style.display="block";<%


}
%>

}


function a3(username){
//alert(username);
<%
 for(int j=0;j<=9;j++){
	%>document.getElementById("time<%=j+1%>").innerHTML="";
	document.getElementById("time<%=j+1%>").style.display="none";
	document.getElementById("content<%=j+1%>").innerHTML="";
	document.getElementById("content<%=j+1%>").style.display="none";
	<%
  }

Message[] msg3= list.get(2);
for(int j=0;j<msg3.length;j++){
%>var m<%=j%>="<%=msg3[j].getInserttime()%>";
document.getElementById("time<%=j+1%>").innerHTML=username+":"+m<%=j%>;<%
%>document.getElementById("time<%=j+1%>").style.display="block";<%
%>var s<%=j%>="<%=msg3[j].getMessage()%>";
document.getElementById("content<%=j+1%>").innerHTML=s<%=j%>;<%
%>document.getElementById("content<%=j+1%>").style.display="block";<%


}
%>

}

function a4(username){
//alert(username);
<%
 for(int j=0;j<=9;j++){
	%>document.getElementById("time<%=j+1%>").innerHTML="";
	document.getElementById("time<%=j+1%>").style.display="none";
	document.getElementById("content<%=j+1%>").innerHTML="";
	document.getElementById("content<%=j+1%>").style.display="none";
	<%
  }

Message[] msg4= list.get(3);
for(int j=0;j<msg4.length;j++){
%>var m<%=j%>="<%=msg4[j].getInserttime()%>";
document.getElementById("time<%=j+1%>").innerHTML=username+":"+m<%=j%>;<%
%>document.getElementById("time<%=j+1%>").style.display="block";<%
%>var s<%=j%>="<%=msg4[j].getMessage()%>";
document.getElementById("content<%=j+1%>").innerHTML=s<%=j%>;<%
%>document.getElementById("content<%=j+1%>").style.display="block";<%


}
%>

}


function login(){

window.location.assign("../BBS_System/jsp/Login.jsp") ;
}
</script>
</html>
