package test;
import java.io.IOException;
 
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Page.LoginPage;
import generic.Flib;
import generic.BaseTest;
import generic.CustomListener;

@Listeners(CustomListener.class)

public class ValidLoginTestCAse extends BaseTest {
  
	
	@Test
  public void ValidLoginMethod() throws IOException {
	  
		  // to perform login call the methods from LoginPage POM class
		  LoginPage lp = new LoginPage(driver);
		  Flib flib = new Flib();
		  lp.validLoginMethod(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH, "Password"));
	  }
	  
	  
	  
	  @Test(dependsOnMethods = "validloginMethod")
	  public void inValidLoginMethod() throws EncryptedDocumentException, IOException, InterruptedException
	  {
		  LoginPage lp = new LoginPage(driver);
		  Flib flib = new Flib();
		  int rc = flib.getLastRowCount(EXCEL_PATH,INVALIDSHEET_NAME);
		  for(int i=1;i<=rc;i++)
		  {
			  lp.inValidLoginMethod(flib.readExcelData(EXCEL_PATH,INVALIDSHEET_NAME,i,0),flib.readExcelData(EXCEL_PATH, INVALIDSHEET_NAME, i,1));
		  }
	  }
	}
