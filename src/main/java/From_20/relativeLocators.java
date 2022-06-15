package From_20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.*;//////////problem occurs
public class relativeLocators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Hamilton, Canada']"));
		
	String aqNum=	driver.findElement(With(By.tagName("p")).toRightOf(ele)).getText();
	System.out.println(aqNum);
		
	String rank=	driver.findElement(With(By.tagName("p")).toLeftOf(ele)).getText();
	System.out.println(rank);
	
	
	String belowCity=	driver.findElement(With(By.tagName("p")).below(ele)).getText();
	System.out.println(belowCity);
	
	String CitycolName=	driver.findElement(With(By.tagName("p")).above(ele)).getText();
	System.out.println(CitycolName);
	
		

	}

}
