package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	@Test(invocationCount= 10)//when tcs excetue  10 time
	public void createuser() {
		System.out.println("create user");
	}
	
	

}
