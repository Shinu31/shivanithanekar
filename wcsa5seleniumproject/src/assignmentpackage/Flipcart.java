package assignmentpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();	
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		 //driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("HP Laptop");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 //Thread.sleep(2000);
	
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 
	     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP Laptop");
		 
	     driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 
	     driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i7']")).click();
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Brand']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 10']")).click();
	     Thread.sleep(2000);

		
		 driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		 Thread.sleep(2000);
	 List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		   List<WebElement> priceOfLaptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		          Thread.sleep(2000);
		          for(int i=0;i<laptops.size();i++)
		   	   {
		   		   String op = laptops.get(i).getText();
		   		   
		   		   for(int j=i;j<=i;j++)
		   		   {
		   			   String ops = priceOfLaptop.get(j).getText();
		   			   System.out.print(op+"  : "+ops);
		   			   Thread.sleep(2000);
		   		   }
		   		   
		   		   System.out.println();
	}

	}}
