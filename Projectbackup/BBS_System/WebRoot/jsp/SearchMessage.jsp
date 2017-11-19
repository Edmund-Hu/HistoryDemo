<%@page import="com.edmund.web.Message"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String username = (String)session.getAttribute("username");
String password = (String)session.getAttribute("password");
if(username==null){
response.sendRedirect("http://localhost:8080/BBS_System/jsp/Login.jsp"); 
}

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
Message[] msg=(Message[])(request.getAttribute("message"));
int s=(Integer)(request.getAttribute("start"));

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
  
    <title>My JSP 'SearchMessage.jsp' starting page</title>
    
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

<body  style=" ;width:1366px;height:500px;">
<%@include file="Daohang.jsp"%>
<div style="position:absolute;top:60px;left:170px;width:1094px;height:534px;">
    <div style="width:1090px;height:25px;background-color:rgba(200,200,200,0.8);margin-bottom: 5px;line-height: 25px;">
        <center>
            <input type="button" value="添加文档" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
            <input type="button" value="我的文档 " style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
            <input type="button" value="稿件审核" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
            <input type="button" value="栏目管理" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
            <input type="button" value="更新列表" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
            <input type="button" value="更新文档" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
            <input type="button" value="文章回收站" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
        </center>
    </div>
    <table border="1px white solid" style="width:1090px;border-collapse: collapse">
        <tr>
            <td colspan=6 style=";background-color: rgba(200,200,200,0.5)">&nbsp;文档列表</td>
        </tr>
        <tr style="text-align:center;">
            <td style="width:5%">ID</td>
            <td style="width:6%">选择</td>
            <td style="width:44%; overflow:hidden">留言信息</td>
            <td style="width:18%">录入时间</td>
            <td style="width:10%">发布人</td>
            <td style="width:15%">操作</td>
        </tr>
        <% 
        for(int i=s;i<msg.length&&i<s+10&&s>=0;i++){
        %>
            <tr style="text-align:center;">
            <td style="width:5% ;font-size:13px;"><%=msg[i].getId() %></td>
            <td style="width:6%;font-size:13px;"><input type="checkbox" id="<%=msg[i].getId()%>" value=""></td>
            <td style="width:44%;font-size:13px; overflow:hidden;text-align:left"><%=msg[i].getMessage() %></td>
            <td style="width:18%;font-size:13px;"><%=msg[i].getInserttime() %></td>
            <td style="width:10%;font-size:13px;"><%=msg[i].getUsername() %></td>
            <td style="width:15%;font-size:13px;"><a class="a" href="SearchMessage.edmund?method=edit&&id=<%=msg[i].getId() %>">编辑</a>|
            <a class="a" href="SearchMessage.edmund?method=delete&&id=<%=msg[i].getId() %>">删除 </a></td>
        </tr>
  
        <%
 
        }
     
        %>
 
    </table>
    <div style="width:1090px;height:20px;margin-top:5px;background-color: rgba(200,200,200,0.5)">
        <input type="button" value="全选"  onclick="chooseAll();" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
        <input type="button" value="取消"  onclick="cancelAll();" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
        <input type="button" value="反选" onclick="muticosAll();" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
        <input type="button" value="批量删除" onclick="checkStatus();" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
        <a class="a" href="SearchMessage.edmund?method=lastpage&&s=<%=s %>">   <input type="button" value="上一页" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white"></a>
        <a class="a" href="SearchMessage.edmund?method=nextpage&&s=<%=s %>"> <input type="button" value="下一页" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white"></a>
        <input type="button" value="共<%=(int)Math.ceil(msg.length/10.0) %>页" style="border:1px white solid;background:rgba(0,0,0,0.3);color:white">
    </div>
<form action="SearchCriteria" method="post">
    <div style="width:1090px;height:20px;margin-top:5px;background-color: rgba(200,200,200,0.5)">
        <center style="font-size:13px;">
            搜索条件:
            <select name="searchBy">
              <option>选择类型..</option>
                <option>ID</option>
                <option>文章关键字</option>
                <option>发布人</option>
            </select>
            关键字:
            <input type="text" style="width:120px;" name="keywords"/>
            <select name="order">
                <option>排序..</option>
                <option>ID</option>
                <option>发布时间</option>
            </select>
            <input type="submit" value="搜索" >
        </center>
    </div>
   </form> 
</div>
</body>
<script>
function chooseAll(){
<%     for(int i=0;i<msg.length;i++){
		%>document.getElementById("<%=msg[i].getId()%>").checked=true;<%
		
}
%>
}
function cancelAll(){

<%     for(int i=0;i<msg.length;i++){
	%>document.getElementById("<%=msg[i].getId()%>").checked=false;<%
}
%>
}

function muticosAll(){

<%  for(int i=0;i<msg.length;i++){ %>

if(document.getElementById("<%=msg[i].getId()%>").checked){
	document.getElementById("<%=msg[i].getId()%>").checked=false;
}else{
document.getElementById("<%=msg[i].getId()%>").checked=true;
}
<%
}
%>

}


function checkStatus(){
<% List<Integer> list=new LinkedList<Integer>();
for(int i=0;i<msg.length;i++){%>
if(document.getElementById("<%=msg[i].getId()%>").checked==true){
<% list.add(msg[i].getId());%>
}
<%}
session.setAttribute("id", list);
%>
window.location.assign("SearchMessage.edmund?method=deleteAll");
}

<%
/* if(request.getAttribute("id")!=null){
request.getRequestDispatcher("SearchMessage.edmund?method=delete").forward(request, response);
} */
%>










</script>

</html>