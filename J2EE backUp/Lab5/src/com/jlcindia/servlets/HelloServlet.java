package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
ServletConfig cfg=null;
@Override
	public void init(ServletConfig cfg) throws ServletException {
		this.cfg=cfg;
		System.out.println("** init() method of HelloServlet **");
	}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("** service() method of HelloServlet **");
		String fnm=req.getParameter("fname");
		String phn=req.getParameter("phone");
		Writer out=res.getWriter();
		res.setContentType("text/html");
		out.write("<h1> Response from HelloServlet");
		out.write("<h1>Request Parameter");
		out.write("<br>Fname :"+fnm);
		out.write("<br>Phone :"+phn);
		out.write("<hr>Servlet Config Parameters");
		String eml=cfg.getInitParameter("email");
		out.write("<br>"+cfg.getClass().getName());
		out.write("<br>Email :"+eml);
		out.write("<hr>Servlet Context Parameters");
		ServletContext ctx=cfg.getServletContext();
		String web=ctx.getInitParameter("website");
		out.write("<br>"+ctx);
		out.write("<br>Web :"+web);
		
	}
}
