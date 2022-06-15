package SeleniumSessions;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver;
	public  Util(WebDriver driver) {
		this.driver=driver;
	}
	/**
	 * this method is used webelement on the basis of  locator
	 * @param locator	
	 * @return
	 */
public WebElement getElement(By locator) {
	WebElement element= driver.findElement(locator);
	return element;
	}

	/**
	 * this method is used to click on element
	 * @param locator
	 */
	
	public void doclick(By locator) {
		try {
		getElement(locator).click();
	}
	catch(Exception e) {
		System.out.println("ssome exception occur while clicking on webelement");
		System.out.println(e.getMessage());
	}
	}
	/**
	 * click the values on webelement(By action util)
	 * @param locator
	 */
		public void doActionClick(By locator) {
			Actions action=new Actions(driver);
			WebElement element=getElement(locator);
			action.click().perform();
		}
	
	/**
	 * this menthod is used to passing the values on webelement
	 * @param locator
	 * @param value
	 */
	
public void doSendKeys(By locator, String value) {
	getElement(locator).sendKeys(value);
}
	/**
	 *  passing the values on webelement(By action util)
	 * @param locator
	 * @param value
	 */
	public void doActionSendKeys(By locator,String value) {
		Actions action=new Actions(driver);
		WebElement element=getElement(locator);
		action.sendKeys(element, value).perform();
	}
	/**
	 * by ExplicitWeight Utilty
	 * @param locator
	 * @param timeout
	 * @return
	 */
	
	public WebElement waitForElementToBePresent(By locator ,int timeout) {
		WebDriverWait wait=new WebDriverWait (driver, timeout);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return getElement(locator);
	}
		/**
		 * caaling titlt by utillity
		 * @param title
		 * @param timeout
		 * @return
		 */
		public String waitForTitleToBePresent(String title ,int timeout) {
			WebDriverWait wait=new WebDriverWait (driver, timeout);
			wait.until(ExpectedConditions.titleContains(title));
			return driver.getTitle();
		}
		/**
		 * by clicable utility
		 * @param locator
		 * @param timeout
		 * @return
		 */
		public WebElement waitForElementToBeClickable(By locator ,int timeout) {
			WebDriverWait wait=new WebDriverWait (driver, timeout);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return getElement(locator);
		}
		/**
		 * by visiblity utity
		 * @param locator
		 * @param timeout
		 * @return
		 */
		public WebElement waitForElementvisibilityOfElementLocated(By locator ,int timeout) {
			WebDriverWait wait=new WebDriverWait (driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return getElement(locator);
		}
		/**
		 * curent url utlity with explicite weight ie url displayed after 2sec then 
		 * @param url
		 * @param timeout
		 * @return
		 */
		
		public String waitForElementurlContains(String url ,int timeout) {
			WebDriverWait wait=new WebDriverWait (driver, timeout);
			wait.until(ExpectedConditions.urlContains(url));
			return driver.getCurrentUrl();
		}

/**
 * click when ready
 * @param locator
 * @param timeout
 */
public void clickWhenReady(By locator ,int timeout) {
	WebDriverWait wait=new WebDriverWait (driver, timeout);
	wait.until(ExpectedConditions.elementToBeClickable(locator));
getElement(locator).click();
}


}



