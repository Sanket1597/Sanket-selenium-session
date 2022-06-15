package From_20;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserWindowIeterator {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']"));
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']"));
		
		
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it=handles.iterator();

		while(it.hasnext);
	String childwindow=	it.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		driver.close();
		
		
	

	}

}
