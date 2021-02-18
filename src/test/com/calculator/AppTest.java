package com.calculator;

import junit.framework.*;


public class AppTest extends TestCase{

	public AppTest(String testName) {
		super(testName);
	}
	
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}
	
	public void testApp() {
		App a= new App(0,0);
		a.a=5;
		a.b=10;
		assertEquals(15,a.add());
		assertEquals(-5,a.sub());

	}
	
}
