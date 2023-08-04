package testNGAnnotationFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3InvocationCount {
  @Test(invocationCount=1000)
  public void method1() {
	  Reporter.log("Method1",true);
  }
}
