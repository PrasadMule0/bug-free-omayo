package apiCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_basic {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.id("confirm")).click();
		// driver.findElement(By.name("q")).sendKeys("Prasad");
		// driver.findElement(By.className("gsc-search-button")).click();
		// driver.findElement(By.id("textbox1")).clear();
		
		//WebElement element = driver.findElement(By.partialLinkText("onlytesting"));
		//Thread.sleep(5000);
		//element.click();
		
		// driver.findElement(By.cssSelector("#alert1")).click();
		//driver.findElement(By.xpath("//input[@id='alert1']")).click();
		
		String text = driver.findElement(By.id("pah")).getText();
		System.out.println(text);
		
		

	}

}
