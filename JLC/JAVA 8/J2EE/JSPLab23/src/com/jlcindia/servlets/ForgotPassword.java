package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import com.jlcindia.jdbc.UserService;

@WebServlet(name="forgotPWServlet" , urlPatterns={"/forgotpw.jlc"})

public class ForgotPassword extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		UserService userService=new UserService();
		System.out.println("ForgotPasswordAction-service()");
		String em=req.getParameter("email");
		String pw=userService.getPasswordByEmail(em);
		String result=null;
		if(pw!=null){
			result="pwstatus.jsp";
			req.setAttribute("PASSWORD", pw);
		}else{
			String msg="Invalid Email - Try Again";
			req.setAttribute("MSG", msg);
			result="forgotpw.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req, res);
	}
}
