package com.demo.servlet;
import com.demo.javabean.Login;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HandleDelete extends HttpServlet {
   public void init(ServletConfig config) throws ServletException { 
      super.init(config);
   }
   public  void  doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException {
      request.setCharacterEncoding("gb2312");
      String delete = request.getParameter("delete");
      Login loginBean=null;
      HttpSession session=request.getSession(true);
      try{  loginBean=(Login)session.getAttribute("loginBean");
            boolean b =loginBean.getUsername()==null||
            loginBean.getUsername().length()==0;
            if(b)
              response.sendRedirect("login.jsp");//�ض��򵽵�¼ҳ��
            LinkedList<String> car = loginBean.getCar();
            car.remove(delete);
      }
      catch(Exception exp){
           response.sendRedirect("login.jsp");//�ض��򵽵�¼ҳ��
      }
      RequestDispatcher dispatcher= 
      request.getRequestDispatcher("lookShoppingCar.jsp");
      dispatcher.forward(request, response);//ת�� 
   }
   public  void  doGet(HttpServletRequest request,HttpServletResponse response)
                        throws ServletException,IOException {
      doPost(request,response);
   }
}
