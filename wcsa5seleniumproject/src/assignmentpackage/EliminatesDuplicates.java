package assignmentpackage;

import java.time.Duration;
import java.util.List;
import java.util.HashSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatesDuplicates {
      //By using Hashset
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
         driver.get("file:///C:/Users/Shinu/Desktop/WCSA5/Selenium%20Data/Web%20Element/MultiselectDd.html");
         //identify dropdown
         WebElement dropDownElement = driver.findElement(By.id("menu"));
         
         //handle dropdown
         
       Select sel = new Select(dropDownElement);
         
       HashSet<String> hs = new HashSet<String>();

         
         //To get option from dropdown
         List<WebElement> allOpts = sel.getOptions();
          //to read options from dropdown
         for(int i=0;i<allOpts.size();i++)
         {
        	 WebElement op=allOpts.get(i);
        	 
        	 //get Text of webelement and add into sel
        	 String value=op.getText();
        	 //add the value into ste that means duplicate will not be allowed
        	 // insertion order is 
        	 
        	 hs.add(value);
 			
 		}
 		
 		// Read the value from set
 		for(String element:hs)
 		{
 			Thread.sleep(2000);
 			System.out.println(element);
 		}
 		

 	}

 }