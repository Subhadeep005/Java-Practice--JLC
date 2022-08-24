package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="myLogin", urlPatterns={"/login.jlc"})

public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
	
		//1. COLLECTING CLIENT DATA
		String unm=req.getParameter("username");
		String pwd=req.getParameter("password");
		String msg="";
		
		//2. VERIFYING CLIENT DATA
		if(unm.equals(pwd)){
			msg="<h1>Login Success<br>welcome to JLC Homepage</h1>";
		}else{
			msg="<h1>Login Failed<br>Invalid Username or Password</h1>";
		}
		
		//3.	 PREPARING THE RESPONSE
		Writer out=res.getWriter();
		out.write(msg);
	}
}
