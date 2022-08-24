package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletC extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("ServletC service()----- Begin");
		PrintWriter out=res.getWriter();
		out.println("<h2>Verify the Server Console<h2/>");
		System.out.println("ServletC service()----- End");
	}
}
