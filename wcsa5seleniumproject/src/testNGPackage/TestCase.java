package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends BaseTest {
  @Test
  public void loginMethod() {
	  SoftAssert sa = new SoftAssert();
	 WebElement usn=driver.findElement(By.name("username"));
	 sa.assertEquals(usn.isDisplayed(),true);
	 usn.sendKeys("admin");
	 WebElement pass = driver.findElement(By.id("pwd"));
	 sa.assertEquals(pass.isDisplayed(),true);
	 pass.sendKeys("manager");
	 driver.findElement(By.id("LoginButton")).click();
    }
@Test(dependsOnMethods="LoginMethod")
public void createUser() {
    SoftAssert sa = new SoftAssert();
	 WebElement usn=driver.findElement(By.name("username"));
	 sa.assertEquals(usn.isDisplayed(),true);
	 usn.sendKeys("admin");
	 WebElement pass = driver.findElement(By.id("pwd"));
	 sa.assertEquals(pass.isDisplayed(),true);
	 pass.sendKeys("manager");
	 driver.findElement(By.id("LoginButton")).click();
            
      }
@Test(dependsOnMethods="createUser")
public void logout()
{
	driver.findElement(By.partialLinkText("log")).click();
}}