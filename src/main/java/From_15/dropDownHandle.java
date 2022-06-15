package From_15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	
		By country= By.xpath("//select[@name='Country']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Select select= new Select(driver.findElement(country));
//		select.selectByVisibleText("India");
		
		doSelectByVisibleText(country, "India");//method calling
		
		selectdropDownValue(country, "Index", "5");
		selectdropDownValue(industry, "VisibleText", "Education");
		selectdropDownValue(country, "value", "India");
		
	}	
	public static void selectdropDownValue(By locator, String  type, String value) {
		
		Select select = new Select(getElement(locator));
		
		switch (type) {
		case"Index":
			select.selectByIndex(Integer.parseInt(value));
			break;
			
		case"value":
			select.selectByValue(value);
			break;
			
		case"VisibleText":
			select.selectByVisibleText(value);
			break;	
			
			default:
					System.out.println("plz pass the correct selection criteria");
					break;
		}
		
	}
public static WebElement getElement(By locator) {
return driver.findElement(locator);

}

	public static void doSelectByVisibleText(By locator, String value) {//generic method foe dropdown
		Select select= new Select(getElement(locator));
	select.selectByVisibleText(value);	
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {////generic method foe dropdown
		Select select= new Select(getElement(locator));
	select.selectByIndex(index);	

	}
	
	public static void doSelectDropDownByValue(By locator, String value) {//generic method foe dropdown
		Select select= new Select(getElement(locator));
	select.selectByValue(value);	
	}
}
