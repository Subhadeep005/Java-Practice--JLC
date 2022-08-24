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
	
		req.setAttribute("MSG", "Welcome to JLC");
		List<String> list=new ArrayList<String>();
		list.add("hello@jlc.com");
		list.add("hai@jlc.com");
		list.add("sd@jlc.com");
		list.add("nivas@jlc.com");
		list.add("dande@jlc.com");
		req.setAttribute("LIST",	list);
		RequestDispatcher rd=req.getRequestDispatcher("test.jsp");
		rd.forward(req, res);
		
	}
}
