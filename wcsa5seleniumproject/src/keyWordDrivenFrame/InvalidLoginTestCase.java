package keyWordDrivenFrame;

import java.io.IOException;

import org.openqa.selenium.By;

import ReadExcelData.Flib;

public class InvalidLoginTestCase extends BaseTest {
  public static void main(String[] args) throws IOException {
	BaseTest bt= new BaseTest();
	bt.openBrowser();
	
    Flib flib = new Flib();
	int rc = flib.getLastRowCount(EXCEL_PATH,"invalidcreadential");
	for(int i=1;i<=rc;i++)
	{
	    driver.findElement(By.name("username")).sendKeys(flib.readExcelData(CHROME_PATH, CHROME_KEY, i, rc));
   	    driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, CHROME_PATH, i, 1));
   	    driver.findElement(By.id("loginButton")).click();
   	    driver.findElement(By.name("username")).clear();

	}
	
	bt.closeBrowser();
	
	
}
	
	
	
	
}
