package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageUtil {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000); 
		//page object
		By emailid=By.id("username");
		By password=By.id("password");
		By loginButton=By.id("loginBtn");
		By signUp=By.linkText("Sign up");
		/**
		 * normal util calling
		 */
		Util util=new Util(driver); {
		/**
		 * method calling  by getElement
		 */
//		util.getElement(emailid).sendKeys("avsare@gmail.com");
//		util.getElement(password).sendKeys("sanket@123");
//		util.getElement(loginButton).click();
//		
			/**
			 * method calling  by doSendKeys
			 */
//		util.doSendKeys(emailid, "raju@gmail.com");
//		util.doSendKeys(password, "raju@123");
//		util.doclick(loginButton);
		/**
		 * method calling by DoAction Sendkey & DoClick
		 */
//		util.doActionSendKeys(emailid, "shital@gmail.com");
//		util.doActionSendKeys(password, "shital@123");
//		util.doActionClick(loginButton);
		
			/**
			 * method calling by ExplicitWeight util
			 */
//			util.waitForElementToBePresent(emailid, 15).sendKeys("avas@gmail.com");
//			util.doSendKeys(password, "avsa@1234");
////			util.doclick(loginButton);
//			util.waitForElementToBePresent(loginButton, 5).click();
//		}	
		/**
		 * get title utility
		 */
//		util.waitForTitleToBePresent("Login", 6);
//		System.out.println(driver.getTitle());
		
	}
		util.clickWhenReady(signUp, 6);
	}
}
	


