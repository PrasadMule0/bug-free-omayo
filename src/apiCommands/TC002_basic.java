package apiCommands;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_basic {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		/*String Title = driver.getTitle();
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		driver.findElement(By.linkText("onlytestingblog")).click();
		Thread.sleep(3000);
		
		
		String url2 = driver.getCurrentUrl();
		System.out.println(url2); */
		
		driver.close();

	}

}
