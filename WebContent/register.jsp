
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

<title>京东-注册</title>
<style type="text/css">
img{
	border:0;
}
.links{
    margin-left:400px;
}
a{
    text-decoration: none;
    color:gray;
}
</style>
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
<table width="100%">
	<tr>
		<td><a href="zhuye.jsp"><img src="img/jingdong.png"></a></td>
		<td style="font-size:22px;font-family: 微软雅黑">欢迎注册</td>
	</tr>
	<tr>
		<td colspan="2">
		<hr>
		</td>
	</tr>
</table>
<form name="form1" action="UserServlet.do?method=register" method="post">
<div style="height:600px;background-color:#DDDDDD;">
<div style="position:absolute;left:200px;top:200px;"><img src="img/zhuye.png"></div>
<div style="top:250px;left:1200px;position:absolute;background-color:white;height:50px">

<table width="200" border="1">
	<tr>
		<td colspan="2">注册窗口</td>
	</tr>
	<tr>
		<td>用户名</td>
		<td><input type="text" name="username" size="10"></td>
	</tr>
	<tr>
		<td>密码</td>
		<td><input type="password" name="password1" size="10"></td>
	</tr>
	<tr>
		<td>确认密码</td>
		<td><input type="password" name="password2" size="10"></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="text" name="email" size="10"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" name="submit" value="注册"> <a
			href="login.jsp">返回</a></td>
	</tr>
</table>
</div>
</div>
</form>
<div class="links">
            <a rel="nofollow" target="_blank" href="//www.jd.com/intro/about.aspx">
                关于我们
            </a>
            |
            <a rel="nofollow" target="_blank" href="//www.jd.com/contact/">
                联系我们
            </a>
            |
            <a rel="nofollow" target="_blank" href="//zhaopin.jd.com/">
                人才招聘
            </a>
            |
            <a rel="nofollow" target="_blank" href="//www.jd.com/contact/joinin.aspx">
                商家入驻
            </a>
            |
            <a rel="nofollow" target="_blank" href="//www.jd.com/intro/service.aspx">
                广告服务
            </a>
            |
            <a rel="nofollow" target="_blank" href="//app.jd.com/">
                手机京东
            </a>
            |
            <a target="_blank" href="//club.jd.com/links.aspx">
                友情链接
            </a>
            |
            <a target="_blank" href="//media.jd.com/">
                销售联盟
            </a>
            |
            <a href="//club.jd.com/" target="_blank">
                京东社区
            </a>
            |
            <a href="//gongyi.jd.com" target="_blank">
                京东公益
            </a>
            |
            <a target="_blank" href="//en.jd.com/" clstag="pageclick|keycount|20150112ABD|9">English Site</a>
</div>


</body>
</html>
