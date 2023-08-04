package generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant {
	

public static WebDriver driver;
@BeforeMethod
public void setUp() throws IOException {
	Flib flib=new Flib();
	String browservalue = flib.readPropertyData(PROP_PATH, "Browser");
	String url=flib.readPropertyData(PROP_PATH, "Url");
	
	
	if(browservalue.equalsIgnoreCase("chrome"))
	{
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
	}
	else if(browservalue.equalsIgnoreCase("gecko"))

	{
		System.setProperty(GECKO_KEY,GECKO_PATH);
		driver=new FirefoxDriver();
		
	}

	else if(browservalue.equalsIgnoreCase("edge"))

	{
		System.setProperty(EDGE_KEY, EDGE_PATH);
		driver=new EdgeDriver();
	}
	else {
		Reporter.log("", false);
	}
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(url);
	
}
  public void failedMethod(String failedMethod)	{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
    File dest=new File("./screenshot"+failedMethod+".png");
    try {
    	Files.copy(src, dest);
      }
	
	catch(Exception e)
    {
		
    }
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}

}
