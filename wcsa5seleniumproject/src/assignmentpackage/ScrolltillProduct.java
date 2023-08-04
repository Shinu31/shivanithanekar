package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolltillProduct {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev/");
	//identify the webelement
 WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
	//To perform scrolling operation for a newsElement
  //Location of NewsElement
 Point loc = newsElement.getLocation();
	int xaxis=loc.getX();
	int yaxis=loc.getY();
	Thread.sleep(2000);

	JavascriptExecutor jse=(JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-180)+")");

   //  jse.executeScript("arguments[0].scrollIntoView(false)",newsElement);

}
}
