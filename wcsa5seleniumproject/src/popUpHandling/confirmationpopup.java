package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationpopup {
          public static void main(String[] args) throws InterruptedException {
	       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("file:///C:/Users/Shinu/Desktop/WCSA5/Selenium%20Data/Web%20Element/confirmationpopup.html");
	       driver.findElement(By.tagName("input")).click();
	        Alert al=driver.switchTo().alert();
	        Thread.sleep(2000);
	// al.accept(); //for accept the alert popup
	 //al.dismiss();  //for dismiss the alert popup
	 
	 System.out.println(al.getText());        // return the text of alert popup
          
}
}
