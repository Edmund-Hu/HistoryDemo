
//用户名函数部分.................................................................................
function checkPhoneNO(){
	var objSJ = document.getElementById("SJ");
	var INF = document.getElementById("INF");
	var name = document.getElementById("name");
	if(objSJ.value=="" || objSJ.value==" 您的账户名和登录名"){
		name.style.border="1px solid red";
		INF.style.color="red";	
		objSJ.value="";
		INF.innerHTML="请输入用户名";
		SJ.focus();
		obj.onfocus=function(){
		objSJ.style.border=0;	}
	}
	
}	
function clearContent() {
	var objSJ = document.getElementById("SJ");
	var INF= document.getElementById("INF");
	if(objSJ.value==""||objSJ.value==" 您的账户名和登录名"){
		objSJ.value = "";
		objSJ.style.color="#575757";
		if(INF.style.color=="red"){
			INF.innerHTML="请输入用户名";

		}
		else{
			INF.innerHTML = "支持中文、英文、数字、 \"-\" \"_\"的组合，4-20个字符";
		
		}
	}
}

function recover() {
	var objSJ = document.getElementById("SJ");
	var name = document.getElementById("name");
	var INF= document.getElementById("INF");

	if(objSJ.value==""){
		objSJ.value = " 您的账户名和登录名";
		objSJ.style.color="#DEDEDE";
		name.style.border="1px solid #CCCCCC";
		INF.innerHTML = " ";
		INF.style.color="#DEDEDE";
	}
	else if(objSJ.value.length<4||objSJ.value.length>20){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="长度只能在4-20个字符之间";
	}
	else if(!isNaN(parseInt(objSJ.value))){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="用户名不能是纯数字，请重新输入！";
	
	}else{ INF.innerHTML="";}
}
function recoverh(){
	var INF= document.getElementById("INF");	
	var name = document.getElementById("name");
	name.style.border="1px solid #CCCCCC";
	INF.style.color="#DEDEDE";
	if(objSJ.value=="" || objSJ.value==" 您的账户名和登录名"){
	INF.innerHTML = "";
	}
	else{
	INF.innerHTML = "支持中文、英文、数字、 \"-\" \"_\"的组合，4-20个字符";	
	}
	
}

function enterCheck(){
	var objSJ = document.getElementById("SJ");
	var objSJ2 = document.getElementById("SJ2");
	var name = document.getElementById("name");
	var INF= document.getElementById("INF");

	if(objSJ.value==""){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="请输入用户名";
	}
	else if(objSJ.value.length<4||objSJ.value.length>20){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="长度只能在4-20个字符之间";
	}
	else if(!isNaN(parseInt(objSJ.value))){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="用户名不能是纯数字，请重新输入！";
	
	}else{
		

		clearContent2();
		objSJ2.focus();
	}



}



//设置密码函数部分.................................................................................

function clearContent2() {
	var objSJ = document.getElementById("SJ2");
	var INF= document.getElementById("INF2");
	objSJ.type = "password";
	if(objSJ.value==""||objSJ.value==" 建议使用至少两种字符组合"){
		objSJ.value = "";
		objSJ.style.color="#575757";
		if(INF.style.color=="red"){
			INF.innerHTML="建议至少使用两种字母组合";

		}
		else{
			INF.innerHTML = "建议使用字符、数字和符号两种及其以上字符组合、6-20个字符";
		
		}
	}
}
function recover2() {
	var objSJ = document.getElementById("SJ2");
	var name = document.getElementById("name2");
	var INF= document.getElementById("INF2");
	if(objSJ.value==""){
		objSJ.type = "text";
		objSJ.style.color="#DEDEDE";
		objSJ.value = " 建议使用至少两种字符组合";
		name.style.border="1px solid #CCCCCC";
		INF.innerHTML = " ";
		INF.style.color="#DEDEDE";
	}
	else if(objSJ.value.length<6||objSJ.value.length>20){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="长度只能在6-20个字符之间";
	}
	else if(!isNaN(parseInt(objSJ.value))){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="有盗号风险建议使用字母数字符号两种以上的方式";
	
	}else{ INF.innerHTML="";}
}
function recoverh2(){
	var INF= document.getElementById("INF2");	
	var name = document.getElementById("name2");
	name.style.border="1px solid #CCCCCC";
	INF.style.color="#DEDEDE";
	if(objSJ.value=="" || objSJ.value=="您的账户名和登录名"){
	INF.innerHTML = "";
	}
	else{
	INF.innerHTML = "建议使用字符、数字和符号两种及其以上字符组合、6-20个字符";	
	}

}

