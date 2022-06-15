package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		Thread.sleep(5000);
	WebElement soureElement=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement targetElement=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
//	Thread.sleep(5000);
//	WebElement targetElement=driver.findElement(By.id("droppable"));
	Thread.sleep(5000);
//	action.clickAndHold(soureElement).moveToElement(targetElement).release().build().perform();
	action.dragAndDrop(soureElement, targetElement).build().perform();
	}

}	
