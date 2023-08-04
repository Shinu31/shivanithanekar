package assignmentpackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
   public static void main(String[] args) throws InterruptedException {

	   
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.amazon.in/");
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("AllenSolly Shirt for men");
	   driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	   JavascriptExecutor jse =(JavascriptExecutor)driver;
	     Thread.sleep(3000);
	     jse.executeScript("window.scrollBy(0,1000)");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//img[@data-image-index='10']")).click();
	 	String parentHandle = driver.getWindowHandle();
	 	//get the address or handle of parent and child window
	  	Set<String> allhandles = driver.getWindowHandles();
	   //how to close only child browser
	     
}
}
