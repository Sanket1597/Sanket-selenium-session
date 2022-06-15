package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWeight {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://app.hubspot.com/login");
		
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.titleContains("HubSpot"));
	
driver.getTitle();	

		By emailid=By.id("username");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
		
		WebElement email=driver.findElement(emailid);
		email.sendKeys("raj@gmail.com");
	}


//	
//	public static WebElement getElementWithExpWait(WebDriver driver, int timeout ,By loacator) {
//	WebDriverWait wait = new WebDriverWait(driver , timeout);
//	return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(loacator));
}
	