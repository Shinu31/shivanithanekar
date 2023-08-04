package testNGAnnotationFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag2 {
   	@Test(enabled=true)                      //default value of enable is true 
	  public void method1() {
	Reporter.log("Method1 from flag2 ", true);
   }
	@Test(enabled=false)                              //it will disable the method
	  public void method2() {
	Reporter.log("Method2 from flag2 ", true);
 }
}
