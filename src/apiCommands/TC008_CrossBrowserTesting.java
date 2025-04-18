package apiCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TC008_CrossBrowserTesting 
{

	public static void main(String[] args) 
	{
		String browser = "chrome";
		WebDriver driver;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver();
		}
		else 
		{
			driver = new EdgeDriver();
		}
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("The count of the a tags are: "+list.size());
		
		for(WebElement i : list )
		{
			if(i.getText().length()>0)
			{
				System.out.println(i.getText());
			}
			
		}
		
		driver.quit();
		
	}

}
