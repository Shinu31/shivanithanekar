package testNGExecution;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	static WebDriver driver;
  @Test
  @Parameters({"browser","url","Vusername","Vpassword"})
  public void chromeMethod(String browserValue, String url,String usn, String pass)
{
	  if(browserValue.equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("http://laptop-09a9gfbf/login.do");
		   driver.findElement(By.name("usn")).sendKeys("manager");
		   driver.findElement(By.name("pass")).sendKeys("manager");
	       driver.findElement(By.id("loginButton")).click();
	       driver.quit();
	  }
	  else if(browserValue.equalsIgnoreCase("Firefox"))
	  {

		  System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
		   driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("http://laptop-09a9gfbf/login.do");
		   driver.findElement(By.name("usn")).sendKeys("manager");
		   driver.findElement(By.name("pass")).sendKeys("manager");
	       driver.findElement(By.id("loginButton")).click();
	       driver.quit(); 
	  }
	  
	  
	  
	  
  }
}
