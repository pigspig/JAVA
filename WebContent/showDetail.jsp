<%@ page contentType="text/html;charset=GB2312" %>
<%@ page import="com.demo.javabean.Login" %>
<%@ page import="java.sql.*" %>
<jsp:useBean id="loginBean" class="com.demo.javabean.Login" scope="session"/>
<%@ include file="head.txt" %></HEAD>
<HTML><Body background=image/back.jpg><center>
<% if(loginBean==null){
        response.sendRedirect("login.jsp");//�ض��򵽵�¼ҳ��
   }
   else {
       boolean b =loginBean.getUsername()==null||
                  loginBean.getUsername().length()==0;
       if(b)
         response.sendRedirect("login.jsp");//�ض��򵽵�¼ҳ��
   }
   String numberID = request.getParameter("xijie"); 
   out.print("<th>��Ʒ��"+numberID);
   if(numberID==null) {
       out.print("û�в�Ʒ�ţ��޷��鿴ϸ��");
       return;
   } 
   Connection con;
   Statement sql; 
   ResultSet rs;
   try {  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   }
   catch(Exception e){} 
   String uri="jdbc:sqlserver://localhost:1433;DatabaseName=ͼ�����ϵͳ���ݿ�";
   try{ 
     con=DriverManager.getConnection(uri,"sa","1314");
     sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
             ResultSet.CONCUR_READ_ONLY);
     rs=sql.executeQuery(
     "SELECT * FROM Form where number = '"+numberID+"'");
     out.print("<table border=2>");
     out.print("<tr>");
     out.print("<th>��Ʒ��");
     out.print("<th>����");
     out.print("<th>������");
     out.print("<th>�۸�");
     out.print("<th><font color=blue>���빺�ﳵ</font>");
     out.print("</TR>");
     String picture="welcome.jpg";
     String detailMess="";
     while(rs.next()){
       String number=rs.getString(1);
       String name=rs.getString(2);
       String made=rs.getString(3);
       String price=rs.getString(4);
       picture=rs.getString(6); 
       String goods =
       "("+number+","+name+","+made+
             ","+price+")#"+price;//���ڹ��ﳵ����۸�,β׺��"#�۸�ֵ"
        goods = goods.replaceAll("\\p{Blank}","");
        String button="<form  action='putGoodsServlet' method = 'post'>"+
                     "<input type ='hidden' name='java' value= "+goods+">"+
                     "<input type ='submit'  value='���빺�ﳵ' ></form>";
        out.print("<tr>");
        out.print("<td>"+number+"</td>");
        out.print("<td>"+name+"</td>");
        out.print("<td>"+made+"</td>");
        out.print("<td>"+price+"</td>");
        out.print("<td>"+button+"</td>");
        out.print("</tr>");
     } 
     out.print("</table>");
     out.print("��Ʒ����:<br>");
     out.println("<div align=center>"+detailMess+"<div>");
     String pic ="<img src='image/"+picture+"' width=260 height=200 ></img>";
     out.print(pic); //��ƬͼƬ
     con.close();
  }
  catch(SQLException exp){}
%>
</Center></BODY></HTML>
