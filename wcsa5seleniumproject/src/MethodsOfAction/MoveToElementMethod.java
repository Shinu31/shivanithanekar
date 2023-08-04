package MethodsOfAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
	
       //use to perform mouseHover action
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIwq2zweu__wIVVEl9Ch0NqQ4lEAAYASAAEgKyZPD_BwE"); //launch the bluestone web application
		
		
		driver.findElement(By.id("denyBtn")).click();   //handle popup
		
		
		//driver.findElement(By.partialLinkText("Watch Jewellery")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.partialLinkText("Watch Jewellery"));
		
		//to perform mouse action on webelement
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("a//[.='Brand']")).click();
 	}		

}
