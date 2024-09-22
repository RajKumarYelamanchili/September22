package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownWithoutMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserSeptember\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
		
	WebElement dropDown1=	driver.findElement(By.xpath("//select[@name='country']"));
	
	if (dropDown1.isEnabled() && dropDown1.isDisplayed())
	{
		System.out.println("drop down is Enabled and Displayed");
	}
	else
	{
		System.out.println("drop down is either not Enabled or not Displayed");
	}
	
		
	Select sel = new Select(dropDown1);
	
	if (sel.isMultiple())
	{
		System.out.println("drop down allows multiple selection");
	}
	else
	{
		System.out.println("drop down does not allow multiple selection");
	}
	
	 int numberOfCountries = sel.getOptions().size();
	 System.out.println("Total number of countries: " + numberOfCountries );
	 Thread.sleep(2000);

	 sel.selectByIndex(9);
	 Thread.sleep(2000);
	 
	 sel.selectByVisibleText("India");
	 Thread.sleep(2000);
	 sel.selectByValue("JP");
	 Thread.sleep(2000);
	}

}
