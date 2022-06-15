package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.util.Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWeightUtility {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://app.hubspot.com/login");
//		Thread.sleep(5000); 
		
		//page object
		By emailid=By.id("username");
		By password=By.id("password");
		By loginButton=By.id("loginBtn");
		
Util util = new Util(driver);
util.

		
		
		
			
		}
		
	}
}	
			
			
