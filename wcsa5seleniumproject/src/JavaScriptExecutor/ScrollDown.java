package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//launch the browser
	WebDriver driver = new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//apply implicite wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//launch web application
     driver.get("https://www.selenium.dev/");
     JavascriptExecutor jse =(JavascriptExecutor)driver;
     Thread.sleep(3000);
     //to perform down scroll
     jse.executeScript("window.scrollBy(0,4000)");
     Thread.sleep(3000);
     //to perform up scroll
     jse.executeScript("window.scrollBy(0,-4000)");
}

}
