package methodsOfWebDriver;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
public static void main(String[] args) throws InterruptedException, IOException {
	

		
		// use to perform DoubleClick..
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     	WebDriver driver=new ChromeDriver();
	     	driver.manage().window().maximize();
	     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     	driver.get("http://omayo.blogspot.com/");
	     	//get the handle or address of current or parent window
	     	String parentHandle = driver.getWindowHandle();
	         System.out.println(parentHandle);
	     	
}
}