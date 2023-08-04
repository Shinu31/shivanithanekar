package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); // To avoid IllegalStateException  ..driver executable file path is not set then we get
	    //to set path of executable file ...java package
	       WebDriver driver = new ChromeDriver(); //launch Browser

	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       driver.get("https://www.instagram.com/");
	       WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,\"_acan _acap _acas _aj1-\")]"));
	       loginButton.submit();

	       driver.navigate().to("http://127.0.0.1/login.do;jsessionid=44brdu1s1rpmn");
	       driver.findElement(By.name("username")).sendKeys("admin");
	       driver.findElement(By.name("password")).sendKeys("manager");
	   System.out.println( driver.findElement(By.id("loginButton")));
}
}