package From_9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		
//		setChoiceValues(driver,"choice 2");
//		setChoiceValues(driver, "choice 2 3");
//		setChoiceValues(driver, "choice 6 2 3");// for single 
			setChoiceValues(driver, "choice 2 ","choice 2 3" ,"choice 6 2 3");// for array
	}
	/**
	 * used for passing single parameter
	 * @param driver
	 * @param value
	 */
	
//	public static void setChoiceValues(WebDriver driver , String value) {
//		
//List<WebElement> choicelist=  driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li//span[@class='comboTreeItemTitle']"));
//		
//		for(int i=0; i<choicelist.size(); i++) {
//			System.out.println(choicelist.get(i).getText());
//			String text= choicelist.get(i).getText();
//			if(text.equals(value)) {
//				choicelist.get(i).click();
//				break;
		//	}
			
	/**
	 * used for passing multiple parameter by using array
	 * @param driver
	 * @param value
	 */
			public static void setChoiceValues(WebDriver driver , String... value) {
				
				List<WebElement> choicelist=  driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li//span[@class='comboTreeItemTitle']"));
						
						for(int i=0; i<choicelist.size(); i++) {
							System.out.println(choicelist.get(i).getText());
							String text= choicelist.get(i).getText();
							
	for(int k=0;k<value.length; k++) {
		if(text.equals(value[k])) {
			choicelist.get(i).click();
			break;
		
		}
	}
						}
			}		
} 				
			
		
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


