package com.test.cases;

import org.testng.annotations.Test;

public class TestCase2 {
	
	
	@Test
	public void testCaseTwo() {

		System.out.println("Hello TestNG Framework 2");

	}
	
	@Test(dependsOnMethods="testCaseTwo")
	public void testCaseTwo2() {

		System.out.println("Hello TestNG Framework 2");

	}

}
