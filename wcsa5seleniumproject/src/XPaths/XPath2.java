package XPaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shivani");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("7066204848");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[text()='Log in']")).click();
		 
		 
		 
		 
		 
	
	
	}

}
