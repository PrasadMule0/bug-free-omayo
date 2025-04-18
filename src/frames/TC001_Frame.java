package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_Frame {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement iframe2 = driver.findElement(By.id("iframe2"));
		
		//Move to the frame2
		driver.switchTo().frame(iframe2);
		
		driver.findElement(By.linkText("Selenium IDE")).click();
		
		//Move to default webpage(Main page)
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("ta1")).sendKeys("Hello world");

	}

}
