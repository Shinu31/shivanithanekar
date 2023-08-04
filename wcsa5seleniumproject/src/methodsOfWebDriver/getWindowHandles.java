package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 	WebDriver driver=new ChromeDriver();
 	driver.manage().window().maximize();
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	driver.get("http://omayo.blogspot.com/");
 	//get the handle or address of current or parent window
 	String parentHandle = driver.getWindowHandle();
 	 System.out.println("Address of parent window :"+parentHandle);
    //launch the child window	
 	driver.findElement(By.partialLinkText("Open a popup window")).click();
      //get the handle or address of child window only 
 	                                //String childHandle = driver.getWindowHandle();
	                                //System.out.println("Address of child window : "+childHandle);           if u use this it will show same address for child and parent also
	
 	//get the handle or address of child window only 
 	        Set<String> allHandles = driver.getWindowHandles();
 	        //Read address by using looping statement
 	        for(String wh:allHandles) {
 	        	
 	        	System.out.println(wh);
 	        }
	}
}