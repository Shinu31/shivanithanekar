package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
	@Test
	  public void testMethod3() {
	  
		  long testid3 = Thread.currentThread().getId();
		  Reporter.log("Thread id of Execution :" +testid3 ,true);
	  }
	  @Test
	  public void testMethod4() {
	  
		  long testid4 = Thread.currentThread().getId();
		  Reporter.log("Thread id of Execution :" +testid4 ,true);
	  }
	  
}