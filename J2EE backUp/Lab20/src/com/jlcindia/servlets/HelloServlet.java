package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		System.out.println("HelloServlet sertvice() ---- Begin");
		Writer out=res.getWriter();
		out.write("<h1>Verify the Server Console<h1/>");
		System.out.println("HelloServlet sertvice() ---- End");
	}
}
