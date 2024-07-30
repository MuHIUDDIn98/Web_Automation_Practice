package Locator;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocateById_name extends BaseDriver{
	
	
	public static String extractString(String sentence) {
        int startPos = sentence.indexOf("'") + 1;
        int endPos = sentence.lastIndexOf("'");

        if (startPos > 0 && endPos > startPos) {
            return sentence.substring(startPos, endPos);
        } else {
            return "";  // Handle case where no quotes are found
        }
    }
	
	
	@Test (priority = 1)
	public static void OpenUrL() {
		String URL = "https://rahulshettyacademy.com/locatorspractice/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		if(URL == driver.getCurrentUrl()) {
//		 System.out.println(driver.getCurrentUrl());
//		 }
	}
	
	
	@Test (priority = 2)
    public static void Login_attempt() throws InterruptedException {
    	
    	WebElement Name = driver.findElement(By.id("inputUsername"));
    	Name.sendKeys("muhiuddin");
    	WebElement Pass = driver.findElement(By.name("inputPassword"));
    	Pass.sendKeys("rahulshettyacademy1");
    	WebElement submitBtn = driver.findElement(By.className("submit"));
    	submitBtn.click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	WebElement errorMessage = driver.findElement(By.cssSelector("p.error"));
    	System.out.println(errorMessage.getText());
    	WebElement forgetPass = driver.findElement(By.linkText("Forgot your password?"));
    	forgetPass.click();
    	Thread.sleep(1000);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	WebElement regisName = driver.findElement(By.xpath("//input[@placeholder='Name']"));
    	regisName.sendKeys("Muhiuddin");
    	Thread.sleep(1000);
    	WebElement regisEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
    	regisEmail.sendKeys("muhiuddinanik98@gmail.com");
    	Thread.sleep(1000);
    	
    	WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
    	phoneNumber.sendKeys("01521327657");
    	Thread.sleep(1000);
    	
    	WebElement resetButton = driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	
    	resetButton.click();
    	
    	WebElement infoMsg = driver.findElement(By.cssSelector("p.infoMsg"));
    	String resetInfo = infoMsg.getText();
    	
    	Assert.assertEquals(resetInfo, "Please use temporary password 'rahulshettyacademy' to Login.");
    	
    	System.out.println(resetInfo);
    	String extractedString = extractString(resetInfo); 
    	System.out.println(extractedString);
    	
    	WebElement goToLogin = driver.findElement(By.cssSelector("button.go-to-login-btn"));
    	goToLogin.click();
    	
    	Name.sendKeys(extractedString);
    	Thread.sleep(1000);
    	Pass.sendKeys(extractedString);
    	
    	Thread.sleep(1000);
    	submitBtn.click();

    	Thread.sleep(5000);
    	
    }
	
	
	
	

	


}
