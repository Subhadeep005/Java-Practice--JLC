package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(
		name="testServlet",
		urlPatterns={"/test.jlc"}
		)
public class TestServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		System.out.println("TestServlet --> sertvice()");
		System.out.println("Accessing Session Object");
		HttpSession sess=req.getSession();
		String email=req.getParameter("email");
		ServletContext ctx=getServletContext();
		System.out.println("Storing attribute in Context");
		ctx.setAttribute("email", email);
		System.out.println("Replacing attribute in Context");
		ctx.setAttribute("email", "nivas@jlc.com");
		System.out.println("Removing attribute in Context");
		ctx.removeAttribute("email");
		System.out.println("Invalidating Session Object");
		sess.invalidate();
		Writer out=res.getWriter();
		out.write("<h1>Verify the Server Console<h1/>");
	}
}
