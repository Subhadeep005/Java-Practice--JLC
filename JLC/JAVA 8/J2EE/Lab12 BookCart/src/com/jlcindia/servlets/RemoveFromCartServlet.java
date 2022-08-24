package com.jlcindia.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class RemoveFromCartServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("service() of RemoveFromCartServlet");
		HttpSession sess=req.getSession();
		String bnm=req.getParameter("bname");
		System.out.println(bnm);
		sess.removeAttribute(bnm);
		RequestDispatcher rd=req.getRequestDispatcher("showcart.jlc");
		rd.forward(req, res);
	}

}
