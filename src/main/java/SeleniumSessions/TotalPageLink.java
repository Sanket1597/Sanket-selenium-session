package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLink {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.amazon.in");	
		
		List <WebElement> Linklist=driver.findElements(By.tagName("a"));
		System.out.println("linklist size"+ Linklist.size());
		
		for (int i=0; i<Linklist.size(); i++) {
		String text=Linklist.get(i).getText();
			System.out.println(text);
		}
		
		
		

	}

}
