package testNGAnnotationFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleFlags {
  @Test(description = "Login Method" ,enabled=true)
  public void method1() {
	  Reporter.log("Method1 from flag2",true);
  }
  @Test(description = "Logout Method" ,enabled=true)
  public void method2() {
	  Reporter.log("Method2 from flag2",true);
  }
}
