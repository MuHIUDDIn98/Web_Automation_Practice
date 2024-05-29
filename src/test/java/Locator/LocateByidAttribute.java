package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class LocateByidAttribute extends BaseDriver {
	String URL ="https://www.your-campus.com/";
	
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
	public void locateByName() {
		WebElement LocatorByName = driver.findElement(By.name("name"));
		LocatorByName.sendKeys("Muhiuddin");
		
	}
	
	@Test(priority =3)
	public void locateBYID() throws InterruptedException {
		WebElement LocateByid = driver.findElement(By.id("email"));
		LocateByid.sendKeys("muhiuddinanik98@gmail.com");
		Thread.sleep(5000);
	}

}
