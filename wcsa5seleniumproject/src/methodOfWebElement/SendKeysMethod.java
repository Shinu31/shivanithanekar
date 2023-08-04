package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) {
		//it is use to send inputs to text box and active element
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 		WebDriver driver = new ChromeDriver(); //launch Browser
 		
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 		
 		//identify Webelement n use methods of webelement 
 		//driver.findElement(By.name("username")).sendKeys(); //method chaining
	   	WebElement unsTB = driver.findElement(By.name("username"));
	    unsTB.sendKeys("Admin");  	
	}

}
