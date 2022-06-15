package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://app.hubspot.com/login");
		
		public static WebElement WaitForElementWithFluentWait(WebDriver driver , final By locator) {
			Wait<WebDriver> wait= new FluentWait<WebDriver>(driver);
			
					
		}
		
		
		
		
		
		
		
		

	}

}
