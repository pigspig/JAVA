
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();
			String basePath = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'register.jsp' starting page</title>

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
<form name="form1" action="SplbServlet.do?method=save" method="post">
<table width="200" border="1">
	<tr>
		<td colspan="2">修改商品</td>
	</tr>
	<tr>
		<td>商品名</td>
		<td><input type="text" name="name" size="10" ></td>
	</tr>
	<tr>
		<td>商品货号</td>
		<td><input type="password" name="number" size="10"></td>
	</tr>
	<tr>
		<td>商品类型</td>
		<td><input type="text" name="style" size="10"></td>
	</tr>
	<tr>
		<td>商品价格</td>
		<td><input type="int" name="value" size="10"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" name="submit" value="提交"> <a
			href="welcome.jsp">返回</a></td>
	</tr>
</table>
</form>

</body>
</html>>