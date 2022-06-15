package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionEvent {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		
		WebElement email=driver.findElement(By.id("username"));
		WebElement pass=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("loginBtn"));
		
		action.sendKeys(email, "sanket@gmail.com").build().perform();
		action.sendKeys(pass, "Sanket@123").build().perform();
	action.sendKeys(login, "sanket@321").build().perform();
		//action.click(login).build().perform();
		
		
		
		
		
	}

}
