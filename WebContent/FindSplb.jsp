<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="loginBean1" class="com.demo.javabean.Login" scope="session"/>
<%@ page import="java.util.*;" %>
<HTML><body bgcolor=#AAFFEE><font size=2>
<%  if(loginBean1==null){
        response.sendRedirect("login.jsp");//�ض��򵽵�¼ҳ��
    }
    else {
       boolean b =loginBean1.getUsername()==null||
                  loginBean1.getUsername().length()==0;
       if(b)
         response.sendRedirect("login.jsp");//�ض��򵽵�¼ҳ��
    }
    LinkedList car =loginBean1.getCar();
    if(car==null)
      out.print("<h2> ���ﳵû����Ʒ.</h2>");
    else {
       Iterator<String> iterator=car.iterator();
       StringBuffer buyGoods = new StringBuffer();
       int n=0;
       double priceSum =0;
       out.print("���ﳵ�е���Ʒ��<table border=2>");
       while(iterator.hasNext()) {
           String goods=iterator.next();
           String showGoods="";
           n++; 
           //��������Ʒ�ĺ�׺�ǡ�#�۸�����"�����硰��ױƷ�۸�3989 #3989��
           int index=goods.lastIndexOf("#");
           if(index!=-1){
              priceSum+=Double.parseDouble(goods.substring(index+1));
              showGoods = goods.substring(0,index);
           }
           buyGoods.append(n+":"+showGoods);
           String del="<form  action='deleteServlet' method = 'post'>"+
                     "<input type ='hidden' name='delete' value= "+goods+">"+
                     "<input type ='submit'  value='ɾ��' ></form>";
          
           out.print("<tr><td>"+showGoods+"</td>");
           out.print("<td>"+del+"</td></tr>");
       }
       out.print("</table>");
       String orderForm = "<form action='buyServlet' method='post'>"+
              " <input type ='hidden' name='buy' value= "+buyGoods+" >"+ 
              " <input type ='hidden' name='price' value= "+priceSum+" >"+           
              "<input type ='submit'  value='���ɶ���'></form>";
       out.print(orderForm); 
    } 
%>
<form action="queryAllServlet" method=post>
<b>���ݿ�:<input type="text" name="dataBase" size=22 value =ͼ�����ϵͳ���ݿ�>
<br>������<input type="text" name="tableName" size=23 value=product>
<br>�û���(Ĭ��root)��<input type="text" name="user" size=10 value=sa>
<br>�û�����(Ĭ�Ͽ�)��<input type="text" name="password" size=10>
<br><input type="submit" name="b" value="�ύ">
</form>
</font></body></HTML>     
