package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		Thread.sleep(4000);
	driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();		
//	driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("123");
		
	Thread.sleep(4000);
	WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
	WebElement month =driver.findElement(By.xpath("//select[@id='month']"));	
	WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
//	Thread.sleep(6000);
	Select select =new Select(day);
//		select.selectByVisibleText("10");
	select.selectByIndex(9);
////		Thread.sleep(2000);
//		Select select1 =new Select(month);
//		select1.selectByVisibleText("Oct");
////		Thread.sleep(2000);
//		Select select2 =new Select(year);
//		select2.selectByVisibleText("1997");	
	selectValueFromDropdowwn(day , "5");
	selectValueFromDropdowwn(month , "Oct");
	selectValueFromDropdowwn(year , "1997");
	}
	/**
	 * this method is used to select value from dropdown on the basis of given text
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropdowwn(WebElement element , String value){
	
	Select select =new Select(element);
	select.selectByVisibleText(value);
	
	}
}
