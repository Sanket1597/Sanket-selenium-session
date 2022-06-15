package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValue2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(3000);
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));	
		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		
		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);

	}
	/**
	 * this metod is used get all the values from dropdown
	 * @param element
	 */
	public static void getDropDownValues(WebElement element) {
		System.out.println("------------------------");
		Select select =new Select(element);
		
		List<WebElement> droplist=	select.getOptions();
		System.out.println("total no of dropdown values: "+droplist.size());
		
		for(int i=0; i< droplist.size(); i++) {
		String  text=	droplist.get(i).getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
