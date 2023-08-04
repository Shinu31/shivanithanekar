package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNg {
	@Test
	public void verificationMethod() throws InterruptedException {
	  
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver(); 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("http://laptop-09a9gfbf/login.do");
	 
	 //Critical Feature
	 String activeTitle = driver.getTitle();
//	 if(driver.getTitle().equalsIgnoreCase(activeTitle)) {
//		 driver.findElement(By.name("username")).sendKeys("admin");
//		 driver.findElement(By.name("pwd")).sendKeys("manager");
//		 driver.findElement(By.id("loginButton")).click();
//		 System.out.println("title is matched ur test case is passed ");
//	}
//	 
//	 else {
//		 System.out.println("title is not matched ur test case is failed ");
//		}
	 
	 
	 //Non critical Feacture
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(driver.getTitle(),activeTitle);
	 driver.findElement(By.name("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.id("loginButton")).click();
	 System.out.println("title is matched ur test case is passed ");
     sa.assertAll();
     
     
     
     //Critical Feature
     if(driver.getTitle().equalsIgnoreCase("bsjytdw"))
     {
    	 System.out.println("Home page title matched test case passed!!!");
     }
     else
     {
    	 System.out.println("Home page title not matched test case failed!!!");	 
     }
     String actualTitleOfHomePage=driver.getTitle();
     Assert.assertEquals(driver.getTitle(), "Shivani");
     Thread.sleep(2000);
     driver.findElement(By.linkText("logout")).click();
    
    } }
