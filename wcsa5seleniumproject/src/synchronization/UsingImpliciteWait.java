package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImpliciteWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Shivani_86");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1233");
         driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
         
	}

}
