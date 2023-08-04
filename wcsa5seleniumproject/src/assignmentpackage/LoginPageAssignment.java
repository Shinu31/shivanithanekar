package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromdriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.netflix.com/in/login");
	    Thread.sleep(2000);
	    //to identify webElement we use locator
	    
	    driver.findElement(By.id("id_userLoginId")).sendKeys("shivanithanekar25@gmail.com");//Username textBox
	    Thread.sleep(2000);
	    driver.findElement(By.id("id_password")).sendKeys("sdfghtyjukjhtr");
	    Thread.sleep(2000);
	   // driver.findElement(By.className("//button[@class='btn login-button btn-submit btn-small']")).click();
	    //Thread.sleep(2000);
	    
	    //By cssselector
	 driver.findElement(By.cssSelector("button[class=\"btn login-button btn-submit btn-small\"]")).click();
	
	}

}
