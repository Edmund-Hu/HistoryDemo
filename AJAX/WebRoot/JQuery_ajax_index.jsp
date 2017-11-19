<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <h1>注册页面</h1>
  <form action="user" method="post">
  用户名<input type ="text" name ="name" id ="name" ><span style="color:red;" id="message" ></span><br>
  密码<input type ="password" name ="password" id ="password"><br>
  
  <input type ="submit" value="提交"><br>
  
  </form>
  
  </body>
   <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
  <script>
  $(function(){

  $("#name").blur(function(){
  
  // $("#message").load("ajax_user?name="+$("#name").val()); //可以执行！
 	
  	htmlobj=$.ajax({url:"ajax_user?name="+$(this).val(),async:false});
  	$("#message").html(htmlobj.responseText);
  	 
  });
  
  });
  
  
/* 
  window.onload =function (){
  document.getElementById("name").onblur =function(){
  //1.创建XMLHttpRequest对象；
  var x = new XMLHttpRequest;
  //2.通过Open方法与服务器建立连接；
  x.open("get", "ajax_user?name="+this.value, true);
  //3.通过send发送数据；
  x.send();
  //4.设置回调函数
  x.onreadystatechange = function(){
  //当readyState等于4的时候，代表数据接收完成。
  		if(x.readyState==4){
  		//当status等于200的时候数据接收成功！
  			if(x.status==200){
  			//5.处理返回结果
  				document.getElementById("message").innerHTML=x.responseText;
  				//alert(x.responseText);
  			}else{
  			alert("服务器故障！我们会尽快解决，请稍候");
  			}
  		}
  	}
  }
 } */
  
  </script>
</html>
