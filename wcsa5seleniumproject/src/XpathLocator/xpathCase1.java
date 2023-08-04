package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCase1 {
	
	// By using unique attribute and text()function.
	
	//twitter
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://twitter.com/i/flow/login");
	
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='text']")).sendKeys("shivani@gmail.com");
	 
	 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	
	//navigate to hotstar
	driver.navigate().to("https://joinindianarmy.nic.in/Authentication.aspx");
	

}
}
