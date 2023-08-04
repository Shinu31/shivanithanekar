package popUpHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopUp {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//launch the browser
	WebDriver driver = new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//apply implicite wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//launch web application
     driver.get("http://omayo.blogpost.com/");
     Actions act = new Actions(driver);
     WebElement uploadButton = driver.findElement(By.id("uploadfile"));
      act.doubleClick(uploadButton).perform();  
      
      Runtime.getRuntime().exec("./autoITPrograms/OmayoFileUpload.exe");

}
}
