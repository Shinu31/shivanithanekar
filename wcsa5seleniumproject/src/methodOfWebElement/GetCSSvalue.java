package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSvalue {
	public static void main(String[] args) {
		//it is use to send inputs to text box and active element
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 		WebDriver driver = new ChromeDriver(); //launch Browser
 		
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 		String cssProperty = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("colour");
 		System.out.println(cssProperty);
 		
}}
