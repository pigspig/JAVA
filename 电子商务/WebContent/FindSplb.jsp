<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="loginBean1" class="com.demo.javabean.Login" scope="session"/>
<%@ page import="java.util.*;" %>
<HTML><body bgcolor=#AAFFEE><font size=2>
<%  if(loginBean1==null){
        response.sendRedirect("login.jsp");//重定向到登录页面
    }
    else {
       boolean b =loginBean1.getUsername()==null||
                  loginBean1.getUsername().length()==0;
       if(b)
         response.sendRedirect("login.jsp");//重定向到登录页面
    }
    LinkedList car =loginBean1.getCar();
    if(car==null)
      out.print("<h2> 购物车没有物品.</h2>");
    else {
       Iterator<String> iterator=car.iterator();
       StringBuffer buyGoods = new StringBuffer();
       int n=0;
       double priceSum =0;
       out.print("购物车中的物品：<table border=2>");
       while(iterator.hasNext()) {
           String goods=iterator.next();
           String showGoods="";
           n++; 
           //购车车物品的后缀是“#价格数字"，比如“化妆品价格3989 #3989”
           int index=goods.lastIndexOf("#");
           if(index!=-1){
              priceSum+=Double.parseDouble(goods.substring(index+1));
              showGoods = goods.substring(0,index);
           }
           buyGoods.append(n+":"+showGoods);
           String del="<form  action='deleteServlet' method = 'post'>"+
                     "<input type ='hidden' name='delete' value= "+goods+">"+
                     "<input type ='submit'  value='删除' ></form>";
          
           out.print("<tr><td>"+showGoods+"</td>");
           out.print("<td>"+del+"</td></tr>");
       }
       out.print("</table>");
       String orderForm = "<form action='buyServlet' method='post'>"+
              " <input type ='hidden' name='buy' value= "+buyGoods+" >"+ 
              " <input type ='hidden' name='price' value= "+priceSum+" >"+           
              "<input type ='submit'  value='生成订单'></form>";
       out.print(orderForm); 
    } 
%>
<form action="queryAllServlet" method=post>
<b>数据库:<input type="text" name="dataBase" size=22 value =图书管理系统数据库>
<br>表名：<input type="text" name="tableName" size=23 value=product>
<br>用户名(默认root)：<input type="text" name="user" size=10 value=sa>
<br>用户密码(默认空)：<input type="text" name="password" size=10>
<br><input type="submit" name="b" value="提交">
</form>
</font></body></HTML>     
