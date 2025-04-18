package waitingMechanism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_Thread_Sleep {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("dropbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Facebook")).click();
		
		driver.quit();
	}

}
