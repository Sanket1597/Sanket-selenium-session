package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(8000);
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));	
		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
			Thread.sleep(7000);
		DropDownUtil.getDropDownValues(month);
		
		/**
//		 * this metod is used get all the values from arralist
//		 * @param element
//		 */
//	ArrayList<String> monthList=	DropDownUtil.getDropDownValues(month);
//		System.out.println(monthList);
//		
//		ArrayList<String> dayList=	DropDownUtil.getDropDownValues(day);
//		System.out.println(dayList);
//		
//		ArrayList<String> yearList=	DropDownUtil.getDropDownValues(year);
//		System.out.println(yearList);
		
		
	}

}
