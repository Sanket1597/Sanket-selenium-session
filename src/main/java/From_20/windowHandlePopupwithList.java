package From_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandlePopupwithList {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		
		driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[3]/img")).click();
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		
		List<String> handleList= new ArrayList<String>(handles);
			
		Thread.sleep(3000);
	String parentWindowId=	handleList.get(0);
			String childWindowId =handleList.get(1);
			
			Thread.sleep(3000);
			
			driver.switchTo().window(childWindowId);
			System.out.println("child title :"+driver.getTitle());
		
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(parentWindowId);
			System.out.println("parent title :" +driver.getTitle());
			
				driver.quit();

		
		
		
		
		
		
		
	}

}
