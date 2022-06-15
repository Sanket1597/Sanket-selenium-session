package From_20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class relativeLocator {

	public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://whenwise.com/sign-in");
		
		driver.findElement(By.id("email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		driver.findElement(By.id("login-btn")).click();
		
		driver.get("https://whenwise.com/users/2835/edit");
		driver.findElement(By.xpath("//span[text()='Email on booking confirmation?']/parent::div//span[@class='lever']")).click();
		
		
	//WebElement ele=	driver.findElement(By.xpath("//span[text()='Email on booking confirmation?']"));
		
	//driver.findElement(With(By.className("lever")).toRightOf(ele)).click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
