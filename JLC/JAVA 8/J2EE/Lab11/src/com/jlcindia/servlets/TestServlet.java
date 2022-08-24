package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import javafx.print.Collation;

public class TestServlet extends HttpServlet{

	static int count=0;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
	
		count++;
		System.out.println("---Service--- :"+count);
		Writer out=res.getWriter();
		Date dt=new Date();
		out.write("<br/>"+dt);
		out.write("<h3>---Service--- :"+count);
		if(count<=10){
			res.setHeader("Refresh", "1;/Lab11/test.jlc");
		}else{
			res.setHeader("Refresh", "1; URL=http://google.com");
		}
	}
}
