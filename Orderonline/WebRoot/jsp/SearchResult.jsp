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
 <link rel="stylesheet" href="css/searchresult.css"/>
	<!--     <link rel="stylesheet" href="css/HomePage.css"/> -->
  </head>
  <script src="js/jquery-1.11.0.js"></script>
<script type="text/javascript" language="javascript" src="js/jPages.js"></script>
<!-- <script type="text/javascript" language="javascript"  src="js/HomePage.js"></script> -->
<script>
$(function(){
   $("#holder2").jPages({
            containerID: "items",
           perPage: 6,
            previous:"上一页",
            next :"下一页"
        });
})

</script>

  <body>
  <div class="hp_divhead">
    <span class="hp_logobefore">欢迎光临</span>
    <span class="hp_logoafter">网上订餐系统</span>
    <span class="hp_logoright"><a href="">客服中心</a></span>
    <span class="hp_logoright">|</span>
    <span class="hp_logoright"><a href="">我的资料</a></span>
    <span class="hp_logoright">|</span>
    <span class="hp_logoright"><a href="">我的订单</a></span>
</div>
<div class="hp_divsearch" ><input type="text" class="inputsearch"/>
   <a href=""> <div class="hp_divsoushuo">&nbsp搜&nbsp索</div></a>
    <a href=""><div class="hp_divshoppingCart">购物车</div></a>
</div>
<div style="width: 1000px;margin: auto;position: relative;">
     
    <div class="hp_divlist">
  
<!--     <div class="hp_divnavi"> -->
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
<!--     </div> -->
    </div>
    <div class="hp_divdetail" id="items">

        <div class="hp_divdetailcontent">
            <img src="img/4.jpg" alt="" width="240px;" height="150px;"/>
            <span style="margin:5px 0 0 5px; float:left">蒜蓉扇贝</span>
            <span style="margin:5px 5px 0 0;float:right">热销53份</span>
            <div style="clear: both"></div>
            <span class="hp_price">&yen53.00</span>
            <div class="hp_divlable">8折</div>
            <div class="hp_divlable">购买</div>
        </div>

        <div class="hp_divdetailcontent">
            <img src="img/2.jpg" alt="" width="240px;" height="150px;"/>
            <span style="margin:5px 0 0 5px; float:left">宫廷鳝鱼</span>
            <span style="margin:5px 5px 0 0;float:right">热销48份</span>
            <div style="clear: both"></div>
            <span class="hp_price">&yen33.00</span>
            <div class="hp_divlable">8折</div>
            <div class="hp_divlable">购买</div>
        </div>


        <div class="hp_divdetailcontent">
            <img src="img/3.jpg" alt="" width="245px;" height="150px;"/>
            <span style="margin:5px 0 0 5px; float:left">蒜薹肉丝</span>
            <span style="margin:5px 5px 0 0;float:right">热销45份</span>
            <div style="clear: both"></div>
            <span class="hp_price">&yen18.00</span>
            <div class="hp_divlable">8折</div>
            <div class="hp_divlable">购买</div>
        </div>

        <div class="hp_divdetailcontent">
            <img src="img/6.jpg" alt="" width="245px;" height="150px;"/>
            <span style="margin:5px 0 0 5px; float:left">老卤肥肠</span>
            <span style="margin:5px 5px 0 0;float:right">热销56份</span>
            <div style="clear: both"></div>
            <span class="hp_price">&yen25.00</span>
            <div class="hp_divlable">8折</div>
            <div class="hp_divlable">购买</div>
        </div>

        <div class="hp_divdetailcontent">
            <img src="img/7.jpg" alt="" width="245px;" height="150px;"/>
            <span style="margin:5px 0 0 5px; float:left">冰镇香蕉</span>
            <span style="margin:5px 5px 0 0;float:right">热销40份</span>
            <div style="clear: both"></div>
            <span class="hp_price">&yen32.00</span>
            <div class="hp_divlable">8折</div>
            <div class="hp_divlable">购买</div>
        </div>

        <div class="hp_divdetailcontent">
            <img src="img/8.jpg" alt="" width="245px;" height="150px;"/>
            <span style="margin:5px 0 0 5px; float:left">水煮肉片</span>
            <span style="margin:5px 5px 0 0;float:right">热销45份</span>
            <div style="clear: both"></div>
            <span class="hp_price">&yen30.00</span>
            <div class="hp_divlable">8折</div>
            <div class="hp_divlable">购买</div>
        </div>

        <div class="hp_divdetailcontent">
            <img src="img/9.jpg" alt="" width="245px;" height="150px;"/>
            <span style="margin:5px 0 0 5px; float:left">卤肉套饭</span>
            <span style="margin:5px 5px 0 0;float:right">热销45份</span>
            <div style="clear: both"></div>
            <span class="hp_price">&yen20.00</span>
            <div class="hp_divlable">8折</div>
            <div class="hp_divlable">购买</div>
        </div>
        <div class="hp_divdetailcontent">
            <img src="img/10.jpg" alt="" width="245px;" height="150px;"/>
            <span style="margin:5px 0 0 5px; float:left">葱香排骨</span>
            <span style="margin:5px 5px 0 0;float:right">热销45份</span>
            <div style="clear: both"></div>
            <span class="hp_price">&yen30.00</span>
            <div class="hp_divlable">8折</div>
            <div class="hp_divlable">购买</div>
         </div>

        <div class="hp_divdetailcontent">
            <img src="img/11.jpg" alt="" width="245px;" height="150px;"/>
            <span style="margin:5px 0 0 5px; float:left">情人蛋糕</span>
            <span style="margin:5px 5px 0 0;float:right">热销43份</span>
            <div style="clear: both"></div>
            <span class="hp_price">&yen88.00</span>
            <div class="hp_divlable">8折</div>
            <div class="hp_divlable">购买</div>
        </div>

        <div class="hp_divdetailcontent">
            <img src="img/12.jpg" alt="" width="245px;" height="150px;"/>
            <span style="margin:5px 0 0 5px; float:left">宫保鸡丁</span>
            <span style="margin:5px 5px 0 0;float:right">热销45份</span>
            <div style="clear: both"></div>
            <span class="hp_price">&yen23.00</span>
            <div class="hp_divlable">8折</div>
            <div class="hp_divlable">购买</div>
        </div>
    <div class="holder" id="holder2"></div>
    </div>
</div>
   <div class="hp_divfoot">
        &copy成都贝立美科技有限公司保留所有权利 Reserved all rights by Chengdu BeiLiMei science and technology Co.,Ltd.
    </div>
  </body>
</html>
