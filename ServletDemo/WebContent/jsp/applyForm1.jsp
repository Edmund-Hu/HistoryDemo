<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
	<head>
	  <base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>青岛分行国内结算客户费率优惠审批意见表</title>
		<link rel="stylesheet" type="text/css" href="js/jquery/jquery-easyui/easyui.css" />
		<link rel="stylesheet" type="text/css" href="js/jquery/jquery-easyui/icon.css" />
		<link rel="stylesheet" type="text/css" href="css/main.css" />
		<script type="text/javascript" src="js/jquery/jquery.js"></script>
		<script type="text/javascript" src="js/jquery/jquery-easyui/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="js/jquery/jquery-easyui/easyui-lang-zh_CN.js"></script>
		<script type="text/javascript" src="js/santai.core.js"></script>
		<script type="text/javascript" src="js/common/common.js"></script>


	</head>

	<body>
		<div class="easyui-panel" title="青岛分行国内结算客户费率优惠审批意见表" iconCls="ico_280" style="width: 100%;">

		<form id="reduceForm1" action="Demo3" method="post">
			<div class="business_title2">申请机构名称：</div>
			<div class="business_input8">
				<input id="orgName" name="applyOrgName" class="easyui-textbox" style="width:100%;height:24px" data-options="required:true,validType:'maxLength[200]'" value=''/>
			</div>
			<div class="business_title4">机构号：</div>
			<div class="business_input8">
				<input id="orgNum" name="applyOrgCode" class="easyui-textbox" value=''  style="width:100%;height:24px" data-options="validType:'maxLength[60]'"/>
			</div>
			<div class="business_center">账户基本信息</div>
			<div style ="clear: both"></div>
			<div style="width:68%;float:left;border: 1px solid #CCC;border-width: 1px,0,0,0;margin-top:2px; " ></div>
			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">账号：</div>
				<div class="business_input8">
					<input id="accountNum" name="accountCode" class="easyui-textbox" style="width:100%;height:24px" data-options="required:true,validType:'maxLength[200]'" value=''/>
				</div>
				<div class="business_title4">户名：</div>
				<div class="business_input8">
					<input id="accountName" name="accountName" class="easyui-textbox" style="width:100%;height:24px" data-options="validType:'maxLength[60]'"  value='' />
				</div>
			</div>
			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">开户日期：</div>
				<div class="business_input8">

					<input id="openDate" name="openDate"  class="easyui-datebox" style="width:100%;height:24px" />
				</div>
				<div class="business_title4">客户类别：</div>
				<div class="business_input8">
					<select id="accountType" class="easyui-combobox"
							name="customerTypeCode" style="width:100%;" data-options="panelHeight:'100',editable:false">
						<option value=""></option>
						<option value="0" >总行级重点客户</option>
						<option value="1">市行级重点客户</option>
						<option value="2" >行政事业客户</option>
						<option value="3" >其他</option>
					</select>
				</div>
			</div>
			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">PA值（万元）：</div>
				<div class="business_input8">
					<input id="PAValue" name="PAValue" class="easyui-textbox" style="width:100%;height:24px" data-options="required:true,validType:'maxLength[200]'" value=''/>
				</div>
				<div class="business_title4">本外币年日均存款余额（万元）：</div>
				<div class="business_input8">
					<input id="accountDaliyBalance" name="accountDaliyBalance" class="easyui-textbox" value=''  style="width:100%;height:24px" data-options="validType:'maxLength[60]'"/>
				</div>
			</div>
			<div class="business_center">申请优惠内容</div>
			<div style ="clear: both"></div>
			<div style="width:68%;float:left;border: 1px solid #CCC;border-width: 1px,0,0,0;margin-top:2px; " ></div>
			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">优惠项目：</div>
				<div class="business_input8">
					<select id="reduceType" class="easyui-combobox"
							name="reduceItemcode" style="width:100%;" data-options="panelHeight:'300',editable:false">
						<option value="" ></option>
						<option value="0" > 账户开立</option>
						<option value="1">对公账户维护费</option>
						<option value="2" >小额账户管理费</option>
						<option value="3" >电子回单箱服务</option>
						<option value="4" >回单自助打印服务</option>
						<option value="5" >对公短信通</option>
						<option value="6" >中银单位结算卡</option>
						<option value="7" >补制回单、对账单</option>
						<option value="8" >复印留存银行资料及查询服务</option>
						<option value="9" >印鉴更换</option>
						<option value="10" >印鉴挂失</option>
						<option value="11" >账户金钥匙</option>
						<option value="12" >询证函</option>
						<option value="13" >验资证明</option>
						<option value="14" >结算资信证明</option>
						<option value="15" >开户证明</option>
						<option value="16" >存款证明</option>
						<option value="17" >上门服务</option>
						<option value="18" >见证通</option>
						<option value="19" >号易通</option>
						<option value="20" >假日缴款通</option>
						<option value="21" >客户批量收/付款</option>
						<option value="22" >现金汇集服务</option>
						<option value="23" >账户监管服务</option>
						<option value="24" >银房通</option>
						<option value="25" >中银物管通</option>
						<option value="26" >其他</option>



					</select>
				</div>
				<div class="business_title4">优惠幅度：</div>
				<div class="business_input8">
					<select id="reduceRange" name="reduceRangeCode" class="easyui-combobox" style="width:100%;" data-options="panelHeight:'120',editable:false">
						<option value="" ></option>
						<option value="0" >全免</option>
						<option value="1">一折</option>
						<option value="2" >两折</option>
						<option value="3" >三折</option>
						<option value="4" >四折</option>
						<option value="5" >五折</option>
						<option value="6" >六折</option>
						<option value="7" >七折</option>
						<option value="8" >八折</option>
						<option value="9" >九折</option>

					</select>
				</div>

			</div>
			<div style ="clear: both"></div>

			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">优惠期限（最长不超1年）：</div>
				<div class="business_input20">
					<input  name="reduceStartDate" class="easyui-datebox" value=""/> 至
					<input  name="reduceEndDate" class="easyui-datebox" value="" />
				</div>
			</div>
			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">网银客户号/集团号：</div>
				<div class="business_input20">
					<input id="eBankCode" name="eBankCode" class="easyui-textbox" style="width:100%;height:24px" data-options="required:true,validType:'maxLength[200]'" value=''/>
				</div>

			</div>
			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">网银减免类型：</div>
				<div class="business_input8">
					<select id="netReduceType" name="eBankReduceCode"  class="easyui-combobox"
							style="width:100%;" data-options="panelHeight:'120',editable:false">
						<option value="" ></option>
						<option value="0" >企业网银划费及手续费</option>
						<option value="1">认证工具工本费与服务年费</option>
						<option value="2" >企业网上银行操作员服务年费</option>
						<option value="4" >银企对接/定制或增值服务费</option>
					</select>
				</div>
				<div class="business_title4">网银减免幅度：</div>
				<div class="business_input8">
					<select id="netReduceRange" name="eBankRangeCode" class="easyui-combobox"	 style="width:100%;" data-options="panelHeight:'120',editable:false">
						<option value="" ></option>
						<option value="0" >全免</option>
						<option value="1">一折</option>
						<option value="2" >两折</option>
						<option value="3" >三折</option>
						<option value="4" >四折</option>
						<option value="5" >五折</option>
						<option value="6" >六折</option>
						<option value="7" >七折</option>
						<option value="8" >八折</option>
						<option value="9" >九折</option>
					</select>
				</div>
			</div>

			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">

				<div class="business_title2">申请优惠说明：</div>
				<div class="business_input21">
					<input id="closeReason" name="applyNote" value='' class="easyui-textbox" data-options="multiline:true" style="width:100%;height:50px" />
				</div>

			</div>

			<div style ="clear: both"></div>
			<div style="width:100%;">
					<div class="role_window_button2">
						<a id="saveBtn" href="javascript:void(0)" name="saveBtn" class="easyui-linkbutton" data-options="iconCls:'icon-save'"
						   style="padding:3px 0px;width:15%; margin-right:10px;" onclick="formSubmit();">
							<span style="font-size:14px;">提交申请</span>
						</a>
						<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-print'"
						   style="padding:3px 0px;width:20%; margin-right:10px;" >
							<span style="font-size:14px;">保存草稿</span>
						</a>
						<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-print'"
						   style="padding:3px 0px;width:20%; margin-right:10px;" onclick="reset();">
							<span style="font-size:14px;">重置表单</span>
						</a>

					</div>
			</div>

		</form>
	</div>

		
	</body>
