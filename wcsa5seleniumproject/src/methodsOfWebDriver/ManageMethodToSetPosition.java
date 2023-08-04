package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetPosition {

	public static void main(String[] args) {
		//to AutoGenarate
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  Point point = new Point(400,500);
		 driver.manage().window().setPosition(point);
		 
		
	}
}
