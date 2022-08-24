package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(
		name="demoServlet",
		urlPatterns="/demo.jlc",
		initParams={
				@WebInitParam(name="city", value="Chennai")
		})

public class DemoServlet extends HttpServlet{

	@Override
	public void init(ServletConfig sc) throws ServletException {
		System.out.println("DemoServlet---init()---Begin");
		String ct=sc.getInitParameter("city");
		System.out.println(ct);
		System.out.println("DemoServlet---init()---End");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("DemoServlet service()----- Begin");
		String nm=req.getParameter("name");
		String em=req.getParameter("email");
		String ip=req.getRemoteAddr();
		String msg="<h1>Hello ! "+nm+"<br/>";
		msg=msg+" Your Email Id is "+em+"<br/>";
		msg=msg+"You are sending the requesting from IP Address "+ip;
		req.setAttribute("MSG", msg);
		PrintWriter out=res.getWriter();
		out.println(msg);
		System.out.println("DemoServlet service()----- End");
	}
	
	@Override
	public void destroy() {
	System.out.println("DemoServlet---destroy()");
	}
}
