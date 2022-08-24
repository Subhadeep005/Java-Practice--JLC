package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.*;

public class FilterB implements Filter {

	@Override
	public void destroy() {	
		System.out.println("FilterB destroy()");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FilterB doFilter() ---- Begin");
		chain.doFilter(req, res);
		System.out.println("FilterB doFilter() ---- End");
	}

	@Override
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("FilterB init() ---- Begin");
		
		System.out.println("FilterB init() ---- End");
	}

}
