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
    
    <title>德味轩网上订餐系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

<!-- 	  <link rel="stylesheet" href="css/jPages.css"/> -->
	  	  <link rel="stylesheet" href="css/ShoppingCart.css"/>
  </head>

  <script src="js/jquery-1.11.0.js"></script>
<script type="text/javascript" language="javascript" src="js/jPages.js"></script>
<!-- <script type="text/javascript" language="javascript"  src="js/HomePage.js"></script> -->
<script type="text/javascript" language="javascript"  src="js/ShoppingCart.js"></script>

  <body>
  <jsp:include page="../jsp/Head.jsp"></jsp:include>
<div class="hp_divsearch" style="text-align: center;color:rgb(255,51,0);font-weight:bold;" >
   我的购物车
</div>
<div style="width:1000px;min-height:600px; overflow:auto;border:1px solid red;margin:auto;">
<table class="table">
<thead>
<tr class="tr">
<th style="width:50px;">选择</th>
<th >图片</th>
<th>菜名</th>
<th>单价</th>
<th>数量</th>
<th>总价</th>
<th style="display:none;">id</th>
</tr>
</thead>
<tbody>
<c:forEach var="obj" items="${mycarts }">
<tr>
<td  style="width:50px;" ><input type="checkbox"/></td>
<td><img src="img/${obj[1].goodPic }.jpg" width="100px" height="60px"></td>
<td>${obj[1].goodName }</td>
<td>￥${obj[1].goodPrice }</td>
<td>
<div style="position:relative;left:50%;margin-left:-30px;">
<div class="numchange_minus" >-</div>
<input class="num" type="text" readonly="readonly" value="${obj[0].count }">
<div class="numchange_plus">+</div>
<div class="totalcount">${obj[1].goodcount }</div>
</div>
</td>
<td class="total">￥${obj[1].goodPrice*obj[0].count }</td>
<td style="display:none;">${obj[1].goodId }</td>
</tr>
</c:forEach>



</tbody>

</table>
</div>
<div style="width:1000px;height:50px;position: fixed;bottom: 10px;left:50%;margin-left:-500px;font-size:12px;line-height:50px;z-index:100;background-color:rgba(200,200,200,0.8)">
<span class="bottom1"><span id="chooseAll">全选</span>|<span id="cancel">取消</span>|<a class= "a1" href="">删除</a></span>
<span class="bottom2">总价：￥<span id="totalMoney">0.00</span></span>
<span class="bottom3" >结算</span>
 </div>
 <form action = "shopcart/calculate" method= "post" id="jsonform">
 <input type="hidden"  name="orderJson" id="orderJson">
 <input type="hidden"  name="totalprice" id="totalprice">
 </form>
    <div class="hp_divfoot">
        &copy成都贝立美科技有限公司保留所有权利 Reserved all rights by Chengdu BeiLiMei science and technology Co.,Ltd.
    </div>

  </body>

</html>
