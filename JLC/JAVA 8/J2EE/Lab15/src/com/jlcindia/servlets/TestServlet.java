package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import javafx.print.Collation;

public class TestServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		String email=req.getParameter("email");
		String method=req.getMethod();
		PrintWriter out=res.getWriter();
		HttpSession sess=req.getSession();
		out.println("<h3/>Email :"+email);
		out.println("<h3/>Method :"+method);
		out.println("<h3/>ID :"+sess.getId());
		out.println("<h3/>isNew :"+sess.isNew());
		out.println("<h3/>getCreationTime :"+sess.getCreationTime());
		out.println("<h3/>getLastAccessTime :"+sess.getLastAccessedTime());
		out.println("<h3/>getMaxInactiveInterval  :"+sess.getMaxInactiveInterval());
		sess.setMaxInactiveInterval(20);
		ServletContext scontext=sess.getServletContext();
		out.println("<h3/>ServletContext :"+scontext);
	}
}
