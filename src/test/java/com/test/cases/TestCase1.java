package com.test.cases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.page.objects.WrapperClass;

public class TestCase1 extends WrapperClass {

	
	@Test
	public void testCaseOne() {

		System.out.println("Hello TestNG Framework");

	}

	/*@AfterTest
	public void afterTest() {
		
		System.out.println("After");

	}*/

}
