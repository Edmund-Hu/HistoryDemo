<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'MyJsp1.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<%
		out.print("mm");
		String name = "王二";
	%>
	<%=name%>
	<%
		String name2 = "李四";
		String newName = "王二";
		if (name2.equals(newName)) {
			out.print("登录成功");
		} else {
			out.print("登录失败");
		}
	%><table>
		<%
			for (int i = 1; i < 10; i++) {
		%><tr>
			<%
				for (int j = 1; j <= i; j++) {
						if (i % 2 == 0) {
			%><td style="background:blue">
				<%
					out.print(j + "*" + i + "=" + j * i + "\t");
				%>
			</td>
			<%
				} else {
			%><td style="background:yellow">
				<%
					out.print(j + "*" + i + "=" + j * i + "\t");
				%>
			</td>
			<%
				}
					}
			%>
		</tr>
		<%
			}
		%>
	</table>
	<%
		
	%>
	<%--这是 一个方法体--%>
	<%!public String function() {
		System.out.print("使用方法");
		return "abc";
	}%>
	<%
		String a = this.function();
	%><h1>
		<%
			out.print(a);
		%>
	</h1>
	<%
		
	%>




</body>
</html>
