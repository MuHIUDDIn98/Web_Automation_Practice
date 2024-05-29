package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class LocateByCssSelector extends BaseDriver{
	
	String URL = "https://www.your-campus.com/";
	@BeforeClass
	public void OpenURL() {
		driver.get(URL);
	}
	
	@Test (priority =1)
	public void locateByLinkText() throws InterruptedException {
		WebElement LocateByLinkContact = driver.findElement(By.linkText("Contact"));
		LocateByLinkContact.click();
		Thread.sleep(5000);
	}
	
	@Test (priority=2)
	public void locateByCSSLocator() throws InterruptedException {
		WebElement cssLocator1 = driver.findElement(By.cssSelector("textarea[name='message']"));
		//In CSS, we can use # notation to select the id attribute of an element:
		WebElement cssLocator2 = driver.findElement(By.cssSelector("textarea#message"));
		
		cssLocator1.sendKeys("Hello from css locator 1 ->>");
		cssLocator2.sendKeys("Hello from Css locator2");
		Thread.sleep(5000);
		
	}

}
