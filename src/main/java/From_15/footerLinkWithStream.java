package From_15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class footerLinkWithStream {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		Thread.sleep(25000);
		driver.findElements(By.cssSelector("ul.footer-nav li a"))
		
		.stream()
		.filter(ele ->! ele.getText().isEmpty())
		.forEach(ele -> System.out.println(ele.getText()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
