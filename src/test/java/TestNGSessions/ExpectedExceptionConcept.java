package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions = ArithmeticException.class)//accept exception//
	//ArithmeticException-supClass-(excepton)- supClass-(throwable)-
	//(expectedExceptions = {ArithmeticException.class, nullpointerexception.class})---when 2 excptin occure
	public void loginTest() {
		System.out.println("login test -starting");
		int i=9/0;
		System.out.println("login test -endining");
	}
	
	
	
	
	
	
	

}
