package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch web application
		driver.get("file:///C:/Users/Shinu/Desktop/WCSA5/Selenium%20Data/Web%20Element/Disabled.html");
         //identify Webelement
		driver.findElement(By.id("i1")).sendKeys("Admin");
		
         Thread.sleep(2000);

		//to handle disabled webelement
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("alert('Hello There !!')");
		Thread.sleep(2000);
	    //to handle disable Webelement
		jse.executeScript("document.getElementById('i2').value='manager'" );
	
	}
}