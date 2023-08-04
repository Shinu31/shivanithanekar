package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  
	  // System.out.println("This is Demo TestNG");    message will not print
	  
    // Reporter.log("This is Demo TestNG class");      message will print
	  
	  Reporter.log("This is Demo TestNG class", true);
     
  }
}
