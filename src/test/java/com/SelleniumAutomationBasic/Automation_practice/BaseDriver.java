package com.SelleniumAutomationBasic.Automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

		
		WebDriver driver;
		@BeforeSuite
		public void starBrowser() {
			String BrowserName = System.getProperty("browser","chrome");
			
			
			if(BrowserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
			}
			else if(BrowserName.equals("fireFox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
		
		}
		
		@AfterSuite
		public void close() {
			driver.close();
		}

}
	

