package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
       public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/"); // enter url of website which u want 2
		 String pageSource = driver.getPageSource(); //To get title of page
		System.out.println(pageSource);
	}
	}


