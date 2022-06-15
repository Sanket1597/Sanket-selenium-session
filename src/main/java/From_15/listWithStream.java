package From_15;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listWithStream {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver1.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		By country= By.xpath("//select[@name='Country']");
		
		By country_options=By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		List<WebElement>country_list=	driver1.findElements(country_options);
		
		
	long startTime=	System.currentTimeMillis();
		country_list.stream().forEach(ele -> System.out.println(ele.getText()));//-------sequenial stream
	long endTime=	System.currentTimeMillis();
	System.out.println(endTime-startTime);
	
	
	//	country_list.parallelStream().forEach(ele -> System.out.println(ele.getText()));// paralel  stream
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
