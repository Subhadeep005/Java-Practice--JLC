package com.jlcindia.servlets;

import java.io.IOException;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowCartServlet extends HttpServlet {
	
@Override
protected void service(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
	System.out.println("service() of ShowCartServlets");
	HttpSession sess=req.getSession();
	Enumeration<String> enms=sess.getAttributeNames();
	List<String> clist=Collections.list(enms);
	clist.remove("BOOKS");
	if(clist.size()==0){
		req.setAttribute("MSG", "No Books Selected");
	}else{
	req.setAttribute("CART", clist);
	}
	RequestDispatcher rd=req.getRequestDispatcher("showcart.jsp");
	rd.forward(req, res);
}

}
