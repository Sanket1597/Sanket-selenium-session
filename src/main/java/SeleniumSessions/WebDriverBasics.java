package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.get("http://www.google.com");
        String title =driver.getTitle();
System.out.println(title);
	 
 if(title.equals("Google")) {
	 System.out.println("pass"); 
 }

 else {
	 System.out.println("fail");
 }
 
 //driver.quit();
 driver.close();
 //System.out.println(driver.getTitle()); //Session ID is null. Using WebDriver after calling quit()?
	}
}