function enterCheck2(){
	var objSJ = document.getElementById("SJ2");
	var objSJ2 = document.getElementById("SJ3");
	var name = document.getElementById("name2");
	var INF= document.getElementById("INF2");
	if(objSJ.value==""){
		objSJ.type = "text";
		objSJ.style.color="#DEDEDE";
		objSJ.value = " 建议使用至少两种字符组合";
		name.style.border="1px solid #CCCCCC";
		INF.innerHTML = " ";
		INF.style.color="#DEDEDE";
	}
	else if(objSJ.value.length<6||objSJ.value.length>20){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="长度只能在6-20个字符之间";
	}
	else if(!isNaN(parseInt(objSJ.value))){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="有盗号风险建议使用字母数字符号两种以上的方式";
	
	}else{

		clearContent3();
		objSJ2.focus();
	}



}

//确认密码函数部分.................................................................................



function clearContent3() {
	var objSJ = document.getElementById("SJ3");
	var INF= document.getElementById("INF3");
	if(objSJ.value==""||objSJ.value==" 请再次输入密码"){
		objSJ.value = "";
		objSJ.type = "password";
		objSJ.style.color="#575757";
		if(INF.style.color=="red"){
			INF.innerHTML="请再次输入密码";

		}else{
			INF.innerHTML = "请再次输入密码";
		
		}
	}
}
function recover3() {
	var objSJ = document.getElementById("SJ3");
	var name = document.getElementById("name3");
	var INF= document.getElementById("INF3");
	if(objSJ.value==""||objSJ.value==" 请再次输入密码"){
		objSJ.type = "text";
		objSJ.style.color="#DEDEDE";
		objSJ.value = " 请再次输入密码";
		name.style.border="1px solid #CCCCCC";
		INF.innerHTML = " ";
		INF.style.color="#DEDEDE";
	}
	else if(document.getElementById("SJ3").value!=document.getElementById("SJ2").value){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="两次密码输入不一致";
	}else{ INF.innerHTML="";}

	
	
}


function enterCheck3(){
	var objSJ = document.getElementById("SJ3");
	var objSJ2 = document.getElementById("SJ4");
	var name = document.getElementById("name3");
	var INF= document.getElementById("INF3");
	if(objSJ.value==""||objSJ.value==" 请再次输入密码"){
		objSJ.type = "text";
		objSJ.style.color="#DEDEDE";
		objSJ.value = " 请再次输入密码";
		name.style.border="1px solid #CCCCCC";
		INF.innerHTML = " ";
		INF.style.color="#DEDEDE";
	}
	else if(document.getElementById("SJ3").value!=document.getElementById("SJ2").value){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="两次密码输入不一致";
	}else{ 
		clearContent4();
		objSJ2.focus();
	}



}




//手机验证函数部分.................................................................................

function clearContent4() {
	var objSJ = document.getElementById("SJ4");
	var INF= document.getElementById("INF4");
	if(objSJ.value.length>6&&objSJ.value.length<20){
		objSJ.value = "";
		objSJ.style.color="#575757";
		if(INF.style.color=="red"){
			INF.innerHTML="格式有误";

		}
		else{
			INF.innerHTML = "完成验证后，可以使用该手机登录和找回密码";
		
		}
	}
}
function recover4() {
	var objSJ = document.getElementById("SJ4");
	var name = document.getElementById("name4");
	var INF= document.getElementById("INF4");
	if(objSJ.value==""){
		objSJ.type = "text";
		objSJ.style.color="#DEDEDE";
		objSJ.value = " 建议使用至少两种字符组合";
		name.style.border="1px solid #CCCCCC";
		INF.innerHTML = " ";
		INF.style.color="#DEDEDE";
	}
	else if(objSJ.value.length!=11){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="格式有误";
	
	
	
	}else{ INF.innerHTML="";}
}
function recoverh4(){
	var INF= document.getElementById("INF4");	
	var name = document.getElementById("name4");
	name.style.border="1px solid #CCCCCC";
	INF.style.color="#DEDEDE";
	if(objSJ.value=="" || objSJ.value=="您的账户名和登录名"){
	INF.innerHTML = "";
	}
	else{
	INF.innerHTML = "建议使用字符、数字和符号两种及其以上字符组合、6-20个字符";	
	}

}



