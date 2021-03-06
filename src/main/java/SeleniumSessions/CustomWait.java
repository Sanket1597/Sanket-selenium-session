package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {
				
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		
			driver.get("https://app.hubspot.com/login");
			
			By emailid=By.id("username");
			By password=By.id("passsword");
			By login=By.id("loginBtn");

			getElementWithWait(driver,emailid,8).sendKeys("sank@gmail.com");
			driver.findElement(password).sendKeys("sank@123");
			driver.findElement(login).click();
	
}
public static WebElement getElementWithWait(WebDriver driver, By locator, int timeout) {
	WebElement element=null;
	for(int i=0; i<timeout; i++) {
		
		try {
		element=driver.findElement(locator);
		break;
	}
	catch (Exception e){
		System.out.println("waiting for element to be present on page"+i+"sec");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e1) {
			
		}
		
	}
		



}return element;
}
}
