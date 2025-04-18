package handlingWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_Reading_the_text_from_the_ChildWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> itr = windowids.iterator();
		String mainWindow = itr.next();
		String childWindow = itr.next();
		
		Thread.sleep(3000);
		driver.switchTo().window(childWindow);
		
		String text = driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.quit(); ;
	}

}
