package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainFrameHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		WebElement frameElement=driver.findElement(By.name("main"));
		//1.driver.switchTo().frame(frameElement);
		//2.driver.switchTo().frame("main");
		driver.switchTo().frame(2);
	String text=	driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		
//		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();

	}

}
