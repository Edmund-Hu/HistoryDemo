<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>留言管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


  </head>
<body style="width:1366px;height:500px;">
<%@include file="Daohang.jsp"%>
<div style="position:absolute;top:60px;left:170px;width:1094px;height:534px;">
    <img src="${pageContext.request.contextPath}/img/panda.png" style="width:24px;height:24px;">&nbsp;
    <span style="font-size:14px;position:absolute;top:5px;width:1000px;font-weight:bold;"><marquee>欢迎使用留言管理系统!</marquee></span>
    <br><hr style="position:absolute;top:20px;width:1090px;border:1px white dashed">
    <table  style="position:absolute;top:40px;width:1090px;font-weight:bold;border-collapse: collapse;">
        <tr>
            <td style="background-color:rgba(0,0,100,0.1); border:1px solid rgba(0,23,100,0.3);">消息</td>
        </tr>
        <tr>
            <td style="font-size:13px;">公告:本系统将于2016年08月30日进行版本更新v.1.1,给您带来的不便、敬请谅解! </td>
        </tr>
    </table>

    <table  style="position:absolute;top:96px;width:1090px;font-weight:bold;border-collapse: collapse;">
        <tr>
            <td style="background-color:rgba(0,0,100,0.1);">快捷操作</td>
        </tr>
        <tr>
            <td style="font-size:13px;color:gold">
                <center>
                    <img src="${pageContext.request.contextPath}/img/file.png" style="width:18px;height:18px;">文档列表&nbsp;
                    <img src="${pageContext.request.contextPath}/img/talk.png" style="width:18px;height:18px;">评论管理&nbsp;
                    <img src="${pageContext.request.contextPath}/img/value.png" style="width:18px;height:18px;">内容发布&nbsp;
                    <img src="${pageContext.request.contextPath}/img/folder.png" style="width:18px;height:18px;">栏目管理&nbsp;
                    <img src="${pageContext.request.contextPath}/img/huancun.png" style="width:18px;height:18px;">更新系统缓存&nbsp;
                    <img src="${pageContext.request.contextPath}/img/change.png" style="width:18px;height:18px;">修改系统参数&nbsp;
                </center>
            </td>
        </tr>
    </table>

    <table  style="border-collapse: collapse;position:absolute;top:158px;width:1090px;font-weight:bold">
        <tr>
            <td colspan=2  style="background-color:rgba(0,0,100,0.1); border:1px solid rgba(0,23,100,0.3);">系统基本信息</td>
        </tr>
        <tr>
            <td style="width:30%;font-size:14px; border:1px solid rgba(0,23,100,0.3);">您的级别：</td>
            <td style="width:70%;font-size:14px; border:1px solid rgba(0,23,100,0.3);">管理员</td>
        </tr>
        <tr>
            <td style="font-size:14px; border:1px solid rgba(0,23,100,0.3);">软件版本信息：</td>
            <td style="font-size:14px; border:1px solid rgba(0,23,100,0.3);">v1.2.08</td>
        </tr>
    </table>

    <table  style="border-collapse: collapse;position:absolute;top:238px;width:1090px;font-weight:bold">
        <tr>
            <td colspan=2  style="background-color:rgba(0,0,100,0.1); border:1px solid rgba(0,23,100,0.3);">使用帮助</td>
        </tr>
        <tr>
            <td style="width:30%;font-size:14px; border:1px solid rgba(0,23,100,0.3);">官方交流网站：</td>
            <td style="width:70%;font-size:14px; border:1px solid rgba(0,23,100,0.3);">
                <a href="" style="text-decoration:none;color:#FEEA77">

                </a>
            </td>
        </tr>
        <tr>
            <td style="font-size:14px; border:1px solid rgba(0,23,100,0.3);">软件更多信息：</td>
            <td style="font-size:14px; border:1px solid rgba(0,23,100,0.3);">
                <a href='' target='_blank' style="color:#FEEA77;text-decoration:none;">
                    <img src="${pageContext.request.contextPath }/img/edit.png" width=30px;>
                </a>
            </td>
        </tr>
    </table>

</div>
</body>


</html>
