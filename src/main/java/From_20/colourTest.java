package From_20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class colourTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("avsare@gmail.@com");
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		
		System.out.println(driver.findElement(By.cssSelector("div.form-group.form-error")).isDisplayed());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
