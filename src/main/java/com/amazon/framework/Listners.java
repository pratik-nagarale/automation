package com.amazon.framework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
	
	
	public void onFinish(ITestContext context) {
		//  TODO : Close the browser and close report
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Hi On Start");
		SeleniumUtilities u = new SeleniumUtilities();
		String b = context.getCurrentXmlTest().getParameter("browser");
		u.setWebBrowser(b);
		
		// report start
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
