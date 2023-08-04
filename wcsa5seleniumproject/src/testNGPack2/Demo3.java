package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	 @Test
	  public void method5() {
		  Reporter.log("This is the method5", true);
	  }
	  @Test
	  public void method6() {
		  Reporter.log("This is the method6", true);
	  }
}
