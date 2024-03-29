package com.demo.servlet;
import com.demo.javabean.Example7_8_Bean;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example7_8_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
      try {  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      }
      catch(Exception e){} 
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      request.setCharacterEncoding("gb2312");
      String dataBase= "图书管理系统数据库";
      String tableName= "Form";
      String user="sa";
      String password= "1314";
      boolean boo =( dataBase==null||dataBase.length()==0);
      boo = boo||( tableName==null||tableName.length()==0);
      boo = boo||( user==null||user.length()==0);
      if(boo) {
         fail(request,response,"查询失败");
      }
      HttpSession session=request.getSession(true); 
      Connection con=null; 
      Example7_8_Bean pageBean=null;
      try{ 
           pageBean=(Example7_8_Bean)session.getAttribute("pageBean");
           if(pageBean==null){
              pageBean=new Example7_8_Bean();  //创建Javabean对象
              session.setAttribute("pageBean",pageBean);
           }
      }
      catch(Exception exp){
           pageBean=new Example7_8_Bean();  
           session.setAttribute("pageBean",pageBean);
      } 
      String uri="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统数据库;";
      try{ 
          con=DriverManager.getConnection(uri,user,password);
          Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                ResultSet.CONCUR_READ_ONLY);
          ResultSet rs=sql.executeQuery("SELECT * FROM "+tableName);
          ResultSetMetaData metaData = rs.getMetaData();
          int columnCount = metaData.getColumnCount(); //得到结果集的列数
          String []columnName = new String[columnCount];
          for(int i=0;i<columnName.length;i++) {
             columnName[i] = metaData.getColumnName(i+1); //得到列名
          }
          pageBean.setColumnName(columnName);   //更新Javabean数据模型
          rs.last();
          int rowNumber=rs.getRow();  //得到记录数
          String [][] tableRecord=pageBean.getTableRecord();
          tableRecord = new String[rowNumber][columnCount];
          rs.beforeFirst();
          int i=0;
          while(rs.next()){
            for(int k=0;k<columnCount;k++) 
              tableRecord[i][k] = rs.getString(k+1);
              i++; 
          }
          pageBean.setTableRecord(tableRecord); //更新Javabean数据模型
          con.close();
          response.sendRedirect("pageShow.jsp");  //重定向
     }
     catch(SQLException e){
          System.out.println(e);
     }  
   }
   public  void  doGet(HttpServletRequest request,HttpServletResponse response)
           throws ServletException,IOException{
       doPost(request,response);
   }
   public void fail(HttpServletRequest request,HttpServletResponse response,
                      String backNews) {
        response.setContentType("text/html;charset=GB2312");
        try {
         PrintWriter out=response.getWriter();
         out.println("<html><body>");
         out.println("<h2>"+backNews+"</h2>") ;
         out.println("返回");
         out.println("<a href =example7_8.jsp>输入正确信息</a>");
         out.println("</body></html>");
        }
        catch(IOException exp){} 
  }

}
