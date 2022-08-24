package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.*;

public class DemoFilter implements Filter {

	@Override
	public void init(FilterConfig fc) throws ServletException {
			System.out.println("DemoFilter---init()---Begin");
			String ct=fc.getInitParameter("city");
			System.out.println(ct);
			System.out.println("DemoFilter---init()---End");
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("DemoFilter---doFilter()---Begin");
		System.out.println("DemoFilter---doFilter()---Before");
		String nm=req.getParameter("name");
		String em=req.getParameter("email");
		String ip=req.getRemoteAddr();
		System.out.println(nm);
		System.out.println(em);
		System.out.println(ip);
		chain.doFilter(req, res);
		System.out.println("DemoFilter---doFilter()---After");
		Object obj=req.getAttribute("MSG");
		System.out.println(obj);
		String msg=obj.toString();
		System.out.println(msg);
		System.out.println("DemoFilter---doFilter()---End");
	}

	@Override
	public void destroy() {
		System.out.println("DemoFilter---destroy()");
	}
	
}
