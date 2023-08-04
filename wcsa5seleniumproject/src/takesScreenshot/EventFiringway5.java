package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class EventFiringway5 {
	//By using EventFiringDriver
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/downloads/");
	EventFiringWebDriver efw = new EventFiringWebDriver(driver);             //(EventFiringWedDiver class or methods are deprecated)
	File src = efw.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShots/Eventfiringway5.jpg");
	Files.copy(src, dest);
		
	}

}