function enterCheck4(){
	var objSJ = document.getElementById("SJ4");
	var objSJ2 = document.getElementById("SJ5");
	var name = document.getElementById("name4");
	var INF= document.getElementById("INF4");
	if(objSJ.value==""){
		objSJ.type = "text";
		objSJ.style.color="#DEDEDE";
		objSJ.value = " 建议使用至少两种字符组合";
		name.style.border="1px solid #CCCCCC";
		INF.innerHTML = " ";
		INF.style.color="#DEDEDE";
	}
	else if(objSJ.value.length!=11){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="格式有误";
	}else{ 
		clearContent5();
		objSJ2.focus();
	}



}

//验证码函数部分.................................................................................

function clearContent5() {
		var objSJ = document.getElementById("SJ5");
	var INF= document.getElementById("INF5");
		objSJ.value = "";
		objSJ.style.color="#575757";
		INF.innerHTML = "看不清？点击图片更换验证码";

	
	
}
function recover5() {
	var objSJ = document.getElementById("SJ5");
	var name = document.getElementById("name5");
	var INF= document.getElementById("INF5");
	if(objSJ.value==""){
		objSJ.type = "text";
		objSJ.style.color="#DEDEDE";
		objSJ.value = "请输入验证码";
		name.style.border="1px solid #CCCCCC";
		INF.innerHTML = " ";
		INF.style.color="#DEDEDE";
	}
	else if(objSJ.value.length!=4){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="输入有误";
	
	
	
	}else{ INF.innerHTML="";}
}

function enterCheck5(){
	var objSJ = document.getElementById("SJ5");
	var objSJ2 = document.getElementById("SJ6");
	var name = document.getElementById("name5");
	var INF= document.getElementById("INF5");
	if(objSJ.value==""){
		objSJ.type = "text";
		objSJ.style.color="#DEDEDE";
		objSJ.value = "请输入验证码";
		name.style.border="1px solid #CCCCCC";
		INF.innerHTML = " ";
		INF.style.color="#DEDEDE";
	}
	else if(objSJ.value.length!=4){
		name.style.border="1px solid red";
		INF.style.color="red";
		INF.innerHTML="输入有误";
	}else{ 
		clearContent6();
		objSJ2.focus();
	}



}

//手机验证码函数部分.................................................................................

function clearContent6() {
		var objSJ = document.getElementById("SJ6");
	var INF= document.getElementById("INF6");
		objSJ.value = "";
		objSJ.style.color="#575757";
	

	
	
}
function recover6() {
	var objSJ = document.getElementById("SJ6");
	var name = document.getElementById("name6");
	var INF= document.getElementById("INF6");
	if(objSJ.value==""){
		objSJ.style.color="#DEDEDE";
		objSJ.value = "请输入手机验证码";
		INF.innerHTML = " ";
		
	}else{ INF.innerHTML="";}
	
	
}
function enterCheck6(){
	var objSJ = document.getElementById("SJ6");
	var objSJ2 = document.getElementById("SJ7");
	var name = document.getElementById("name6");
	var INF= document.getElementById("INF6");
	if(objSJ.value==""){
		objSJ.style.color="#DEDEDE";
		objSJ.value = "请输入手机验证码";
		INF.innerHTML = " ";
	}else{ 
		
		objSJ2.focus();
	}



}

function fontChange(x){
	
	var item1 = document.getElementById(x);
	item1.style.color="black";
	item1.style.fontWeight="bold";
	
}
function fontChange2(x){
	var item1 = document.getElementById(x);
	item1.style.color="#454545";
	item1.style.fontWeight="";
	
}


