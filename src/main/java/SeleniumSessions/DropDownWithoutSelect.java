package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(3000);
		List<WebElement> daylist=driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(daylist.size());
		Thread.sleep(3000);
		for (int i=0; i<daylist.size(); i++) {
			String text=daylist.get(i).getText();
			System.out.println(text);
			if(text.equals("25")) {
				daylist.get(i).click();
				break;
			}
		}
		
		
		
		
		
		

	}

}
