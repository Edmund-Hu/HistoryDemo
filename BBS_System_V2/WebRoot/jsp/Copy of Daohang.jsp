<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <meta -equiv="pragma" content="no-cache">
	<meta -equiv="cache-control" content="no-cache">
	<meta -equiv="expires" content="0">    
	<meta -equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta -equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/Background.css">
  </head>
  	<script language="JavaScript" src="js/DaoHang.js"></script>
  	<script src="js/jquery-1.11.0.js"></script>
  	<!-- 	<script language="JavaScript" src="js/jquery-1.11.0.js"></script> -->

<body>

  


<div class="body"><img style="width:1300px" src="${pageContext.request.contextPath}/img/background.jpg"></div>
<div style="width:300px;height:25px;line-height:25px;position:absolute; top:20px;right:400px;" id="timelable"></div>

<div style="width:200px;height:25px;line-height:25px;position:absolute; top:20px;right:100px;">
欢迎${username}，
<a style="display:inline;margin-left:2px; background-color:transparent;text-decoration:underline "href="LoginJudge.edmund?method=exit">注销登陆</a>
<a style="display:inline;margin-left:2px; background-color:transparent;text-decoration:underline "href="Home/HomePage.jsp">主页</a>
</div>


<div  class="row" id="div1" onmouseover="fontChange('arrow1','list1');" onmouseout="fontChange2('arrow1','list1');">留言管理</div>
<div  class="pic" onmouseover="fontChange('arrow1','list1');" onmouseout="fontChange2('arrow1','list1');"><img src="${pageContext.request.contextPath}/img/arrowdown.png" id="arrow1"></div>
<div class= "list" id="list1" onmouseover="fontChange('arrow1','list1');" onmouseout="fontChange2('arrow1','list1');"><ul>
    <li><a href="jsp/AddMessage.jsp">新增留言</a></li>
    <li><a href="SearchMessage.edmund?method=quary&currentPage=1">查询留言</a></li>
    <li><a href="Recycle.edmund?method=quary">留言回收站</a></li>
      <li><a href="MessageAudit.edmund?method=showall">审核文件</a></li>
</ul></div>
<div class="row" style="margin-top:10px" id="div2" onmouseover="fontChange('arrow2','list2');" onmouseout="fontChange2('arrow2','list2');">用户管理</div>
<div  class="pic" onmouseover="fontChange('arrow2','list2');" onmouseout="fontChange2('arrow2','list2');"><img src="${pageContext.request.contextPath}/img/arrowdown.png" id="arrow2"></div>
<div class="list"  id="list2" onmouseover="fontChange('arrow2','list2');" onmouseout="fontChange2('arrow2','list2');"><ul>
    <li><a href="jsp/AddUser.jsp">用户添加</a></li>
    <li><a href="jsp/ModifyUser.jsp">用户修改</a></li>



</ul></div>

</body>
<script language="JavaScript" src="js/jquery-1.11.0.js"></script>
 <script>
	setInterval("time();",500);
 
  	function time (){
  	
	var T = new Date;
	var week = T.getDay();
	var day = T.getDate();
	var year = T.getFullYear();
	var month = T.getMonth()+1;
	var hour = T.getHours();
	var minutes = T.getMinutes();
	var seconds = T.getSeconds();
		
	var timelable = checkweek(week)+" "+year+"年"+month+"月"+day+"日"+hour+
	"时"+minutes+"分"+seconds+"秒";
	//alert(timelable);
	$("#timelable").html(timelable);
	

};
function checkweek(week){
switch(week){
case 0:
return "星期天";
 case 1:
return "星期一";
case 2:
return "星期二";
case 3:
return "星期三";
case 4:
return "星期四";
case 5:
return "星期五";
case 5:
return "星期六";
}
}
</script>  
</html>
  
