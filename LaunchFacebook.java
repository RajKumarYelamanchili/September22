package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchFacebook {

	 @Test
	 public void TC001_verifyFacebook() throws InterruptedException
	 {
	
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserAugust630\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("email")).sendKeys("Rohit Sharma");   //By id
		driver.findElement(By.name("emai")).sendKeys("Sachin Tendulkar");//By name
		//driver.findElement(By.linkText("Create a Page")).click();//By linkText
	/*	driver.findElement(By.partialLinkText("reate a Pag")).click();//By partial LinkText
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shah Rukh");//By xpath*/
		
		
	 }
	 /*
	@Test
	public void TC002_verifyNumberOfLinks() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserAugust630\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.rediff.com");
		Thread.sleep(2000);
		
		
		
	}
*/
	
}
