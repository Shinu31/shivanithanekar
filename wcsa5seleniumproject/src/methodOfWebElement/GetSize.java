package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); // To avoid IllegalStateException  ..driver executable file path is not set then we get
    //to set path of executable file ...java package
WebDriver driver = new ChromeDriver(); //launch Browser

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.selenium.dev/");
Dimension newsElement = driver.findElement(By.xpath("//h2[text()='News']")).getSize();
int height = newsElement.getHeight();
int width = newsElement .getWidth();
 System.out.println("height of webelelment:"+ height +"  "+"width of webelelment:" + width );

}
}
