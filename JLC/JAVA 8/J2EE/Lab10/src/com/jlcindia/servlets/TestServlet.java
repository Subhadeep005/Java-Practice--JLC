package com.jlcindia.servlets;

import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
	
		//1. Request Parameter
		String un=req.getParameter("uname");
		String pw=req.getParameter("password");
		
		//2. Display Request Parameter
		PrintWriter out=res.getWriter();
		out.println("<h1> Request Parameters");
		out.println("<h1>Username :"+un);
		out.println("<h1>Password :"+pw);
		out.println("<hr/>");
		
		//3. Request Headers
		out.println("Request Headers");
		Enumeration e=req.getHeaderNames();
		while(e.hasMoreElements()){
			String hn=e.nextElement().toString();
			String hv=req.getHeader(hn);
			out.println("<br/>"+ hn +" : "+ hv);
		}
		out.println("<hr/>");
		
		//4. Locales Supported by Browser
		out.println("Locale info");
		out.println("<br/> getLocale() :"+req.getLocale());
		out.println("<hr/>");
		
		//5. other Information from Request.
		out.println("Other Info");
		out.println("<br/> METHOD :"+req.getMethod());
		out.println("<br/> Request URI :"+req.getRequestURI());
		out.println("<br/> Request URL :"+req.getRequestURL());
		out.println("<br/> Protocol :"+req.getProtocol());
		out.println("<br/> Content Length :"+req.getContentLength());
		out.println("<br/> Content Type :"+req.getContentType());
		out.println("<br/> Remot Addr :"+req.getRemoteAddr());
		out.println("<br/> Remort Port :"+req.getRemotePort());
		out.println("<br/> Remort Host :"+req.getRemoteHost());
		out.println("<br/> Server Port :"+req.getServerPort());
		out.println("<br/> Server Name :"+req.getServerName());
		out.println("<br/> QueryString() :"+req.getQueryString());
		out.println("<br/> getServletPath() :"+req.getServletPath());
		out.println("<br/> getContextPath() :"+req.getContextPath());
	}
}
