package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletA extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("ServletA service()----- Begin");
		RequestDispatcher rd=req.getRequestDispatcher("b.jlc");
		rd.forward(req, res);
		System.out.println("ServletA service()----- End");
	}
}
