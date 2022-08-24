package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import com.jlcindia.jdbc.UserService;

@WebServlet(name="loginServlet" , urlPatterns={"/login.jlc"})

public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		UserService userService=new UserService();
		System.out.println("LoginAction-service()");
		String un=req.getParameter("username");
		String pw=req.getParameter("password");
		int x=userService.verifyUser(un, pw);
		String result=null;
		if(x==1){
			req.setAttribute("UN", un);
			result="home.jsp";
		}else{
			String msg="Invalid Username and Password";
			req.setAttribute("MSG", msg);
			result="index.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req, res);
	}
}
