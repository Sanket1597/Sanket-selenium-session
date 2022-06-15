package TestNGSessions;

import org.testng.annotations.Test;

public class DependOnMethod {
	//home & sesrch is depend upon login
	@Test(priority=1)
	public void loginTest() {
		System.out.println("login test--");
		int i= 9/0;
	}
	
	@Test(priority=2, dependsOnMethods= "loginTest")
	public void homepageTestTest() {
		System.out.println("home page test--");
		int i= 9/0;
	}

	@Test(priority=3, dependsOnMethods= "loginTest")
	public void SearchTest() {
		System.out.println("Search test--");
		int i= 9/0;
	}
}
