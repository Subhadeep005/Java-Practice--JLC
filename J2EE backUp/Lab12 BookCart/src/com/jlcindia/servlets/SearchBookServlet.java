package com.jlcindia.servlets;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import javafx.print.Collation;

public class SearchBookServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("service() of SearchBookServlet");
		String cat=req.getParameter("category");
		if(cat!=null && cat.equals("Java")){
		ArrayList<String> blist=new ArrayList<String>();
		blist.add("Java");   blist.add("Oops");  
		blist.add("Java 8");    blist.add("Database"); blist.add("JDBC"); 
		blist.add("Servlets");     blist.add("JSP"); 
		blist.add("EJB");     blist.add("RMI");
		HttpSession sess=req.getSession();
		sess.setAttribute("BOOKS", blist);
		RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
		rd.forward(req, res);
		} else{
			String msg="No books found with category " +cat;
			req.setAttribute("MSG", msg);
			RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			rd.forward(req, res);
		}
		
	
	}
}
