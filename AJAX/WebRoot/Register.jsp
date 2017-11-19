<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//System.out.print(basePath);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>个人注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


<style>
body{margin:0px;font-family:Microsoft YaHei;}
.head{ width:100%;height:90px;border:1px solid #CCCCCC;border-width:0px 0px 1px 0px;position:relative;
	min-width:1300px;margin: 0px 0px 30px 0px;}
.input_default{border:0px solid #CCCCCC;height:50px;width:290px;line-height:50px;outline:none;margin-left:10px;
		float:right;color:#DEDEDE;font-size:15px;font-family:Microsoft YaHei;
	}
.input_outside{float:right;margin-right:100px;border:1px solid #CCCCCC;height:50px;width:400px;line-height:50px;
		text-align:left;color:#454545;font-size:15px;
		}
.input_default1{border:0px solid #CCCCCC;height:20px;width:400px;line-height:20px;margin:5px 100px 5px 0px;
		float:right;color:#DEDEDE;font-size:12px;font-family:Microsoft YaHei;
		}
.input_default3{border:1px solid #CCCCCC;height:50px;width:290px;line-height:50px;border-width:0px 0px 0px 1px;outline:none;margin-left:10px;
		float:right;color:#DEDEDE;font-size:15px;font-family:Microsoft YaHei;
	}

.button_outside{float:right;margin-right:100px;border:1px solid #CCCCCC;height:50px;width:400px;line-height:50px;
		text-align:center;color:white;font-size:15px;font-family:Microsoft YaHei;background-color:#CE0000;
		}
.yanzheng{ border:1px solid #CCCCCC;height:40px;width:100px;line-height:40px;border-width:0px 0px 0px 1px;outline:none;background-color:#454545;
		float:right;color:#DEDEDE;font-size:15px;font-family:Microsoft YaHei;
	}

.input_default4{border:0px solid #CCCCCC;height:45px;width:210px;line-height:45px;outline:none;margin-top:3px;float:right;
		color:#DEDEDE;font-size:15px;font-family:Microsoft YaHei;
	}

.href{color:#454545;text-decoration:none;}

</style>
<script type="text/javascript" src="js/fun.js"></script>


</head>

<body>
<div class="head"><img src="img/jdzc.JPG"> <div style="position:absolute;right:200px;top:50px;width:150px;height:30px;">已有账号 <font color=black;><a href="../7-15/找回密码.html">请登录</a></font></div>
	
</div>
<div style="float:left;width:55%;height:600px;border:1px solid #CCCCCC; border-width:0px 1px 1px 1px;margin-top:70px;">
	<div class="input_outside" id="name">
		 &nbsp&nbsp 用&nbsp&nbsp 户&nbsp&nbsp 名&nbsp <input type = "text" value=" 您的账户名和登录名" id="SJ" onclick="clearContent();" onblur="recover(); checkName();" class="input_default" oninput="recoverh();" onkeypress="if(event.keyCode==13) enterCheck();">
	</div>
	<div style="clear:both;"></div>
	<div id="INF" class="input_default1"></div>
	<div style="clear:both;"></div>	
	<div class="input_outside" id="name2">
		 &nbsp&nbsp 设 置 密 码&nbsp <input type = "text" value=" 建议使用至少两种字符组合" id="SJ2" onclick="clearContent2();" onblur="recover2();" class="input_default" oninput="recoverh2();"onkeypress="if(event.keyCode==13) enterCheck2();" >
	</div>
	<div style="clear:both;"></div>
	<div id="INF2" class="input_default1"></div>
	<div style="clear:both;"></div>
	<div class="input_outside" id="name3">
		 &nbsp&nbsp 确 认 密 	码&nbsp <input type = "text" value=" 请再次输入密码" id="SJ3" onclick="clearContent3();" onblur="recover3();" class="input_default" oninput="recoverh3();" onkeypress="if(event.keyCode==13) enterCheck3();">
	</div>
	<div style="clear:both;"></div>
	<div id="INF3" class="input_default1"></div>
	<div style="clear:both;"></div>

	<div class="input_outside" id="name4">
		 &nbsp&nbsp 中国 + 86&nbsp <input type = "text" value=" 建议使用常用手机" id="SJ4" onclick="clearContent4();" onblur="recover4();" class="input_default3" oninput="recoverh4();"onkeypress="if(event.keyCode==13) enterCheck4();">
	</div>
	<div style="clear:both;"></div>
	<div id="INF4" class="input_default1"></div>
	<div style="clear:both;"></div>


	<div class="input_outside" id="name5">
		 &nbsp&nbsp 验&nbsp 证&nbsp 码&nbsp <input type = "text" value="请输入验证码" id="SJ5" onclick="clearContent5();" onblur="recover5();" class="input_default" oninput="recoverh5();"onkeypress="if(event.keyCode==13) enterCheck5();">
	</div>
	<div style="clear:both;"></div>
	<div id="INF5" class="input_default1"></div>
	<div style="clear:both;"></div>


	<div  style="float:right;margin-right:100px;border:1px solid #CCCCCC;height:50px;width:400px;">
		<div id="name6" style="float:left;color:#454545;font-size:15px; height:45px;line-height:45px;border:0px solid #CCCCCC;width:100px;margin-top:1px;"> &nbsp 手机验证码</div>
		<div style="float:right;width:80px;height:45px;border:1px solid red;margin-top:2px;">验证码****</div>
	<input type = "text" value="请输入手机验证码" id="SJ6" onclick="clearContent6();" onblur="recover6();" class="input_default4" oninput="recoverh6();"onkeypress="if(event.keyCode==13) enterCheck6();">
	
	</div>
	<div style="clear:both;"></div>

	<div id="INF6" class="input_default1"></div>
	<div style="clear:both;"></div>
	<input type = "button" value="提交" onclick="checkPhoneNO();" class="button_outside" id="SJ7" >
</div>
<div style=" float:right;width:44%;height:600px;border:0px solid #CCCCCC; border-width:0px 0px 0px 1px;margin-top:70px;">
	<div  style="width:280px;height:280px;border:0px solid #CCCCCC;margin: 0px 0px 0px 30px"><img src="jdzc2.jpg" width=280px;height=300px; > </div>
	<div id="QIYE" style="width:100px;height:30px;border:0px solid #CCCCCC;margin: 30px 0px 0px 100px;text-align:left;line-height:30px;color:#454545;" onmouseover="fontChange('QIYE');" onmouseout="fontChange2('QIYE');"><a class="href" href="../7-15/企业注册.html">企业用户注册</a> </div>
	<div style="width:210px;height:30px;margin-left:60px;margin-top:30px;"><hr style="height:2px;border:none;border-top:2px solid #DEDEDE"></div>
	<div id="CUS" style="width:140px;height:40px;border:0px solid #CCCCCC;margin: 0px 0px 0px 100px;text-align:left;color:#454545;" onmouseover="fontChange('CUS');" onmouseout="fontChange2('CUS');"> INTERNATIONAL CUSTOMES</div>


</div>
</body>
</html>

	

