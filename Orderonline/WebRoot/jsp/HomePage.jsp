<%@page import="com.edmund.entity.User"%>
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

	  <link rel="stylesheet" href="css/jPages.css"/>
	  <link rel="stylesheet" href="css/HomePage.css"/>
  </head>
  <script src="js/jquery-1.11.0.js"></script>
<script type="text/javascript" language="javascript" src="js/jPages.js"></script>

<script type="text/javascript" language="javascript"  src="js/HomePage.js"></script>
  <script type="text/javascript" language="javascript"  src="js/parabola.js"></script>
  <body>
  <c:if test="${sessionScope.goodlist==null }">
 	<c:redirect url="/HomePage/jump"></c:redirect>
  </c:if>
  <div class="hp_divhead">
    <span class="hp_logobefore">欢迎光临</span>
    <span class="hp_logoafter">网上订餐系统</span>
    <span class="hp_logoright"><a href="jsp/HomePage.jsp">网站首页</a></span>
    <span class="hp_logoright">|</span>
    <span class="hp_logoright"><a href="">我的资料</a></span>
    <span class="hp_logoright">|</span>
    <span class="hp_logoright"><a href="shopcart/order">我的订单</a></span>
</div>
<div class="hp_divsearch" ><input type="text" class="inputsearch"/>
    <div class="hp_divsoushuo">&nbsp搜&nbsp索</div>
    <div id ="shopCart" class="hp_divshoppingCart">购物车<div class="cart">0</div></div>
</div>
<div style="width: 1000px;margin: auto;position: relative">
    <div class="hp_divnavi">
        <ul>
            <li><a href="">店长推荐</a></li>
            <li><a href="">今日特价</a></li>
            <li><a href="">面食专区</a></li>
            <li><a href="">炒菜专区</a></li>
            <li><a href="">小吃专区</a></li>
            <li><a href="">汤锅专区</a></li>
            <li><a href="">豪华套餐</a></li>
            <li><a href="">超值套餐</a></li>
            <li><a href="">会员专区</a></li>
            <li><a href="">更多惊喜</a></li>
        </ul>
    </div>
    <div class="hp_divphoto">
        <ul id="itemContainer">
        <c:forEach var="good" items="${goodlist }" begin="3" end ="8">
               <li><a class=" defaulta" href="HomePage/detail?goodId=${good.goodId }"><img src="img/${good.goodPic }.jpg" alt=""/></a></li>
        </c:forEach>
  
        </ul>
        <div class="holder2"  id="holder"></div>
    </div>
    <div class="hp_divlogin" >
    <c:if test="${sessionScope.currentUser == null }">
    <br>
        <form action="user/login" method ="post" width: 220px;height: 130px; border: 0px solid red;margin:20px 0 0 5px;">
            <table>
                <tr>
                    <td>用户名</td>
                    <td colspan="2"><input type="text" class="input2" name="username"/></td>
                </tr>
                <tr>
                <tr>
                    <td>密码</td>
                    <td colspan="2"><input type="password" class="input2" name="password"/></td>
                </tr>
                <tr>
                    <td>验证码</td>
                    <td ><input type="text" class="input1" name="safecode"/></td>
                  <td class="input1">验证码</td>
                </tr>
                <tr>
                    <td></td>
                    <td colspan="2"><input type="submit" value="登录"/>
                   <a href="jsp/Register.jsp"> <input type="button" value="注册"/></a></td>
                </tr>
                <tr><td colspan="3" style="text-align: center;">${requestScope.message }</td></tr>
            </table>
        </form>
       </c:if> 
          <c:if test="${sessionScope.currentUser != null }">
          <br>
          <p style="text-align: center;font-size:20px;">欢迎${currentUser.username }光临本店</p>
         <span style="margin-left:5px;font-weight: bold">您的预留电话是</span>：<br><input type="hidden" id="userid" value ="${currentUser.userid }">
         <span style="margin-left:5px;">${currentUser.phone }</span><br>
         <span style="margin-left:5px;font-weight: bold">您的送餐地址是：<br></span>
         <span style="margin-left:5px;">${currentUser.address }</span>
         <br>
          </c:if>
          <br>
        <span style="margin-left: 5px;font-weight: bold;">店铺动态：</span>
        <ol>
            <li>今日部分菜品八折</li>
            <li>最美服务员评比</li>
            <li>我店厨师荣获。。</li>
            <li>会员卡开办须知</li>
        </ol>

    </div>
    <div style="clear:both;"></div>
    <div class="hp_divlist">
        <span style="margin-left: 10px; color: red;">热销排行:</span>
        <div class="hp_divlistcontent">
            <img src="img/1.jpg" alt="" width="170px;" height="80px;"/>
       <span style="margin:5px 0 0 5px; float:left">糖醋排骨</span>
            <span style="margin:5px 5px 0 0;float:right">热销83份</span>
            <div style="clear: both"></div>

        <span class="hp_price">&yen23.00</span>
        </div>
        <!--222-->
        <div class="hp_divlistcontent">
            <img src="img/2.jpg" alt="" width="170px;" height="80px;"/>
            <span style="margin:5px 0 0 5px; float:left">宫廷鳝鱼</span>
            <span style="margin:5px 5px 0 0;float:right">热销48份</span>
            <div style="clear: both"></div>

            <span class="hp_price">&yen33.00</span>
        </div>

        <!--333-->
        <div class="hp_divlistcontent">
            <img src="img/3.jpg" alt="" width="170px;" height="80px;"/>
            <span style="margin:5px 0 0 5px; float:left">蒜薹肉丝</span>
            <span style="margin:5px 5px 0 0;float:right">热销45份</span>
            <div style="clear: both"></div>

            <span class="hp_price">&yen18.00</span>
        </div>
    </div>
    <div class="hp_divdetail" id="items">
  
<c:forEach var="good" items="${goodlist }">
  <div class="hp_divdetailcontent">
           <a class=" defaulta" href="HomePage/detail?goodId=${good.goodId }">
            <img src="img/${good.goodPic }.jpg" alt="" width="240px;" height="150px;"/></a>
            
            <span style="margin:5px 0 0 5px; float:left">${good.goodName }</span>
            <span style="margin:5px 5px 0 0;float:right">热销${good.saleTotal }份</span>
            <div style="clear: both"></div>
            <span class="hp_price">&yen${good.goodPrice }0</span>
            <div class="hp_divlable">立刻购买</div>
       <div class="hp_divlable btnCart">加入购物车</div>
       <input type="hidden" value="${good.goodId }"/>
            
        </div>

</c:forEach>
  <div class="holder" id="holder2"></div>
</div>
<div id="flyItem" class="fly_item"><img src="img/item-pic.jpg" width="40" height="40"></div>
  <div class="hp_divfoot">
        &copy四川狮子座互联网科技有限公司保留所有权利 Reserved all rights by shizizuo internet science and technology Co.,Ltd.
    </div>
</div>
  </body>

</html>
