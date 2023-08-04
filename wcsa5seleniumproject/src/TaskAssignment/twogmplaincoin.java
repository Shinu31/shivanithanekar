package TaskAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class twogmplaincoin {public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIwq2zweu__wIVVEl9Ch0NqQ4lEAAYASAAEgKyZPD_BwE"); //launch the bluestone web application
	driver.findElement(By.id("denyBtn")).click();   //handle popup
	WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
	Actions act = new Actions(driver);
	act.moveToElement(target).perform();
	driver.findElement(By.xpath("//span[text()='2 gram' and @data-p='gold-coins-weight-2gms,m']")).click();
	WebElement coin = driver.findElement(By.id("5920"));
		
		if(coin.isDisplayed())
		{
			Thread.sleep(4000);
			driver.quit();
			}
		
		else
		{
			System.out.println("Exception!");
		}


}
}
