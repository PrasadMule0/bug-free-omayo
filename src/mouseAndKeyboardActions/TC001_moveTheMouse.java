package mouseAndKeyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC001_moveTheMouse {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@id='blogsmenu']"))).perform();
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Selenium143']"))).perform();
		a.click().perform();

	}

}
