package ReadExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://laptop-09a9gfbf/login.do");  
    
    //read the data from excel file and test the login page
       Flib flib = new Flib();
   //to read multiple data use for loop
       for(int i=1;i<=8;i++)
       {

   	 
   	    String InvaliduserName = flib.readExcelData("./data/actiTime.xlsx","invalidcreadential",i,0);
   	    String InvalidPassword= flib.readExcelData("./data/actiTime.xlsx","invalidcreadential",i,1);
   	    
   	    driver.findElement(By.name("username")).sendKeys(InvaliduserName);
   	    driver.findElement(By.name("pwd")).sendKeys(InvalidPassword);
   	    driver.findElement(By.id("loginButton")).click();
   	     Thread.sleep(2000);
   	     
   	     driver.findElement(By.name("username")).clear();

        //instead of storing value in variable u can pass as sendkeys
 	   // driver.findElement(By.name("username")).sendKeys(flib. readExcelData("./data/actiTime.xlsx","invalidcredential",i,0));
 	   //driver.findElement(By.name("pwd")).sendKeys(flib. readExcelData("./data/actiTime.xlsx","invalidcredential",i,1);
 	    
   	    
   	    
   	    
       }



}
}
