package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.jlcindia.beans.*;

public class TestServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession ses=request.getSession();
		ServletContext ctx=ses.getServletContext();
		
		//1. String,wrappers and Date
		request.setAttribute("EM", "sri@jlc.com");
		ses.setAttribute("PH", new Long(123456));
		ctx.setAttribute("DOB", new Date());
		
		//2. Collection of String,wrappers and Date
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(new Integer(11));
		al.add(new Integer(22));
		al.add(new Integer(33));
		al.add(new Integer(44));
		al.add(new Integer(55));
		request.setAttribute("AL", al);
		String str[]={"dd","ss","jlc","sri"};
		ses.setAttribute("STR", str);
		
		//3. Collection of Collection(*JSTL)
		ArrayList<ArrayList> al1=new ArrayList<ArrayList>();
		al1.add(al);
		al1.add(al);
		al1.add(al);
		request.setAttribute("AL1", al1);
		
		//4. Custom or User defined class Object
		Address add=new Address("H.M.T Main Road", "Blore");
		Account acc=new Account(101, "SA", 9999.9, add);
		Customer cust=new Customer(99, "Sri", "sri@jlc", 9999, acc);
		ses.setAttribute("CUST", cust);
		
		Address add1=new Address("B.T.M Layout", "Bangaluru");
		Account acc1=new Account(201, "CU", 8888.8, add1);
		Customer cust1=new Customer(88, "Nivas", "nivas@jlc", 8888, acc1);
		ses.setAttribute("CUST1", cust1);
		
		//5. Collection of User defined class Object
		ArrayList<Customer> cs=new ArrayList<Customer>();
		cs.add(cust);
		cs.add(cust1);
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		ses.setAttribute("CS", cs);
		
		//6. Map Object
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("sid", "11");
		hm.put("sname", "sri");
		hm.put("email", "sri@jlc.com");
		ses.setAttribute("HM", hm);
		
		//7. Collection Map Object
		ArrayList<HashMap<String, String>> al2=new ArrayList<HashMap<String, String>>();
		al2.add(hm);
		al2.add(hm);
		al2.add(hm);
		request.setAttribute("AL2", al2);
		
		RequestDispatcher rd=request.getRequestDispatcher("jstlshow.jsp");
		rd.forward(request, response);
	}
}
