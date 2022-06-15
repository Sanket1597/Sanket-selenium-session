package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);
		//1.id
		//WebElement email=driver.findElement(By.id("username"));
		//email.sendKeys("sanket123@gmail.com");
		
		//WebElement pwd=driver.findElement(By.id("password"));
		//pwd.sendKeys("test123");
		
		//driver.findElement(By.id("loginBtn")).click();
		//2.name
		//driver.findElement(By.name("email")).sendKeys("sanket@gmail.com");
	//	driver.findElement(By.name("password")).sendKeys("123");
	//	driver.findElement(By.name("en-us")).click();
		
		//3.xpath
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("avsare@mgail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]/i18n-string")).click();
		
		
		
		
		
		
		
	}

}
