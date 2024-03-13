package com.ss.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class ShopperStackBaseClass {

	protected WebDriver webDriver;
	
	@Parameters("bName")
	@BeforeClass
	public void launchApplication(String bname) {
		if(bname.contains("FireFox")) 
			webDriver=new FirefoxDriver();
		
		if(bname.contains("Chrome")) 
			webDriver=new ChromeDriver();
		
		if(bname.contains("Edge")) 
			webDriver=new EdgeDriver();
		
		webDriver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeApplication() {
		webDriver.close();
	}
	
}
