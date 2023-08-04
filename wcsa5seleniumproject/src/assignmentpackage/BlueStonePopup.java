package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStonePopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIwq2zweu__wIVVEl9Ch0NqQ4lEAAYASAAEgKyZPD_BwE"); //launch the bluestone web application
	driver.findElement(By.id("denyBtn")).click();   //handle hidden division popup
	WebElement frameElement=driver.findElement(By.xpath("//iframe[]"));
	
			//handle the frame by switch controls to frame...
//	driver.switchTo().frame(5);
//	driver.switchTo().frame("fc_widget");
			driver.switchTo().frame(frameElement);
			
			WebElement chatBox=driver.findElement(By.id("chat-icon"));	
			chatBox.click();
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.elementToBeClickable("//div[@id='chat-icon']"));
		Thread.sleep(2000);
	driver.switchTo().defaultContent();			
	driver.findElement(By.id("chat-fc-name")).sendKeys("Shivani");
	Thread.sleep(2000);
	driver.findElement(By.id("chat-fc-email")).sendKeys("shivani@1825");
	Thread.sleep(2000);
	driver.findElement(By.id("chat-fc-phone")).sendKeys("7070707070");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
	//switch  the controls again back to the main webpage

}
}
