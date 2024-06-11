package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorRelativeXpathAttribute extends BaseDriver{
	//  relative xpath format: //Tag[@attribute = 'value' ]
	@Test
	public void relatieXpath() throws InterruptedException {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		WebElement FormName = driver.findElement(By.xpath("//h1[contains(text(),'Student Registration Form')]"));
		System.out.println(FormName.getText());
		
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Muhiuddin");
		Thread.sleep(1000);
		firstName.clear();
		
		WebElement firstName1 = driver.findElement(By.xpath("//form[@id='practiceForm']/div[1]/div[1]/input[@id='name']"));
		firstName1.sendKeys("Subrata");
		
		WebElement LastName = driver.findElement(By.xpath("//*[@id='email']"));
		LastName.sendKeys("muhiuddinnaik98@gmail.com");
		Thread.sleep(1000);
		
		WebElement Number = driver.findElement(By.xpath("//form[@id='practiceForm']/div[4]/div/input[@placeholder='Enter Mobile Number']"));
		Number.sendKeys("01521327657");
		
		WebElement Subject = driver.findElement(By.xpath("//form[@id='practiceForm']/div[6]/div/input[@placeholder=\"Enter Subject\"]"));
		Subject.sendKeys("Electronics and communication Engineering");
		
		WebElement AddressField = driver.findElement(By.xpath("//form[@id='practiceForm']/div[9]/div/textarea[@placeholder='Currend Address']"));
		AddressField.sendKeys("Mogbazar BTCL coloney Dhaka");
		
		Thread.sleep(3000);
	
	}
}
