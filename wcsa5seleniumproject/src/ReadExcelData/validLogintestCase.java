package ReadExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class validLogintestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://laptop-09a9gfbf/login.do");  
	    
	    //read the data from excel  file and test login page
	    
	    Flib flib = new Flib();
	    String validuserName = flib. readExcelData("./data/actiTime.xlsx","validcredential",1,0);
	    String validPassword= flib. readExcelData("./data/actiTime.xlsx","validcredential",1,1);
	    
	    driver.findElement(By.name("username")).sendKeys(validuserName);
	    driver.findElement(By.name("pwd")).sendKeys(validPassword);
	    driver.findElement(By.id("loginButton")).click();
	    
        //instead of storing value in variable u can pass as sendkeys
	   // driver.findElement(By.name("username")).sendKeys(flib. readExcelData("./data/actiTime.xlsx","validcredential",1,0));
	   //driver.findElement(By.name("pwd")).sendKeys(flib. readExcelData("./data/actiTime.xlsx","validcredential",1,1);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
