package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en&source=auth_switcher");
		Thread.sleep(5000);
		driver.findElement(By.className("zyHYP")).sendKeys("avsare@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.className("DhRcB")).click();
		
		Thread.sleep(3000);
		String ErrorText=driver.findElement(By.id("slfErrorAlert")).getText();
		System.out.println(ErrorText);
		
		
		
		

		
		
		
		
		
		
		
		
	}

}
