package com.jlcindia.junit3;

import com.jlcindia.Hello;

import junit.framework.TestCase;

public class HelloTest extends TestCase {

	Hello hello = null; // Resource Declaration

	@Override
	protected void setUp() throws Exception {
		System.out.println("setUp()");
		super.setUp();
		hello = new Hello(); // Resource Initialization
	}

	@Override
	protected void tearDown() throws Exception {
		System.out.println("tearDown()");
		super.tearDown();
		hello = null;
	}

	public void testGetMessage1() {
		System.out.println("testGetMessage1()");
		String str = hello.getMessage1();
		assertNotNull(str);
	}

	public void testGetMessage2() {
		System.out.println("testGetMessage2()");
		String str = hello.getMessage2();
		assertNotNull(str);
	}
}
