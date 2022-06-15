package From_20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderHandling {
static WebDriver driver;
	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
//		
driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//	//	driver.findElement(By.xpath("//a[text()='17']")).click();
//		
//		List<WebElement> dateList=driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
//		System.out.println(dateList.size());
//		
//		for(WebElement e: dateList) {
//		String date=	e.getText();
//		if(date.equals("15")) {
//			e.click();
//			break;
		
		selectDate("25");
//		By calender=By.cssSelector("table.ui-datepicker-calendar a");
		}
		
		public static void selectDate(String Day) {//generic method for selection of date
			driver.findElement(By.xpath("//a[text()='"+Day+"']")).click();
			
		}
		
//		public static void selectDate(String Day, By locator) {
//			List<WebElement> dateList=driver.findElements(locator);
//		System.out.println(dateList.size());
//		
//			for(WebElement e: dateList) {
//			String date=	e.getText();
//			if(date.equals(Day)) {
//				e.click();
//				break;
//		
		
		
		
		
		
		
		
		
		
		
	}


