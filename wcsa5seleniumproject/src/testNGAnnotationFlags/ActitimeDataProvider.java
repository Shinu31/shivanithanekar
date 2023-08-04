package testNGAnnotationFlags;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class ActitimeDataProvider {
@Test(dataProvider="actiTimeData")
public void invalidLoginMethod(String usn,String pass) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://laptop-09a9gfbf/login.do");
 
	 driver.findElement(By.name("username")).sendKeys(usn);
     driver.findElement(By.name("pwd")).sendKeys(pass);
	 driver.findElement(By.id("loginButton")).click();
    driver.findElement(By.name("username")).clear();
}


  @DataProvider(name="actiTimeData")
  public Object[][] testData() {
	  Object[][] testData1=new Object[5][2];
    testData1[0][0]="ad-min";
    testData1[0][1]="mana_ger";

    testData1[1][0]="manager";
    testData1[1][1]="admin";
    		
    testData1[2][0]="@admin";
    testData1[2][1]="@manager";
    
    testData1[3][0]="ADMIN@123";
    testData1[3][1]="MANAGER@123";
    
    testData1[4][0]="ad--min";
    testData1[4][1]="mana--ger";
	return testData1;
    		
    
  }
}
