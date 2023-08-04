package assignmentpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class mouseoverandss {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/jewellery.html");
		Thread.sleep(1000);
		
		
		WebElement target = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[text()='Charm']")).click();
		
		 TakesScreenshot ts=(TakesScreenshot)driver;
	     File src = ts.getScreenshotAs(OutputType.FILE);
	     File dest=new File("./ScreenShots/bluestone.png");
		
	Files.copy(src, dest);
		
		
	}
	
	
	
	
}
