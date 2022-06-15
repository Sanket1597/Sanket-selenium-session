package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {

	/**
	 * this method is used to select value from dropdown on the basis of given text
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropdowwn(WebElement element , String value){
	
	Select select =new Select(element);
	select.selectByVisibleText(value);
	
	}
	/**
	 * this method is used to select value from dropdown on the basis of given index
	 * @param element
	 * @param index
	 */
	public static void selectValueFromDropdowwnBtIndex(WebElement element , int index){
	Select select =new Select(element);
	select.selectByIndex(index);
	}
	
	/**
	 * this metod is used get all the values from dropdown
	 * @param element
	 */
	public static void getDropDownValues(WebElement element) {
		System.out.println("------------------------");
		Select select =new Select(element);
		
		List<WebElement> droplist=	select.getOptions();
		System.out.println("total no of dropdown values: "+droplist.size());
		
		for(int i=0; i< droplist.size(); i++) {
		String  text=	droplist.get(i).getText();
			System.out.println(text);
		}
	
//		/**
//		 * this metod is used get all the values from arralist
//		 * @param element
//		 */
//		public static ArrayList<Sring> getDropDownValues(WebElement element) {
//			System.out.println("------------------------");
//			Select select =new Select(element);
//			
//			List<WebElement> droplist=	select.getOptions();
//			System.out.println("total no of dropdown values: "+droplist.size());
//			ArrayList<String> ar = new ArrayList<String>();
		
//			for(int i=0; i< droplist.size(); i++) {
//			String  text=	droplist.get(i).getText();
//ar.add(text);
//			}
	//	return ar
	
	}
}
