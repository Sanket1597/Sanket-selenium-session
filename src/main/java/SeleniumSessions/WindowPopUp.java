package SeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	//	Thread.sleep(8000);
		//https://open.source-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
	driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[3]/img")).click();
	
	Set <String>handles= driver.getWindowHandles();
//		Iterator<String> it=handles.iterator();
//		
//		String parentwindowID= it.next();
//		System.out.println("parentwindoID" + parentwindowID );
//		
//		String childwindowID= it.next();
//		System.out.println("childwindowId"+ childwindowID);
//		
//		driver.switchTo().window(childwindowID);// switch to childwindow
//		System.out.println("childwindow title is"+ driver.getTitle());
//		
//		driver.close();// close  child window popup
//		driver.switchTo().window(parentwindowID);//switch to parent window
//		
//		System.out.println("parenttile is" + driver.getTitle());
//		
//		
 
	}
	
	//from removing line 22to 29 alternate method is
	List<String> handleList= new ArrayList<String>(handles);
	
	String ParentID=   handleList.get(0);
	String ChildID=	handleList.get(0);
	
	

}
