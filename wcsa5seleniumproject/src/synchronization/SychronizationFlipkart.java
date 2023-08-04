package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SychronizationFlipkart {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		
			driver.findElement(By.xpath("//span[text()='Cart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			
			
	}

}
