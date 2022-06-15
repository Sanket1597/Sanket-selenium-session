package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotConcept {

//	private static final String TakesScreenShot = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000); 
	File SrcFile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(SrcFile, new File("./target/scrrenshot/page.png"));
	
/**
 * Utility Method	
 */
	TakesScreenshot(driver,"login");
	}
public static void TakesScreenshot(WebDriver driver , String fileNAme) {
	File SrcFile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(SrcFile, new File("./target/scrrenshot/"+fileNAme+"page.png"));
	}
	catch (IOException e){
		e.printStackTrace();
	}
	
	}

}
