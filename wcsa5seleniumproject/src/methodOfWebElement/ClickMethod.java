package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
public static void main(String[] args) {
	
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 		WebDriver driver = new ChromeDriver(); //launch Browser
 		
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		driver.get("file:///C:/Users/Shinu/Desktop/WCSA5/Selenium%20Data/Web%20Element/Dropdown.html");
 		
 	     WebElement dropdown = driver.findElement(By.id("menu"));
 	    dropdown.click();
 	     
 	    // driver.findElement(By.id("menu")).click();
 		
}
}
