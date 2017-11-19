<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
  <head>
    
    
 
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/Background.css">
	

  </head>
  

<body>

  


<div class="body"><img style="width:1300px" src="${pageContext.request.contextPath}/img/background.jpg"></div>
<div style="width:200px;height:25px;line-height:25px;position:absolute; top:20px;right:100px;">
欢迎<%=session.getAttribute("username") %>，
<a style="display:inline;margin-left:2px; background-color:transparent;text-decoration:underline "href="http://localhost:8080/BBS_System/LoginJudge.edmund.k19j34adsd?method=exit">注销登陆</a>
<a style="display:inline;margin-left:2px; background-color:transparent;text-decoration:underline "href="http://localhost:8080/BBS_System/Home/HomePage.jsp">主页</a>
</div>


<div  class="row" id="div1" onmouseover="fontChange('arrow1','list1');" onmouseout="fontChange2('arrow1','list1');">留言管理</div>
<div  class="pic" onmouseover="fontChange('arrow1','list1');" onmouseout="fontChange2('arrow1','list1');"><img src="${pageContext.request.contextPath}/img/arrowdown.png" id="arrow1"></div>
<div class= "list" id="list1" onmouseover="fontChange('arrow1','list1');" onmouseout="fontChange2('arrow1','list1');"><ul>
    <li><a href="http://localhost:8080/BBS_System/jsp/AddMessage.jsp">新增留言</a></li>
    <li><a href="http://localhost:8080/BBS_System/SearchMessage.edmund?method=quary">查询留言</a></li>
    <li><a href="http://localhost:8080/BBS_System/Recycle.edmund?method=quary">留言回收站</a></li>
</ul></div>
<div class="row" style="margin-top:10px" id="div2" onmouseover="fontChange('arrow2','list2');" onmouseout="fontChange2('arrow2','list2');">用户管理</div>
<div  class="pic" onmouseover="fontChange('arrow2','list2');" onmouseout="fontChange2('arrow2','list2');"><img src="${pageContext.request.contextPath}/img/arrowdown.png" id="arrow2"></div>
<div class="list"  id="list2" onmouseover="fontChange('arrow2','list2');" onmouseout="fontChange2('arrow2','list2');"><ul>
    <li><a href="http://localhost:8080/BBS_System/jsp/AddUser.jsp">用户添加</a></li>
    <li><a href="http://localhost:8080/BBS_System/jsp/ModifyUser.jsp">用户修改</a></li>



</ul></div>


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
  
