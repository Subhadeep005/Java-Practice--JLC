package com.jlcindia.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
@WebListener
public class MyContextListener implements ServletContextListener{
	
	public MyContextListener() {
		System.out.println("MyContextListener() def Constructor");
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext ctx=event.getServletContext();
		System.out.println("ContextDestroyed :"+ctx);
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext ctx=event.getServletContext();
		System.out.println("ContextInitialized :"+ctx);
	}

}
