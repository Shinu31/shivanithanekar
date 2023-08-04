package XPaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();	
	 driver.manage().window().maximize();
	 driver.get("https://www.starbucks.com/account/signin?ReturnUrl=%2F");
	 driver.findElement(By.xpath("//input[@class='fieldInput text-sm'and @name='username']")).sendKeys("Shivani");
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[@id='password'and @class='fieldInput text-sm']")).sendKeys("7304511515");
	 
}
}
