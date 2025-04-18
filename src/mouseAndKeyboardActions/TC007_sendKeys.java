package mouseAndKeyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC007_sendKeys {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("userid")).sendKeys("Arun");
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.TAB).perform();
		driver.findElement(By.name("pswrd")).sendKeys("Password");
		a.sendKeys(Keys.TAB).perform();
		a.sendKeys(Keys.ENTER).perform();

	}

}
