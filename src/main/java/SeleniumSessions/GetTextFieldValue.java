package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextFieldValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		Thread.sleep(5000);
		
		driver.findElement(By.name("emailOrPhone")).sendKeys("avsare@gmail.com");
		String value=driver.findElement(By.name("emailOrPhone")).getAttribute("value");
		System.out.println(value);
		
		
		
		
		
	}

}
