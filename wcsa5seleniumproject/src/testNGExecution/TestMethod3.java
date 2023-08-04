package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod3 {
	@Test
	  public void testMethod5() {
	  
		  long testid5 = Thread.currentThread().getId();
		  Reporter.log("Thread id of Execution :" +testid5 ,true);
	  }
	  @Test
	  public void testMethod2() {
	  
		  long testid6 = Thread.currentThread().getId();
		  Reporter.log("Thread id of Execution :" +testid6 ,true);
	  }
}