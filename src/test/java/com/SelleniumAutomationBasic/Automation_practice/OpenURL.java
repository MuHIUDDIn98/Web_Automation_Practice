package com.SelleniumAutomationBasic.Automation_practice;

import org.testng.annotations.Test;

public class OpenURL extends BaseDriver{
	String URL = "https://www.your-campus.com/";
	
	@Test
	public void open() throws InterruptedException {
		driver.get(URL);
		Thread.sleep(5000);
		
	}
	
	

}