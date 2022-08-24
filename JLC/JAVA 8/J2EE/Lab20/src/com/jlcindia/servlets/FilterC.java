package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.*;

public class FilterC implements Filter {

	@Override
	public void destroy() {	
		System.out.println("FilterC destroy()");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FilterC doFilter() ---- Begin");
		chain.doFilter(req, res);
		System.out.println("FilterC doFilter() ---- End");
	}

	@Override
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("FilterC init() ---- Begin");
		
		System.out.println("FilterC init() ---- End");
	}

}
