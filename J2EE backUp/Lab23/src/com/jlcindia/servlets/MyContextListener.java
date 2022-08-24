package com.jlcindia.servlets;

import javax.servlet.*;

public class MyContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ContextDestroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("contextInitialized");
		ServletContext ctx=event.getServletContext();
		ctx.setAttribute("TV", 0);
		ctx.setAttribute("TA", 0);
	}

}
