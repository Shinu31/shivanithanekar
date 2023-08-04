package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScrollTillshoe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://in.puma.com/in/en/mens/mens-shoes?offset=48&utm_source=GGL-SEA&utm_medium=PS&utm_aud=OTH&utm_obj=OLC&utm_campaign=PS_GGL_IN_PS_GGL_SEA_DSA_Brand_agency_1000067495857508873&gclid=Cj0KCQjw4s-kBhDqARIsAN-ipH01dptKS5JPt8MBH9ERT6jMtGmcck0JM7maAFwHW3gU0csIVThhpa0aAkrmEALw_wcB");
		 
		  WebElement Shoe=driver.findElement(By.xpath("(//img[@title='PUMA x KOCHE Plexus Mid Unisex Sneakers, Feather Gray'])[1]"));
		Point loc = Shoe.getLocation();
		 int xaxis=loc.getX();
		 int yaxis=loc.getY();
		 
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis)+")");

		 
		 
		 
		 
		 
		 
		 
		
		 
	}

}
