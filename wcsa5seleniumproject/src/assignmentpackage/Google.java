package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		
		
		WebElement frameElement=driver.findElement(By.xpath("//iframe[]"));
		
		driver.switchTo().frame(frameElement);
		
		WebElement maps = driver.findElement(By.xpath("//span[@class='MrEfLc' and (@style='background-position: 0 -348px;')]"));
				maps.click();
}
}