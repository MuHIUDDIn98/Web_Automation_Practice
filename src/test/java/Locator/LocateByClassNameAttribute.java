package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateByClassNameAttribute extends BaseDriver{

//	WebDriver driver;
	String URL = "https://www.daraz.com.bd/#";
//	
//	@BeforeSuite
//	public void StartBrowser() {
//		WebDriverManager.chromiumdriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}
	
	@BeforeClass
	public void OpenURL() {
		
		driver.get(URL);
	}
	
	@Test
	public void locateByClassName() throws InterruptedException{
	WebElement classNameLocator = driver.findElement(By.className("bld-txt"));
	classNameLocator.click();
	Thread.sleep(5000);
	}
	
	@AfterSuite
	public void closeChromeBrowser() {
		driver.close();
	}
}
