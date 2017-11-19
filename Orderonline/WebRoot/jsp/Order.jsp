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


	  	  <link rel="stylesheet" href="css/ShoppingCart.css"/>
  </head>

  <script src="js/jquery-1.11.0.js"></script>
<script type="text/javascript" language="javascript" src="js/jPages.js"></script>

<script type="text/javascript" language="javascript"  src="js/ShoppingCart.js"></script>

  <body>
  <jsp:include page="../jsp/Head.jsp"></jsp:include>
<div class="hp_divsearch" style="text-align: center;color:rgb(255,51,0);font-weight:bold;" >
   我的订单
</div>
<div style="width:1000px;min-height:600px; overflow:auto;border:1px solid red;margin:auto;">
<c:forEach var="obj" items="${myorders }">

<span class="orderhead">时间：${obj.time }</span><span class="orderhead">订单编号：${obj.orderId }</span>
<c:if test="${obj.status =='未支付' }">
<a href="shopcart/pay?orderId=${obj.orderId }"><span class="orderhead3">立即支付</span></a>
<span class="orderhead2">状态：${obj.status }</span>
<span class="orderhead2">总价：${obj.totalmoney }</span>
</c:if>
<c:if test="${obj.status =='完成' }">
<span class="orderhead3">评价</span>
<span class="orderhead2">状态：${obj.status }</span>
<span class="orderhead2">总价：${obj.totalmoney }</span>
</c:if>
<div style="clear: both;"></div>
<table class="table">
<thead>
<tr class="tr">

<th >图片</th>
<th>菜名</th>
<th>单价</th>
<th>数量</th>
<th>总价</th>
<th style="display:none;">id</th>
</tr>
</thead>
<tbody class="aa">
<c:forEach var="obj2" items="${obj.goodinfo }">
<tr>

<td><img src="${obj2.picaddress }" width="100px" height="60px"></td>
<td>${obj2.name }糖醋排骨</td>
<td>${obj2.price }</td>
<td>
${obj2.num }份
</td>
<td class="total">${obj2.totalprice }</td>
<td style="display:none;">${obj.userId}</td>
</tr>
</c:forEach> 
 


</tbody>

</table>

</c:forEach> 

</div>

    <div class="hp_divfoot">
        &copy成都贝立美科技有限公司保留所有权利 Reserved all rights by Chengdu BeiLiMei science and technology Co.,Ltd.
    </div>

  </body>

</html>
