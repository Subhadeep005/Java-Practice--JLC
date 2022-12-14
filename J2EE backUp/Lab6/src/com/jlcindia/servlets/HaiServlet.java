package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(
		name="haiServ",
		urlPatterns={"/hai.jlc"},
		initParams={
				@WebInitParam(
						name="email",
						value="hainivas@jlc.com"
						)
		}
)

public class HaiServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("** service() method of HaiServlet **");
		String fnm=req.getParameter("fname");
		String phn=req.getParameter("phone");
		Writer out=res.getWriter();
		res.setContentType("text/html");
		out.write("<h1> Response from HaiServlet");
		out.write("<h1>Request Parameter");
		out.write("<br>Fname :"+fnm);
		out.write("<br>Phone :"+phn);
		out.write("<hr>Servlet Config Parameters");
		ServletConfig cfg=getServletConfig();
		String eml=cfg.getInitParameter("email");
		out.write("<br>"+cfg);
		out.write("<br>Email :"+eml);
		out.write("<hr>Servlet Context Parameters");
		ServletContext ctx=cfg.getServletContext();
		String web=ctx.getInitParameter("website");
		out.write("<br>"+ctx);
		out.write("<br>Web :"+web);
}
}
