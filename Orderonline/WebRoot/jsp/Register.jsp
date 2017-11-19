<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	  <link rel="stylesheet" href="css/HomePage.css"/>
  <link type="text/css" href="css/bootstrap.min.css" rel="stylesheet">
  </head>
<script src="js/jquery-1.11.0.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/jquery.validate.js" type="text/javascript"></script>
<script src="js/form.js" type="text/javascript"></script>
  <style>
#register-form{
    width: 800px;
    margin: auto;
    border-image: none;
    padding: 30px;
    border-radius: 3px;
    height:350px;
    background-color: rgba(255,255,255,0.8);
}
.registerHead{
margin:auto;
width:1000px;
height:60px;
color:rgb(255,121,0);
display:block;
background-image: url("img/logo.jpg");
text-align: center;
line-height:60px;
font-size:30px;
}
 body{
        font-family: "Microsoft YaHei";
    }
   
</style>
  <body>
<div class="registerHead">新用户注册</div>

<div style="width:1000px;height:500px;margin:auto;background-image:url('img/register.jpg');padding-top:80px;">
	<form id="register-form" role="form" class="form-horizontal" method="post" action="register/submit">
		<div class="form-group">
			<label class="col-sm-3 control-label" for="username"><span class="glyphicon glyphicon-user"></span>&nbsp&nbsp用&nbsp户&nbsp名：</label>
			<div class="col-sm-5 ">
				<input class="form-control" id="firstname" name="username" />
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-3 control-label" for="password"><span class="glyphicon glyphicon-tag"></span>&nbsp密&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp码：</label>
			<div class="col-sm-5">
				<input class="form-control" id="password" name="password" type="password" />
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-3 control-label" for="confirm_password"><span class="glyphicon glyphicon-tags"></span>&nbsp确认密码：</label>
			<div class="col-sm-5">
				<input class="form-control" id="confirm_password" name="confirm_password" type="password" />
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-3 control-label" for="phone"><span class="glyphicon glyphicon-phone"></span>&nbsp手机号码：</label>
			<div class="col-sm-5">
				<input class="form-control" id="phone" name="phone" />
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-3 control-label" for="address"><span class="glyphicon glyphicon-send"></span>&nbsp送货地址：</label>
			<div class="col-sm-5">
				<input class="form-control" id="address" name="address" />
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-offset-5 col-md-7">
				<button type="submit" class="btn btn-danger btn-sm">注册</button>
				<button type="reset" class="btn btn-danger btn-sm">重置</button>
			</div>
		</div>
	</form>
	
</div>
	   <div class="hp_divfoot">
        &copy成都贝立美科技有限公司保留所有权利 Reserved all rights by Chengdu BeiLiMei science and technology Co.,Ltd.
 </div>
  </body>
</html>
