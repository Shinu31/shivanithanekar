package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); // To avoid IllegalStateException  ..driver executable file path is not set then we get
	    //to set path of executable file ...java package
	WebDriver driver = new ChromeDriver(); //launch Browser

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://127.0.0.1/login.do;jsessionid=44brdu1s1rpmn");
	System.out.println(driver.findElement(By.id("loginButton")).getTagName());
}
}
