package handlingWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003_Multiple_Child_Windows {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();
		
		
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> itr = windowids.iterator();
		
		String text = null;
		
		while(itr.hasNext())
		{
			String windowid = itr.next();
			
			driver.switchTo().window(windowid);
			
			if(driver.getTitle().equals("New Window"))
			{
				text = driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
			}
		}
		System.out.println(text);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
