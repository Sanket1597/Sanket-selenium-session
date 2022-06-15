package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWeight {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://app.hubspot.com/login");
		//applied for all element
//		globally wait
//		dynamic wait
//		gives error no such element exception
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement emailid=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginButton=driver.findElement(By.id("loginBtn"));
		
		emailid.sendKeys("bunty@gmail.com");
		password.sendKeys("bunty@123");
		loginButton.click();
		
		
		
		
		
		
		
		
		
		

	}

}
