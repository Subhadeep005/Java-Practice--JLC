package com.jlcindia.servlets;

import javax.servlet.http.*;

public class MySessionListener implements HttpSessionListener{

	public MySessionListener() {
		System.out.println("MySessionListener() def Constructor");
	}
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("requestInitialized(Session)");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("requestDestroyed(Session)");
	}

}
