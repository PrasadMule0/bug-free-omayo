package apiCommands;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003_basic {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Open a popup window")).click();
		//driver.findElement(By.linkText("Blogger")).click();
		
		//driver.close();
		
		//getAttribute
		//String text = driver.findElement(By.id("textbox1")).getAttribute("value");
		//System.out.println(text);
		
		driver.navigate().to("https://www.selenium.dev/documentation/webdriver/");
		Thread.sleep(2000);
		
		driver.navigate().back();	
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
