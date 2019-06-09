package com.demo.servlet;
import com.demo.javabean.DataByPage;
import com.sun.rowset.*;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class QueryAllRecord extends HttpServlet{
   CachedRowSetImpl rowSet=null;
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
      try {  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      }
      catch(Exception e){} 
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      request.setCharacterEncoding("gb2312");
      String idNumber= request.getParameter("number");
      if(idNumber==null) 
          idNumber="0";
      int id = Integer.parseInt(idNumber);
      HttpSession session=request.getSession(true); 
      Connection con=null; 
      DataByPage dataBean=null;
      try{ 
           dataBean=(DataByPage)session.getAttribute("dataBean");
           if(dataBean==null){
              dataBean=new DataByPage();  //����Javabean����
              session.setAttribute("dataBean",dataBean);
           }
      }
      catch(Exception exp){
           dataBean=new DataByPage();  
           session.setAttribute("dataBean",dataBean);
      } 
      String uri="jdbc:sqlserver://localhost:1433;DatabaseName=ͼ�����ϵͳ���ݿ�;";
      try{ 
           con=DriverManager.getConnection(uri,"sa","1314");
           Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                ResultSet.CONCUR_READ_ONLY);
           ResultSet rs=sql.executeQuery("SELECT * FROM Form where id = "+id);
           rowSet=new CachedRowSetImpl();   //�����м�����
           rowSet.populate(rs);
           dataBean.setRowSet(rowSet);      //�м����ݴ洢��dataBean��  
           con.close();                     //�ر�����
      }
      catch(SQLException exp){}
      response.sendRedirect("byPageShow.jsp");//�ض���byPageShow.jsp
   } 
   public void doGet(HttpServletRequest request,
              HttpServletResponse response) 
                        throws ServletException,IOException{
       doPost(request,response);
   }
}
