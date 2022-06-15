package From_15;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hashmap_Concept {

	public static void main(String[] args) {
		
//		Map<String,String> usermap= new HashMap<String , String>();
//		
//		usermap.put("admin", "admin_admin");
//		usermap.put("patient", "tom@gmail.com_test@123");
//		usermap.put("doctor", "peter@gmail.com_test@123456");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://app.hubspot.com/login");
		driver1.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//		driver1.findElement(By.id("username")).sendKeys(usermap.get("patient").split("_")[0]);
//		driver1.findElement(By.id("password")).sendKeys(usermap.get("patient").split("_")[1]);
//	
		doLogin(driver1,  getUsermap(),"patient");
		
	}
	/**
	 * utility for getusername for logincredenial
	 * @return
	 */
	public static Map<String,String> getUsermap() {
Map<String,String> usermap= new HashMap<String , String>();
		usermap.put("admin", "admin_admin");
		usermap.put("patient", "tom@gmail.com_test@123");
		usermap.put("doctor", "peter@gmail.com_test@123456");
		
		return usermap;
	}
	
	
/**
 * utility for hashmap for dologin
 * @param driver
 * @param usermap
 * @param userkey
 */
	public static void doLogin(WebDriver driver, Map<String,String>usermap, String userkey) {
		driver.findElement(By.id("username")).sendKeys(usermap.get(userkey).split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(usermap.get(userkey).split("_")[1]);
		
	}
	
	
	
	
	
	
	
}
