package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.jlcindia.jdbc.UserService;
import com.jlcindia.to.UserTo;

@WebServlet(name="registerServlet" , urlPatterns={"/reg.jlc"})

public class RegisterServlets extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		UserService userService=new UserService();
		System.out.println("RegisterAction-service()");
		String fn=req.getParameter("fname");
		String em=req.getParameter("email");
		String ph=req.getParameter("phone");
		long ph1=Long.parseLong(ph);
		String un=req.getParameter("username");
		String pw=req.getParameter("password");
		int uid=userService.getNextUserId();
		UserTo uto=new UserTo(uid,fn,em,ph1,un,pw);   
		/*uto.setFname(fn);  uto.setEmail(em);  uto.setPhone(Long.parseLong(ph));   uto.setUsername(un);   uto.setPassword(pw);*/
		int x=userService.registerUser(uto);
		String result=null;
		if(x==1){
			req.setAttribute("UN", un);
			result="home.jsp";
		}else{
			String msg="Registration Failed - Try Again";
			req.setAttribute("MSG", msg);
			result="register.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req, res);		
	}
}
