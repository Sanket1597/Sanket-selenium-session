package From_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	 //input[@id='username']
		//div//input[@id='username']
		
		//div//input----direct+indirct child
		//div/input-----direct child
		
		 //*[@id='username']
		
		 //input[@id='username' and @type='email']
		
		 //input[@id='username' and @class='form-control private-form__control login-email']
		
		//input[contains(@class,'private-form')]
		//input[contains(@id,'username')]
		//input[contains(@class,'login-email')]
		//input[contains(@class,'')]
		
		//contins used  for dynamic ids
//		<input id='test_123'>
//		<input id='test_155'>	
//		<input id='test_178'>

		//input[contains(@id,'test_')]
		
		//input[contains(@class,'form-control')][1]
		//input[contains(@class,'form-control')][2]
		
		//(//input[contains(@class,'form-control')])[position()=1]
			//	(//input[contains(@class,'form-control')])[position()=2]
		
	//	(//input[contains(@class,'form-control')])[last()]
		
	//	(//i18n-string)[5]
		
		//text in xpath
		//htmltag[text()='value']
		//i18n-string[text()='Forgot my password']
		
		//span[text()='Show Password']
		//span[contains(text(),'Show Password')]
		//span[contains(text(),'Show')]
		//span[contains(text(),'password')]
		
		//span[starts-with(text(),'Greetel')]
		//span[starts-with(@class,'account')]
		
		//i18n-string[text()='Sales Dashboard']
		//h1[@class='Heading-sc-1tiwaj6-0 H1-hzor1s-0 cugtTn private-page__title']
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		
		WebElement email=driver.findElement(By.id("username"));
		WebElement pass=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("loginBtn"));
		
		action.sendKeys(email, "avsaresanket1997@gmail.com").build().perform();
		action.sendKeys(pass, "Sanket@1597").build().perform();
	action.click(login).build().perform();
	Thread.sleep(4000);
	String headerValue=	driver.findElement(By.xpath("//h1[@class='Heading-sc-1tiwaj6-0 H1-hzor1s-0 cugtTn private-page__title']")).getText();
	System.out.println(headerValue);
	Thread.sleep(4000);
	System.out.println(driver.findElement(By.xpath("//i18n-string[text()='Sales Dashboard']")).isDisplayed());
	

	}

}
