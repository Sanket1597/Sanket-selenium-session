package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://register.rediff.com/utilities/newforgot/index.php?FormName=showlogin");
		driver.findElement(By.name("next")).click();
		Thread.sleep(5000);
		
		Alert alert =driver.switchTo().alert();
String text=alert.getText()	;
System.out.println(text);

if (text.equals("Please enter your email ID")) {
	System.out.println("correct error message");

}
else {
	System.out.println("incorrect message");
}
alert.accept();

//alert.dismiss();
	}

}
