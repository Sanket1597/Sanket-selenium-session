package From_9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//a[contains(text(),' Jos Buttler ')]//parent::div//following-sibling::div[@class='cb-col cb-col-8 text-right text-bold']
import io.github.bonigarcia.wdm.WebDriverManager;

public class Criccbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.cricbuzz.com/live-cricket-scorecard/47605/gt-vs-rr-final-indian-premier-league-2022");
		driver1.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	//	Actions action=new Actions(driver1);
		
		List<WebElement> scorecard=	driver1.findElements(By.xpath("//a[contains(text(),' Hetmyer ')]//parent::div//following-sibling::div[@class='cb-col cb-col-8 text-right']"));
		System.out.println(scorecard.size());
		
		for(int i=0; i<scorecard.size(); i++) {
			System.out.println(scorecard.get(i).getText());
		}
	}

}
