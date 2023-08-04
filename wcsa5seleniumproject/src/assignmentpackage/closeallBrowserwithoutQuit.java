package assignmentpackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeallBrowserwithoutQuit {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 	driver.get("http://omayo.blogspot.com/");
		
	 	 WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
	     Point elementLoc=childWindow.getLocation();
	     int xaxis=elementLoc.getX();
	     int yaxis=elementLoc.getY();
	     
	     //scrolltill open a pop up window link
	     JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
	 	 
	 	 //click on link to popen child browser
	   childWindow.click();
	   //close the all browser without quit
	   Thread.sleep(2000);
	   //driver.quit();
	   
	   
	   //get the hanlde or address of parent aND CHILD window
	   Set<String>allHandles=driver.getWindowHandles();
	   for(String wh:allHandles) {
        	
        	System.out.println(wh);
        }
}
	   
	   

}
