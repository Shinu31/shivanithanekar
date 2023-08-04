package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatosignup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.zomato.com/india");
		 //to click on signUp link
           Thread.sleep(2000);
		  driver.findElement(By.linkText("Sign up")).click();
		  //To send the input for full name textbox
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-6 bfympp']")).sendKeys("Shivani");
		  
		  Thread.sleep(2000);
		//To send the input for email textbox
		  driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 bbrwhB'] ']")).sendKeys("Shivani");
		  
		  
	}
}
