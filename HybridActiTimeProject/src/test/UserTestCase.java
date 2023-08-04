package test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListener;
import generic.Flib;
import Page.HomePage;
import Page.LoginPage;
import Page.TasksPage;

@Listeners(CustomListener.class)
public class UserTestCase extends BaseTest {
	@Test
	  public void project_customerMethod() throws IOException {
		  
		  LoginPage lp = new LoginPage(driver);
		  Flib flib = new Flib();
		  lp.validLoginMethod(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH,"Password"));
	      HomePage hp = new HomePage(driver);
	      hp.clickOntaskModule();
	      // we are there in Task page
	      TasksPage ts = new TasksPage(driver);
	      // create the customer.
	      ts.createNewCustomerMethod(flib.readExcelData(EXCEL_PATH,CUST_PROPSHEET_NAME,1,0));
	      // Create the project
	      ts.createNewProjectMethod(flib.readExcelData(EXCEL_PATH,CUST_PROPSHEET_NAME,1,0),flib.readExcelData(EXCEL_PATH,CUST_PROPSHEET_NAME,1,1));
	  
	  }
}
