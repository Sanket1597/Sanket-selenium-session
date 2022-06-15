package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		
		WebElement RightClick=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		action.contextClick(RightClick).build().perform();
		
		String text=	driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span")).getText();
		System.out.println(text);
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
