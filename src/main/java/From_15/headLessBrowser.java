package From_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class headLessBrowser {

	public static void main(String[] args) {
		
		//no browse
		//testing  happens behind the scene
		//faster
		
	
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co=new ChromeOptions();
//		co.addArguments("--headless");
//		
//		WebDriver driver= new ChromeDriver(co);
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fo =new FirefoxOptions();
		//fo.addArguments("--headless");
		fo.addArguments("--incognito");//private window
		WebDriver driver= new FirefoxDriver(fo);
		
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
