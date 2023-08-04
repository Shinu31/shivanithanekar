package XPaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.starbucks.com/account/signin?ReturnUrl=%2F");
		 
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Shivani");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("4848");
		  Thread.sleep(2000);
		   
          driver.findElement(By.xpath("//button[@class='sb-frap sb-frap--centerSVG']")).click();
		  
				  
	}

}
