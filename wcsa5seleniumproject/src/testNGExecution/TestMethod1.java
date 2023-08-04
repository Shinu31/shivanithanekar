package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 {
  @Test
  public void testMethod1() {
  
	  long testid1 = Thread.currentThread().getId();
	  Reporter.log("Thread id of Execution :" +testid1 ,true);
  }
  @Test
  public void testMethod2() {
  
	  long testid2 = Thread.currentThread().getId();
	  Reporter.log("Thread id of Execution :" +testid2 ,true);
  }
  
  
  
  
  }

