package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  
		  driver.get("https://www.instagram.com/");
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.cssSelector("input[name*='er']")).sendKeys("shinu__31");
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("input[name*='ss']")).sendKeys("Tumhe q batau");
		  
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("button[class*='_acan _acap _acas _aj1-']")).click();
		  
	}

}
