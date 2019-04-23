package com.amazon.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUtilities {
	public static WebDriver driver;
	
	
	public void setWebBrowser(String browser){
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Setting up browser : " + browser);
			// driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		}
	}
	
	
	public void click(By locator){
		driver.findElement(locator).click();
	}

}
