package From_20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationConceptTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://babynames.merschat.com/popular.cgi");
		
		List<WebElement> namelist= driver.findElements(By.xpath("//a[contains(text(),' Heli ')]"));
		
	while (true) {
		
		if(!(namelist.size()==1));{
		driver.findElement(By.linkText("Next")).click();
		namelist= driver.findElements(By.xpath("//a[contains(text(),' Heli ')]"));
	}
		
	else {
		String title=driver.findElement(By.xpath("(//a[contains(text(),' Heli ')]/../parent::td//following-sibling::td)[2]//a")).getAttribute("title");
		System.out.println(title);
		break;
	}
		
	}
	}
}
	
	

	
