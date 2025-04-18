package mouseAndKeyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC008_sendKeys2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("input-email")).sendKeys("prasad.selenium@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();

	}

}
