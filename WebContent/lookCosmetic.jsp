<%@ page contentType="text/html;charset=GB2312" %>
<%@ page import="java.sql.*" %>
<HTML><HEAD><%@ include file="head.txt" %></HEAD>
<BODY background=image/back.jpg><font size=2>
<div align="center">
<%   try {  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      }
      catch(Exception e){} 
      String uri="jdbc:sqlserver://localhost:1433;DatabaseName=ͼ�����ϵͳ���ݿ�";
      String dataBase= "ͼ�����ϵͳ���ݿ�";
      String user="sa";
      String password= "1314";
      Connection con; 
      Statement sql;
      ResultSet rs;
      try {
    	con=DriverManager.getConnection(uri,user,password);
        sql=con.createStatement();
        //��ȡclassify����÷��ࣺ  
        rs=sql.executeQuery("SELECT * FROM classify");
        out.print("<form action='queryServlet' method ='post'>") ;
        out.print("<select name='number'>") ;
        while(rs.next()){
           int id = rs.getInt(1);
           String name = rs.getString(2);
           out.print("<option value ="+id+">"+name+"</option>");
        }  
        out.print("</select>");
        out.print("<input type ='submit' value ='�ύ'>");  
        out.print("</form>");
        con.close();
     }
     catch(SQLException e){ 
        out.print(e);
     }
%>
</div></font>
</BODY></HTML>
