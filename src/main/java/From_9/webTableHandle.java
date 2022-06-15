package From_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableHandle {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	int rowCount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
	System.out.println(rowCount);
	
	//*[@id="customers"]/tbody/tr[2]/td[1]
	//*[@id="customers"]/tbody/tr[3]/td[1]
	//*[@id="customers"]/tbody/tr[7]/td[1]
	
		String beforeXpath ="//*[@id='customers']/tbody/tr[";
		String afterXpath ="]/td[1]";
		
		for(int rowNo=2; rowNo<=rowCount +1; rowNo++ ) {
			String acutalXpath= beforeXpath+rowNo+afterXpath;
		//	System.out.println(acutalXpath);
		String value=	driver.findElement(By.xpath(acutalXpath)).getText();
			System.out.println(value);
		}
				
		
		
		
	}

}
