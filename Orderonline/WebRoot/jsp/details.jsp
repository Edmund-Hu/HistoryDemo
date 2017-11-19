<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>德味轩网上订餐系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	  <link rel="stylesheet" href="css/jPages.css"/>

 <link rel="stylesheet" href="css/details.css"/>


  </head>
  <script src="js/jquery-1.11.0.js"></script>
<script type="text/javascript" language="javascript" src="js/jPages.js"></script>
<script type="text/javascript" language="javascript" src="js/details.js"></script> 
	  <script src="js/parabola.js"></script>

  <body>
  <div class="hp_divhead">
    <span class="hp_logobefore">欢迎光临</span>
    <span class="hp_logoafter">网上订餐系统</span>
    <span class="hp_logoright"><a href="jsp/HomePage.jsp">网站首页</a></span>
    <span class="hp_logoright">|</span>
    <span class="hp_logoright"><a href="">我的资料</a></span>
    <span class="hp_logoright">|</span>
    <span class="hp_logoright"><a href="shopcart/order">我的订单</a></span>
    <input type="hidden" id="userid" value ="${currentUser.userid }">
</div>
<div class="hp_divsearch" style="color:rgb(255,123,0); text-align:center;">
   商品详情 <div id="shopCart" class="hp_divshoppingCart">购物车<div class="cart">0</div></div>
</div>
<div style="width: 1000px;margin: auto;position: relative;">
     <div id="divimg"style="width:798px;height:400px;float:left;"><img id="img" src="img/${good.goodPic }.jpg" alt="" width="800px;" height="400px;" style="position:absolute;"/>
   </div>
          <div style="width:200px;height:400px;float:left;border:1px solid red;background-color: rgba(255,232,0,0.5)">
         <form id="form" method="post">
          <table>
          <tr><td>菜名：</td><td>${good.goodName }</td></tr>
           <tr><td>菜系：</td><td>${good.style }</td></tr>
           <tr><td>口味：</td><td>${good.taste }</td></tr>
          <tr><td>主要食材：</td><td>${good.recipe }</td></tr>
          <tr><td>累计销量：</td><td>${good.saleTotal }份</td></tr>
            <tr><td>今日余量：</td><td><span id="totalcount" >${good.goodcount }</span>份</td></tr>
             <tr><td>选择数量：</td><td><div class="numchange_minus" >-</div>
<input class="num" type="text" readonly="readonly" name="quantity" value="1">
<div class="numchange_plus"> +</div></td></tr>
          </table>
          <input type="botton" value="立刻购买" class="button" id="button1">
          <input type="botton" value="加入购物车" class="button btnCart" id="button2">
             <input type="hidden" value="${good.goodId }"/>
</form>

          </div>
      <div style="width:1000px;"> 
      <img class="imglist" src="img/${good.goodPic }.jpg" width=200px height=100px;>
       <img class="imglist"  src="img/${good.pic1 }.jpg" width=200px height=100px;>
        <img class="imglist"  src="img/${good.pic2 }.jpg" width=200px height=100px;>
         <img  class="imglist" src="img/${good.pic3 }.jpg" width=200px height=100px;><br>
          <img  id="flyItem" class="imglist1" src="img/${good.pic3 }.jpg" width=100px height=50px;>
      </div>    
          
       </div>
<!--   <div id="flyItem" class="fly_item"><img src="img/item-pic.jpg" width="40" height="40"></div> -->
    
   <div class="hp_divfoot" style="position:fixed; bottom:0px;left:50%;margin-left:-500px;">
        &copy成都贝立美科技有限公司保留所有权利 Reserved all rights by Chengdu BeiLiMei science and technology Co.,Ltd.
    </div>
  </body>
</html>
