package TestNGSessions;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	//SoftAssert softAssert;---------------------------
	
	//Before --BS-BT-BC-BM
	//Test --@Test
	//After --AM -AC-AT-AS
	
	/**
	 * BM
	 * BT
	 * BC
	 * 
	 * BM
	 * T1
	 * AM
	 * 
	 * BM
	 * T2
	 * AM
	 * 
	 * AC
	 * AT
	 * AS
	 */
	
	
	
	WebDriver driver;
	
By username = By.id("username");
By password = By.id("password");
By login = By.id("loginBtn");
By signup =By.linkText("Sign up");
By homePageheader = By.className("private-page--title");
//softAsert = new SoftAssert();-----------------------------------

@BeforeSuite
public void beforeSuite() {
	System.out.println( "before suite prepare the test data");
}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println( "before test DB connection");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println( "before class-get the value from DB connection");
	}
	
	//@BeforeMethod--browser is run3 times per TCs
	
public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	@Test(priority=1 enabld=false)//meanss dont execute this tc
	public void signupTest() {
Assert.assertTrue(driver.findElement(signup).isDisplayed()); //-------------softAssert
	}
	
	@Test(priority=2)
	public void titleTest() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);//ExplicitWait
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		
		String title=driver.getTitle();
		System.out.println("title is :"+title);
	Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=3)
	public void loginTest() {
		driver.findElement(username).sendKeys("avsaresanket1997@gmail.com");
		driver.findElement(password).sendKeys("sanket@1997");
	driver.findElement(login).click();
	
String homepageval=	driver.findElement(homePageheader).getText();
	Assert.assertEquals(homepageval, "Sales Dashboard");
	}
	           //softAssert.asserall();-----------------------------
	@AfterTest
	//@AfterMethod--browser is ru n3 times per TCs
	public void tearDown() {
		driver.quit();
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class--delt the user");
	}
	

@AfterTest
public void afterTest() {
	System.out.println("after test--disconnect the db");
}	
	
@AfterSuite
public void afterSuite() {
	System.out.println("after suite-delt the test dta");
}	
	
	
	
	
	
	
	
}


