package apiCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004_basic {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("input-email")).sendKeys("prasad.sele@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Password");
		driver.findElement(By.xpath("//*[@value='Login']")).submit();
		
		driver.quit();

	}

}
