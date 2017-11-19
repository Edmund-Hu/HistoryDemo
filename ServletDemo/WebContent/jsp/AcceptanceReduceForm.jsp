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
		<title>银行承兑汇票承兑业务手续费减免审批申请表</title>
		<link rel="stylesheet" type="text/css" href="js/jquery/jquery-easyui/easyui.css" />
		<link rel="stylesheet" type="text/css" href="js/jquery/jquery-easyui/icon.css" />
		<link rel="stylesheet" type="text/css" href="css/main.css" />
		<script type="text/javascript" src="js/jquery/jquery.js"></script>
		<script type="text/javascript" src="js/jquery/jquery-easyui/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="js/jquery/jquery-easyui/easyui-lang-zh_CN.js"></script>
		<script type="text/javascript" src="js/santai.core.js"></script>
		<script type="text/javascript" src="js/common/common.js"></script>

		<script language="javascript" type="text/javascript">	

		</script>
	</head>
	<script>
	  <s:if test="#request.rstFlag == 'true'">
	  console.log("完成？？？");
	  if(confirm("添加成功！是否继续添加？")){
		  window.location.assign("getForm2.action");
		  }else{
		  window.location.assign("blankmain.action");
		  }
 		 </s:if>
	</script>
	<body>
		<div class="easyui-panel" title="银行承兑汇票承兑业务手续费减免审批申请表" iconCls="ico_280" style="width: 100%;">
		<form id="reduceForm2" action="Demo3" method="post">

				<div class="business_title2">编号：</div>
				<div class="business_input20">
					<input id="formNo" name="formNo" class="easyui-textbox" style="width:100%;height:24px" data-options="required:true,validType:'maxLength[200]'" value='XXXX分支行银承手续费减免-20XX年-XX号'/>
				</div>

			<div style ="clear: both"></div>
				<div style="margin-top: 5px;">
					<div class="business_title2">申请机构名称：</div>
					<div class="business_input20">
						<input id="accountNum" name="applyDepartName" class="easyui-textbox" 
						style="width:100%;height:24px" data-options="required:true,validType:'maxLength[200]'" value=''/>
					</div>

				</div>

				<div style ="clear: both"></div>
				<div style="margin-top: 5px;">
					<div class="business_title2">	承兑申请人名称：</div>
					<div class="business_input20">
						<input id="applyerName" name="applyerName" class="easyui-textbox" style="width:100%;height:24px" data-options="required:true,validType:'maxLength[200]'" value=''/>
					</div>

				</div>

			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">承兑申请人结算账户账号：</div>
				<div class="business_input8">

					<input id="applyerSettleAccountCode" name="applyerSettleAccountCode" type="text" class="easyui-textbox" style="width:100%;height:24px" />
				</div>
				<div class="business_title4">承兑申请人保证金账户账号：</div>
				<div class="business_input8">
					<input id="applyerMarginAccountCode" name="applyerMarginAccountCode" type="text" class="easyui-textbox" style="width:100%;height:24px" />
				</div>
			</div>
			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">承兑申请人日均存款余额（万元）：</div>
				<div class="business_input8">
					<input id="applyerDailyBalance" name="applyerDailyBalance" class="easyui-textbox" style="width:100%;height:24px" data-options="required:true,validType:'maxLength[200]'" value=''/>
				</div>
				<div class="business_title4">利润贡献(如存贷款收益、中收等)：</div>
				<div class="business_input8">
					<input id="applyerProfitContribution" name="applyerProfitContribution" class="easyui-textbox" value=''  style="width:100%;height:24px" data-options="validType:'maxLength[60]'"/>
				</div>
			</div>
			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">年承兑汇票签发量（万元）	：</div>
				<div class="business_input8">
					<input id="annualDraftCount" name="annualDraftCount" class="easyui-textbox" style="width:100%;height:24px" data-options="required:true,validType:'maxLength[200]'" value=''/>
				</div>
				<div class="business_title4">开票形式：</div>
				<div class="business_input8">
					<select id="draftCode" class="easyui-combobox" name="draftCode"
							name="draftCode" style="width:100%;" data-options="panelHeight:'80',editable:false">
						<option value="" >请选择</option>
						<option value="0" >纸质</option>
						<option value="1">电票</option>

					</select>
				</div>
			</div>
			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">本笔业务申请金额（万元）：</div>
				<div class="business_input8">
					<input id="applyCash" name="applyCash" class="easyui-textbox" style="width:100%;height:24px" data-options="required:true,validType:'maxLength[200]'" value=''/>
				</div>
				<div class="business_title4">本笔业务张数：</div>
				<div class="business_input8">
					<input id="applyQuantity"  name="applyQuantity" class="easyui-textbox" value=''  style="width:100%;height:24px" data-options="validType:'maxLength[60]'"/>
				</div>
			</div>

			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
					<div class="business_title2">客户基本情况介绍（包括但不限于企业规模、我行结算量情况、授信情况、今年以来票据业务量等）：</div>
					<div class="business_input21">
						<input id="customerBriefInfo" name="customerBriefInfo" value='' class="easyui-textbox" data-options="multiline:true" style="width:100%;height:80px" />
					</div>
			</div>
			<div style ="clear: both"></div>

			<div style="margin-top: 5px;">
				<div class="business_title2">按照规定应执行的费率标准：</div>
				<div class="business_input20">
					<select id="originalStandardRate" class="easyui-combobox" name="originalStandardRate"
							style="width:100%;" data-options="panelHeight:'120',editable:false">
						<option value="" >请选择</option>
						<option value="0" >汇票期限3个月(含)以内，按票面金额的0.05%收取</option>
						<option value="1">汇票期限3-6个月(含)以内，按票面金额的0.06%收取</option>
						<option value="2">汇票期限6-9个月(含)以内，按票面金额的0.08%收取(限电票)</option>
						<option value="3">汇票期限9-12个月(含)以内，按票面金额的0.1%收取(限电票)</option>
						<option value="4">收费下限最低500元/张</option>
					</select>
				</div>

			</div>
			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">

				<div class="business_title2">减免费率值：</div>
				<div class="business_input8">
					<input id="applyRateValue" name="applyRateValue" class="easyui-textbox" value=''  style="width:100%;height:24px" data-options="validType:'maxLength[60]'"/>
				</div>
				<div class="business_title4">减免费率单位：</div>
				<div class="business_input8">
					<select id="applyRateCode" class="easyui-combobox"
							name="applyRateCode" style="width:100%;" data-options="panelHeight:'80',editable:false">
						<option value="" >请选择</option>
						<option value="0" >元/张</option>
						<option value="1">%的费率</option>
						<option value="2">其他</option>
					</select>
				</div>
			</div>
			<div style ="clear: both"></div>
			<div style="margin-top: 5px;">
				<div class="business_title2">申请减免的原因</div>
				<div class="business_input21">
					<input id="applyReason" name="applyReason" value='' class="easyui-textbox" data-options="multiline:true" style="width:100%;height:50px" />
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
						   style="padding:3px 0px;width:20%; margin-right:10px;" onclick="formSave();" >
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
	$("#reduceForm2").get(0).reset();
}
function formSubmit(){
	$("#reduceForm2").get(0).submit();
}
function formSave(){
	$("#reduceForm2").get(0).action="insertForm2.action?save=yes";
	$("#reduceForm2").get(0).submit();
}

</script>
</html>
	