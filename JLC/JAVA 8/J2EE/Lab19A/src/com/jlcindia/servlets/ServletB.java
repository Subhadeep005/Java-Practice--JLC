package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(
		name="ServletB",
		urlPatterns={"/b.jlc"}
		)

public class ServletB extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("ServletB service()----- Begin");
		RequestDispatcher rd=req.getRequestDispatcher("c.jlc");
		rd.forward(req, res);
		System.out.println("ServletB service()----- End");
	}
}
