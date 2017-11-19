$(function () {
        $("#holder").jPages({
            containerID: "itemContainer",
            perPage:    1,
            pause: 5000,
            first: false,
            previous: false,
            next: false,
            last: false,
            links: "blank"
        });
    $("#holder2").jPages({
            containerID: "items",
           perPage: 6,
            previous:"上一页",
            next :"下一页"
        });
    
 

        
    });

$(function() {
	//alert(1);
	// 元素以及其他一些变量
	var eleFlyElement = document.querySelector("#flyItem"), eleShopCart = document.querySelector("#shopCart");
	var numberItem = 0;
	// 抛物线运动
	var myParabola = funParabola(eleFlyElement, eleShopCart, {
		speed: 400, //抛物线速度
		curvature: 0.0009, //控制抛物线弧度
		complete: function() {
			eleFlyElement.style.visibility = "hidden";
			eleShopCart.querySelector("div").innerHTML = ++numberItem;
		}
	});
	// 绑定点击事件
if (eleFlyElement && eleShopCart) {
		
		[].slice.call(document.getElementsByClassName("btnCart")).forEach(function(button) {
			button.addEventListener("click", function(event) {
			      if($("#userid").val()==null){
			        	alert("请先登录！");
			        	
			        }else{
			        	var goodid = $(this).next(":hidden").val();
						var userid = $("#userid").val();
						obj=$.ajax({url:"shopcart/add?userId="+userid+"&goodId="+goodid,async:false});
				
						if("货物库存不足！"==obj.responseText){
							alert(obj.responseText);
							}else{
								// 滚动大小
								var scrollLeft = document.documentElement.scrollLeft || document.body.scrollLeft || 0,
								    scrollTop = document.documentElement.scrollTop || document.body.scrollTop || 0;
								eleFlyElement.style.left = event.clientX -150+  "px";
								eleFlyElement.style.top = event.clientY + "px";
								eleFlyElement.style.visibility = "visible";
								
								// 需要重定位
								myParabola.position().move();	
								
							}
			        	
			        	
				
			
			        }
			});
		});

	}

});

$(function(){

	$("#shopCart").click(function(){
		  if($("#userid").val()==null){
	      	
			  alert("请先登录！");
	      	
	      }else{
	      	var userid = $("#userid").val();
	      	location.href="shopcart/jump?userId="+userid;
	      }

	});
	
	
});

