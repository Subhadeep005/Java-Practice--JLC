package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
@WebFilter(
		filterName="filterA",
		urlPatterns="/hello.jlc"
		)
public class FilterA implements Filter {

	@Override
	public void destroy() {	
		System.out.println("FilterA destroy()");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FilterA doFilter() ---- Begin");
		chain.doFilter(req, res);
		System.out.println("FilterA doFilter() ---- End");
	}

	@Override
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("FilterA init() ---- Begin");
		
		System.out.println("FilterA init() ---- End");
	}

}
