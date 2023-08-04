package testNGAnnotationFlags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest{
  @Test(description="Test Case 1")
  public void search1() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	  Thread.sleep(2000);
  }
  @Test(description="Test Case 2")
  public void search2() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	  Thread.sleep(2000);
  }
  @Test(description="Test Case 3")
  public void search3() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
	  Thread.sleep(2000);
  }
}
