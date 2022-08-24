package com.jlcindia.servlets;

import javax.servlet.*;
import javax.servlet.http.*;

public class AddToCartServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws javax.servlet.ServletException ,java.io.IOException {
		
		System.out.println("Service() of AddToCartServlet");
		String bnm=req.getParameter("bname");
		System.out.println(bnm);
		HttpSession sess=req.getSession();
		sess.setAttribute(bnm, bnm);
		//req.setAttribute("ADDED", bnm+ "is added to cart");
		RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
		rd.forward(req, res);
	}
}
