package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestData {
public static void main(String[] args) throws InterruptedException,  IOException {
	System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 driver.get("http://127.0.0.1/login.do;jsessionid=1anbi8ffcn9dn");
 //read the data from excel file and test the login page
Flib flib=new Flib();
//to read multiple data use for loop
		int rc = flib.getLastRowCount("./data/actiTime.xlsx","invalidcreadential");
		for(int i=1;i<=rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/actiTime.xlsx","invalidcreadential", i, 0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/actiTime.xlsx","invalidcreadential",i,1));
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
}}

