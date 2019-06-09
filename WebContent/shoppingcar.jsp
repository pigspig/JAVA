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

<title>京东-购物车</title>
<style type="text/css">
img{
	border:0;
}
.links{
    margin-left:500px;
}
a{
    text-decoration: none;
    color:black;
}
.text{
		    width:200px;
		    height:25px;
		    border:2px blue solid;
		    margin-left:1100px;
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
<form name="form1" action="queryAllServlet" method=post>
<table width="100%">
	<tr>
	
		<td style="font-family:微软雅黑;font-size:30px;color:gray;"><a href="zhuye.jsp"><img src="img/jingdong.png"></a>购物车</td>
		<td>
            <input type="text" class="text" name="tableName">
            <input type="submit" name="b" value="搜索">
        </td>
	</tr>
	<tr>
		<td colspan="2">
		<hr>
		</td>
	</tr>
</table>
</form>
<div style="height:800px;background-color:#DDDDDD;">
<form name="form1" action="queryAllServlet" method="post">

<div style="position:absolute;left:200px;top:200px;"><img src="img/zhuye.png"></div>
<div style="top:250px;left:1200px;position:absolute;height:50px">
<jsp:useBean id="pageBean" class="com.demo.javabean.Example7_8_Bean" scope="session"/>
<jsp:setProperty name="pageBean" property="pageSize" param="pageSize"/>
<jsp:setProperty name="pageBean" property="currentPage" param="currentPage"/>
<table border=1>
  <%
      String [][] table=pageBean.getTableRecord();
      if(table==null) {
         out.print("没有记录");
         return;
      }
      String []columnName=pageBean.getColumnName();
      if(columnName!=null) { 
        out.print("<tr>");
        for(int i=0;i<columnName.length;i++){
          out.print("<th>"+columnName[i]+"</th>");
        }
        out.print("</tr>");
      } 
      int totalRecord = table.length;
      out.println("购物车"); //全部记录数
      int pageSize=pageBean.getPageSize();  //每页显示的记录数
      int totalPages = pageBean.getTotalPages();
      if(totalRecord%pageSize==0)
           totalPages = totalRecord/pageSize;//总页数
      else
           totalPages = totalRecord/pageSize+1;
      pageBean.setPageSize(pageSize);
      pageBean.setTotalPages(totalPages);
      if(totalPages>=1) {
         if(pageBean.getCurrentPage()<1)
             pageBean.setCurrentPage(pageBean.getTotalPages());
         if(pageBean.getCurrentPage()>pageBean.getTotalPages())
             pageBean.setCurrentPage(1);
         int index=(pageBean.getCurrentPage()-1)*pageSize;
         int start=index;  //table的currentPage页起始位置
         for(int i=index;i<pageSize+index;i++) { 
            if(i==totalRecord)
               break;
            out.print("<tr>");
            for(int j=0;j<columnName.length;j++) {
                out.print("<td>"+table[i][j]+"</td>");
            }
            out.print("</tr>");
        }
     }
%>
 </table>
 <br>每页最多显示<jsp:getProperty name="pageBean" property="pageSize"/>条信息
 <br>当前显示第<font color=blue>
     <jsp:getProperty name="pageBean" property="currentPage"/>
   </font>页,共有
   <font color=blue><jsp:getProperty name="pageBean" property="totalPages"/>
   </font>页。
<table>
  <tr><td><form action="" method=post>
          <input type=hidden name="currentPage" value=
         "<%=pageBean.getCurrentPage()-1 %>">
           <input type=submit name="g" value="上一页"></form></td>
      <td><form action="" method=post>
          <input type=hidden name="currentPage"
           value="<%=pageBean.getCurrentPage()+1 %>">
          <input type=submit name="g" value="下一页"></form></td></tr>
 <tr><td> <form action="" method=post>
          每页显示<input type=text name="pageSize" value =1 size=3>
          条记录<input type=submit name="g" value="确定"></form></td>
      <td> <form action="" method=post>
           输入页码：<input type=text name="currentPage" size=2 >
           <input type=submit name="g" value="提交"></form></td></tr>
</table>
<div>
<a href="ModifySplb.jsp">添加商品</a>
<a href=""></a>
</div>

</div>
</form>
<div style="margin-left:400px;margin-top:600px"><img src="img/gouwu.png"></div>
</div>
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
