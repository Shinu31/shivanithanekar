package RobotAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {
     public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	//to generate pop up
     Robot robot = new Robot();
     
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_P);
     
     robot.keyRelease(KeyEvent.VK_CONTROL);
     robot.keyRelease(KeyEvent.VK_P);
     
     Thread.sleep(2000);
     //shift the control to cancel button
     robot.keyPress(KeyEvent.VK_TAB);
     robot.keyRelease(KeyEvent.VK_TAB);
     
     //hit the enter button
     
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     driver.quit();
     
     
     
     
	
}
}
