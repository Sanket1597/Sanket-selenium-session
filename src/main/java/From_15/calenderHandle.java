package From_15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderHandle {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ixigo.com/?utm_source=Google_Search&utm_medium=paid_search_google&utm_campaign=Ixigo_Brand&gclid=Cj0KCQjwqPGUBhDwARIsANNwjV5iCIrYcn6IlPgvxB7rKZ8Zt_d5TEtLSAwz9sfea4lgbLbrmUs4hS4aAlLqEALw_wcB");
	
		//table[@class='rd-days'][1]//div[text()='22']-------------------for 2nd option for selecting date
		//startDate
		driver.findElement(By.xpath("//input[@placeholder='Depart' and @type='text'] ")).click();
		 Thread.sleep(5000);
		
		 List<WebElement> startDatelist=	driver.findElements(By.xpath("(//div[@class='rd-month'])[1]/table//div[contains(@class,'day')]"));
		
		 for(WebElement e: startDatelist ) {
			 if(e.getText().equals("18")) {
				 e.click();
				 break;
			 }
		 }
		 
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@placeholder='Return' and @type='text']")).click();
		 Thread.sleep(4000);
		 
		 
	String	 monthvalue= driver.findElement(By.xpath("(//div[@class='rd-month'])[1]/table//div[contains(@class,'day')]")).getText();//problem occur
	
	while(!monthvalue.contains("October 2022")) {
		driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
		 monthvalue= driver.findElement(By.xpath("(//div[@class='rd-month'])[1]/table//div[contains(@class,'day')]")).getText();	
		
	}
		 
		//endDate
		
		 List<WebElement> endDatelist=	driver.findElements(By.xpath("(//div[@class='rd-month'])[2]/table//div[contains(@class,'day')]"));
			
		 for(WebElement e: endDatelist ) {
			 if(e.getText().equals("20")) {
				 e.click();
				 break;
			 }
		 }
		
		
		
		
	}

}
