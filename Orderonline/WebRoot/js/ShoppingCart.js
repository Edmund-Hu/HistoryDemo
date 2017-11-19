
$(function(){
//数量增加并改变单项总价
	$(".numchange_plus").each(function(){
		$(this).click(function(){
			var txt = $(this).prev(":text");
			var tcount =  $(this).next(".totalcount").html();
			var price = $(this).closest("td").prev("td");
			var tp = $(this).closest("td").next("td");
			var strp = price.html().substring(1);
			var $check = $(this).closest("td").prevAll().eq(3).find(":checkbox");
			var a = parseInt(txt.val()); 
			if(a<tcount){			
			txt.val(a+1);
			var tprice = ((a+1)*parseFloat(strp)).toFixed(2);
			tp.html("￥"+tprice);
			plusTotal($check,parseFloat(strp));
			}
		});
	});
	
	//数量减少并改变单项总价
		$(".numchange_minus").each(function(){
			$(this).click(function(){
			var txt = $(this).next(":text");
			var price = $(this).closest("td").prev("td");
			var tp = $(this).closest("td").next("td");
			var strp = price.html().substring(1);
			var $check = $(this).closest("td").prevAll().eq(3).find(":checkbox");
			//check.css("background-color","blue");
			//check.prop("checked","true");
			var a = parseInt(txt.val()); 
			if(a>=1){
			txt.val(a-1);
			var tprice = ((a-1)*parseFloat(strp)).toFixed(2);
			tp.html("￥"+tprice);
			
			minusTotal($check,parseFloat(strp));
			}
		});
	});
	//当选项框被选中的时候将单项总价添加到购物车总价，选项框取消的将购物车总价减去该项单项总价；
	$("input:checkbox").each(function(){
		$(this).change(function(){
		var $before = $(this).prop("checked");
		var $tp = $(this).closest("td").nextAll().eq(4);
		 var $totalMoney = $("#totalMoney");
		var curMoney = parseFloat($totalMoney.html());
		var tMoney=parseFloat($tp.html().substring(1));
	
		//$tp.css("background-color","blue");
			if($before) {
				$totalMoney.html((curMoney+tMoney).toFixed(2));
			}else{
			$totalMoney.html((curMoney-tMoney).toFixed(2));
			}
		});
	});
	//当-按钮按下时，设置总的付款金额
	function minusTotal($check,price){
		if($check.prop("checked")){
			 var $totalMoney = $("#totalMoney");
			var curMoney = parseFloat($totalMoney.html());
			$totalMoney.html((curMoney-price).toFixed(2));
			}
	}
		//当+按钮按下时，设置总的付款金额
	function plusTotal($check,price){
		if($check.prop("checked")){
			 var $totalMoney = $("#totalMoney");
			var curMoney = parseFloat($totalMoney.html());
			$totalMoney.html((curMoney+price).toFixed(2));
			}
	}
	//实现全选功能
	$("#chooseAll").click(function(){
	var total=0;
		$("input:checkbox").each(function(){
		$(this).prop("checked",true);
		 var $tp = $(this).closest("td").nextAll().eq(4);
		var tMoney=parseFloat($tp.html().substring(1));
		total=total+tMoney;
		});
		//alert(total);
		var curMoney = parseFloat($("#totalMoney").html());
		$("#totalMoney").html((curMoney+total).toFixed(2)); 
	});
	//实现取消功能
	$("#cancel").click(function(){
	$("input:checkbox").each(function(){
		$(this).prop("checked",false);
		 var $totalMoney = $("#totalMoney");
		$totalMoney.html("0.00");
		});
	});
	//结算功能
	$(".bottom3").click(function(){
		if($("#totalMoney").html()=="0.00"){
			alert("您没有选择任何商品！");
		}
		else{
		var jsonarr="";
		var jsonobj="";
		$("input:checked").each(function(){
			var pic = $(this).closest("td").nextAll().eq(0).find("img");
			var name = $(this).closest("td").nextAll().eq(1);
			var price = $(this).closest("td").nextAll().eq(2);
			var num = $(this).closest("td").nextAll().eq(3).find("input:text");
			var total = $(this).closest("td").nextAll().eq(4);
			var id = $(this).closest("td").nextAll().eq(5);
			var totalcount =$(this).closest("td").nextAll().eq(3).find(".totalcount");
			//alert(pic.attr("src"));
			//alert(name.html());
			//alert(price.html());
			//alert(num.val());
			//alert(total.html());
			//alert(totalcount.html());
			jsonobj = "{picaddress:'"+pic.attr("src")+"',name:'"+name.html()+"',price:'"+price.html()+"',num:"+num.val()+",totalprice:'"+total.html()+"',goodId:"+id.html()+",totalcount:"+totalcount.html()+"}";
			
			jsonarr =jsonobj+","+jsonarr;
		});
		
		var a = jsonarr.lastIndexOf(",");
		var newjson =  jsonarr.substring(0,a);
		 $("#orderJson").val("["+newjson+"]");
		 $("#totalprice").val($("#totalMoney").html());
		//alert( $("#orderJson").val());
		//alert( $("#totalprice").val());
		$("#jsonform").submit();
		}
	});
	
	
});
