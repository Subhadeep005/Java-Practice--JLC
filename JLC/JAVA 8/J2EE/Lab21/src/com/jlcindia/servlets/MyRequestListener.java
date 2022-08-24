package com.jlcindia.servlets;

import javax.servlet.*;

public class MyRequestListener implements ServletRequestListener{

	public MyRequestListener() {
		System.out.println("MyRequestListener() def Constructor");
	}
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("requestDestroyed(Request)");
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("requestInitialized(Request)");
	}

}
