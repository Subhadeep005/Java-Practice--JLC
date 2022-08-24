package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
	
		System.out.println("** Service of TestServlet");
		String unm=req.getParameter("username");
		String pwd=req.getParameter("password");
		Writer out=res.getWriter();
		out.write("<h1>Hi, Welcome to JLC");
		String page="";
		
		if(unm.equals(pwd)){
			page="/WEB-INF/home.html";
			RequestDispatcher rd=req.getRequestDispatcher(page);
			rd.forward(req, res);
			//rd.forward(req, res); //java.lang.IllegalStateException: Cannot forward after response has been committed
		}else{
			page="/WEB-INF/error.html";
			RequestDispatcher rd=req.getRequestDispatcher(page);
			rd.forward(req, res);
		}
		
		out.write("<h1>Again, Welcome to JLC");
		System.out.println("** service completed -LAST STATEMENT **");
	}
}
