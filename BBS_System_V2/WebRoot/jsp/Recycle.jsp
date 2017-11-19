<%@page import="com.edmund.web.Message"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 Message[] msg=(Message[])(request.getAttribute("message"));
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>留言回收站</title>
    
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
     .a{
    display:inline;margin-left:2px; background-color:transparent;text-decoration:underline }
</style>

<body  style="width:1366px;height:500px;">
<%@include file="Daohang.jsp"%>
<div style="position:absolute;top:60px;left:170px;width:1094px;height:534px;">
    <div style="width:1090px;height:25px;background-color:rgba(200,200,200,0.8);margin-bottom: 5px;line-height: 25px;">
        <center>
          <a class="a" href="jsp/AddMessage.jsp">  <input type="button" value="添加文档" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white"></a>
           <a class="a" href="SearchMessage.edmund?method=quaryme"> <input type="button" value="我的文档 " style="border:1px white solid;background:rgba(0,0,0,0.3);color:white"></a>
            <a class="a" href="MessageAudit.edmund?method=showall"><input type="button" value="稿件审核" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white"></a>
     
        </center>
    </div>
    <form action="Recycle.edmund" method="post">
    <table border="1px white solid"
				style="width:1090px;border-collapse: collapse">
        <tr style="text-align:center;">
            <td style="width:5%;">ID</td>
            <td style="width:6%;">选择</td>
            <td style="width:44%;overflow:hidden;">留言信息</td>
            <td style="width:18%;">录入时间</td>
            <td style="width:10%;">发布人</td>
            <td style="width:15%;">操作</td>
        </tr>
              <% 
        for(int i=0;i<msg.length;i++){
        %>
            <tr style="text-align:center;">
            <td style="width:5% ;font-size:13px;"><%=msg[i].getId() %></td>
            	<td style="width:6%;font-size:13px;"><input type="checkbox"
						id="<%=msg[i].getId()%>"><input type="hidden" value=""
						id="id<%=i%>" name="id<%=i%>">
					</td>
            <td style="width:44%;font-size:13px; overflow:hidden;text-align:left"><%=msg[i].getMessage() %></td>
            <td style="width:18%;font-size:13px;"><%=msg[i].getInserttime() %></td>
            <td style="width:10%;font-size:13px;"><%=msg[i].getUsername() %></td>
            <td style="width:15%;font-size:13px;"><a class="a" href="Recycle.edmund?method=recover&&id=<%=msg[i].getId() %>">还原</a>|
            <a class="a" href="http://localhost:8080/BBS_System/Recycle.edmund?method=delete&&id=<%=msg[i].getId() %>">彻底删除 </a></td>
        </tr>
  
        <%
 
        }
     
        %>
        
        
    </table>
    <div style="width:1090px;height:20px;margin-top:5px;background-color: rgba(200,200,200,0.5)">
   <input type="button" value="全选" onclick="chooseAll();" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
        <input type="button" value="取消" onclick="cancelAll();"  style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
        <input type="button" value="反选" onclick="muticosAll();"  style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
        <input type="submit" value="还原" onclick="check();" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
      
    </div>

  </form>
</div>
</body>
<script>
function chooseAll(){
<%for (int i = 0; i < msg.length; i++) {
%>document.getElementById("<%=msg[i].getId()%>").checked=true;
document.getElementById("id<%=i%>").value="<%=msg[i].getId()%>";<%
}%>
}
function cancelAll(){

<%for (int i = 0; i < msg.length; i++) {%>document.getElementById("<%=msg[i].getId()%>").checked=false;
	document.getElementById("id<%=i%>").value="";<%}%>
}

function muticosAll(){

<%for (int i = 0; i < msg.length; i++) {%> 

if(document.getElementById("<%=msg[i].getId()%>").checked){
	document.getElementById("<%=msg[i].getId()%>").checked=false;
	document.getElementById("id<%=i%>").value="";
}else{
document.getElementById("<%=msg[i].getId()%>").checked=true;
document.getElementById("id<%=i%>").value="<%=msg[i].getId()%>";
}
<%}%>

}


function check(){

<%for (int i = 0; i < msg.length; i++) {%>

if(document.getElementById("<%=msg[i].getId()%>").checked){
	document.getElementById("id<%=i%>").value="<%=msg[i].getId()%>";
}
<%}%>
	}
</script>

</html>