package com.jlcindia.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		System.out.println("service()");
		//1. collect the data
		String fn=req.getParameter("fname");
		String em=req.getParameter("email");
		String ph=req.getParameter("phone");
		String ge=req.getParameter("gender");
		String ti=req.getParameter("timings");
		String co=req.getParameter("course");
		String cous[]=req.getParameterValues("course");
		String re=req.getParameter("remarks");
		
		//2. Process the data(Store in db)
		String msg="Your Enquiry has been added successfully";
		System.out.println("Full Name :"+fn);
		System.out.println("Email :"+em);
		System.out.println("Phone :"+ph);
		System.out.println("Gender :"+ge);
		System.out.println("Timing :"+ti);
		System.out.println("Course :"+co);
		System.out.println("All Courses");
		if(cous!=null)
			for(String c:cous){
				System.out.println(c);
			}
		System.out.println("Remarks :"+re);
		
		//3. Send Response
		PrintWriter out=res.getWriter();
		out.println("<h1>Java Learning Center</h1>");
		out.println("<h1>"+msg+"</h1>");
		out.println("<h1>Full Name :</h1><h2>"+fn+"</h2>");
		out.println("<h1>Email  :</h1>"+em);
		out.println("<h1>Phone :</h1>"+ph);
		out.println("<h1>Gender :</h1>"+ge);
		out.println("<h1>Timing :</h1>"+ti);
		out.println("<h1>Course :</h1>"+co);
		out.println("<h1>All Courses :</h1>");
		if(cous!=null)
			for(String c:cous){
				out.println("</br>"+c);
			}
		out.println("<h1>Remarks :</h1>"+re);
	}
}
