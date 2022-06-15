package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValues {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(3000);
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));	
		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		
		Select select =new Select(day);
		List<WebElement> daylist=	select.getOptions();
		System.out.println("total days: "+daylist.size());
		
		for(int i=0; i<daylist.size(); i++) {
			String text=daylist.get(i).getText();
			System.out.println(text);
		}
		
		
	}

}
