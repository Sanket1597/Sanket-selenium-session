package From_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_2 {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//	
//		driver.get("https://app.hubspot.com/login");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
//		x Path Axes
//		Mostly used in webTables
//		following,preceding,parent,child, ancestor
//		ancestor=Highest Parent
//		----------------------------
		
//		--------> classic CrmPro site
		
//		---------> following
		//div[@class='input-group']//following :: input
		//div[@class='input-group']//following :: input[@name='username']
		//div[@class='input-group']//following :: input[@name='password']
		//div[@class='input-group']//following :: input[@class='btn btn-small']
		
		//div[@class='input-group']//following :: input[1]
		//div[@class='input-group']//following :: input[2]
		//div[@class='input-group']//following :: input[3]
		
//	------------------------------------------------------------------------------
//	----->preceding = i.e before
		
		//input[@name="username"]//preceding :: div
		//input[@class="form-control"]//preceding :: div
		
//	--------------------------------------------------------
//	----->parent
		//input[@class="form-control"]//parent :: div
	
//	----->child
		//div[@class="input-group"]//child :: input
		//div[@class='input-group']//child::input[@name='username']
		
//		--------------------------------------------------------
//		----->ancestor
//		ancestor=Highest Parent
		//div[@class='input-group']//ancestor::div[@class='container']
		
//		------------------------------------------------------------------------------
//		reverse x path - traversing backwardly in Dom
		
//		input[@id='username']//..//../..//..//..
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://app.hubspot.com/login");
		Thread.sleep(2000);
		Actions action=new Actions(driver1);
		
		WebElement email=driver1.findElement(By.id("username"));
		WebElement pass=driver1.findElement(By.id("password"));
		WebElement login=driver1.findElement(By.id("loginBtn"));
		
		Thread.sleep(3000);
		action.sendKeys(email, "avsaresanket1997@gmail.com").build().perform();
		action.sendKeys(pass, "Sanket@1597").build().perform();
	action.click(login).build().perform();
		
		
		
		
	
	}
		
		
		
		
		
		
		
		

	}


