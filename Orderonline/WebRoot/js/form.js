﻿$(document).ready(function() {
	// 手机号码验证
	jQuery.validator.addMethod("isPhone", function(value, element) {
		var length = value.length;
		return this.optional(element) || (length == 11 && /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/.test(value));
	}, "请正确填写您的手机号码");

	// 电话号码验证
	jQuery.validator.addMethod("isTel", function(value, element) {
		var tel = /^(\d{3,4}-)?\d{7,8}$/g; // 区号－3、4位 号码－7、8位
		return this.optional(element) || (tel.test(value));
	}, "请正确填写您的电话号码");
	// 匹配密码，以字母开头，长度在6-12之间，必须包含数字和特殊字符。
	jQuery.validator.addMethod("isPwd", function(value, element) {
		var str = value;
		if (str.length < 6 || str.length > 18)
			return false;
		if (!/^[a-zA-Z]/.test(str))
			return false;
		if (!/[0-9]/.test(str))
			return fasle;
		return this.optional(element) || /[^A-Za-z0-9]/.test(str);
	}, "字母开头，长度在6-12之间，必须包含数字和特殊字符");
	//Ajax验证用户名是否存在
	jQuery.validator.addMethod("isEst", function(value, element) {
		//alert(1);
		var result;
		$(function(){
			
				obj=$.ajax({url:"register/ajax?name="+value,async:false});
				//alert(obj.responseText);
				if(obj.responseText=="true"){
					result=true;
				}else{
					result=false;
				}
				//alert(result);
		});
		return this.optional(element) ||result;
	},"用户名已经被使用");

	
	$("#register-form").validate({
		errorElement : 'span',
		errorClass : 'help-block',

		rules : {
			username : {
				required : true,
				minlength:4,
				maxlength:12,
				isEst: true
			},
			password : {
				required : true,
				isPwd : true
			},
			confirm_password : {
				required : true,
				isPwd : true,
				equalTo : "#password"
			},
			phone : {
				required : true,
				isPhone : true
			},
		
			address : {
				minlength : 10
			}
		},
		messages : {
			username :{
				required : "请输入姓名",
				minlength:"用户名最小长度为4",
				maxlength:"用户名最小长度为12",
				isEst:"用户名已经存在"
			},
		
			password : {
				required : "请输入密码",
				minlength : jQuery.format("密码不能小于{0}个字 符")
			},
			confirm_password : {
				required : "请输入确认密码",
				minlength : "确认密码不能小于5个字符",
				equalTo : "两次输入密码不一致不一致"
			},
			phone : {
				required : "请输入手机号码"
			},

			address : {
				required : "请输入配送地址",
				minlength : jQuery.format("配送地址不能少于{0}个字符")
			}
		},
		errorPlacement : function(error, element) {
			//element.next().remove();
			//信息错误时，显示X；
			element.after('<span class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>');
			//错误提示信息的位置为
			element.closest('.form-group').append(error);
		},
		highlight : function(element) {
			//设置错误信息的格式
			$(element).closest('.form-group').addClass('has-error has-feedback');
		},
		success : function(label) {
			var el=label.closest('.form-group').find("input");
			//移除X符号
			el.next().remove();
			//信息错误时，显示V
			el.after('<span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span>');
			//信息验证成功时的格式设置
			label.closest('.form-group').removeClass('has-error').addClass("has-feedback has-success");
			label.remove();
		}
		/*submitHandler: function(form) { 
			$("#register-form").submit();
			alert("submitted!");
		}*/

	})
});