<script>
	//表单重置函数；
		function reset(){
			$("#reduceForm1").get(0).reset();
		}

	function formSubmit(){
		$("#reduceForm1").get(0).submit();
	}
	/* $(function(){
		//动态改变优网银惠幅度的选项
		$("#netReduceType").combobox({
			onSelect:function(a){
				console.log(a);
				if(a.text=="企业网银划费及手续费"){
					console.log(true);
					var optionData, json;
					json='[{"id":"0","text":"全免"},' +
							'{"id":"1","text":"一折"},' +
							'{"id":"2","text":"二折"},' +
							'{"id":"3","text":"三折"},' +
							'{"id":"4","text":"四折"},' +
							'{"id":"5","text":"五折"},' +
							'{"id":"55","text":"五五折"},' +
							'{"id":"6","text":"六折"},' +
							'{"id":"65","text":"六五折"},' +
							'{"id":"7","text":"七折"},' +
							'{"id":"75","text":"七五折"},' +
							'{"id":"8","text":"八折"},' +
							'{"id":"85","text":"八五"},' +
							'{"id":"9","text":"九五"},' +
							'{"id":"95","text":"九五折"}]';
					optionData= $.parseJSON(json);
					$("#netReduceRange").combobox({
						valueField:'id',
						textField:'text'
					});
					$("#netReduceRange").combobox("loadData", optionData);
				}else{
					$("#netReduceRange").combobox({
						valueField:'id',
						textField:'text'
					});
				}
			}

		}); */
//动态改变优惠幅度选项

		/* $("#reduceType").combobox({
			onSelect:function(a){
				console.log(a);
				if(a.text=="对公短信通"){
					console.log(true);
					var optionData, json;
					json='[{"id":"10","text":"免费3个月"},' +
							'{"id":"11","text":"免费6个月"},' +
							'{"id":"12","text":"免费9个月"},' +
							'{"id":"0","text":"全免"}]';
					optionData= $.parseJSON(json);
					$("#reduceRange").combobox({
						valueField:'id',
						textField:'text'
					});
					$("#reduceRange").combobox("loadData", optionData);
				}else{
					$("#reduceRange").combobox({
						valueField:'id',
						textField:'text'
					});
				}
			}

		}) */




/* 
	}) */


</script>
</html>