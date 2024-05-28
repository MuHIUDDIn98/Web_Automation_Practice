package com.SelleniumAutomationBasic.Automation_practice;

import org.testng.annotations.Test;

public class OpenURL extends BaseDriver{
	
	@Test
	public void open() throws InterruptedException {
		driver.get("https://www.your-campus.com/");
		Thread.sleep(5000);
		
	}

}