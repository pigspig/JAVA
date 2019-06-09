package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.javabean.SplbBean;

/**
 * Servlet implementation class SplbServlet
 */
@WebServlet("/SplbServlet")
public class SplbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String method=request.getParameter("method");
		if(method==null) {
			PrintWriter out = response.getWriter();
			out.println("invalid request!");
		}else if(method.equals("save")) {
			Save(request,response);
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	private void Save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String value = request.getParameter("value");
		String amount = request.getParameter("amount");
		SplbBean splbbean = new SplbBean();
		boolean isExist = splbbean.isExist(name);
		if(!isExist) {
			splbbean.add(name,number,value,amount);
			response.sendRedirect("FindSplb.jsp");
			return;
		} else {
			response.sendRedirect("welcome.jsp");
			return;
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

		// validate
		
}
