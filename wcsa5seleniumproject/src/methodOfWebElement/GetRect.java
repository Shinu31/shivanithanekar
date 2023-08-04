package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); // To avoid IllegalStateException  ..driver executable file path is not set then we get
	    //to set path of executable file ...java package
	WebDriver driver = new ChromeDriver(); //launch Browser

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.selenium.dev/");
	Rectangle newselement = driver.findElement(By.xpath("//h2[text()='News']")).getRect();
	int xaxis = newselement.getX();
	int yaxis = newselement.getY();
	
	int height = newselement.getX();
	int width= newselement.getX();
	System.out.println(xaxis+" "+" "+ yaxis+" "+height+" "+width);
}

}
