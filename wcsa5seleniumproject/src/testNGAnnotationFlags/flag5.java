package testNGAnnotationFlags;

import org.testng.annotations.Test;

public class flag5 {
  @Test()
  public void loginMethod() {
	  System.out.println("It is use to Login!!!");
  }
  @Test(dependsOnMethods="loginMethod")
  public void creteUserMethod() {
	  System.out.println("It is use to Create Method");
  }
  @Test(dependsOnMethods="loginMethod")
  public void logoutMethod() {
	  System.out.println("Is is use to Logout!!");
  }
}
