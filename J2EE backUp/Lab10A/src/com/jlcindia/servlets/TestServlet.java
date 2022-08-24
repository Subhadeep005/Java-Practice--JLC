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
	
		res.setContentType("text/html");
		res.setContentLength(1000);
		res.setHeader("JLC", "yes");
		PrintWriter out=res.getWriter();
		out.println("<h1> Response Parameters");
		Collection<String> hns=res.getHeaderNames();
		for(String hname:hns){
			String hvalue=res.getHeader(hname);
			out.println("<h1>"+ hname +":"+ hvalue);
		}
		out.println("<h1> Content Type :"+res.getContentType());
		out.println("<h1> Character Encoading :"+res.getCharacterEncoding());
		out.println("<h1> Buffer Size :"+res.getBufferSize());
		out.println("<h1> Status :"+res.getStatus());
		try{
		String str=null;
		int x=str.length();
		}catch(Exception e){
			System.out.println(e);
		}
		out.println("<h1> Status :"+res.getStatus());
		System.out.println("Status :"+res.getStatus());
	}
}
