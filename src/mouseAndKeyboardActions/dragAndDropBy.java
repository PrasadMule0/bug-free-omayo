package mouseAndKeyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropBy {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/page3.html ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement minLabel = driver.findElement(By.xpath("//*[@aria-labelledby='price-min-label']"));
		
		Actions a = new Actions(driver);
		a.dragAndDropBy(minLabel, 100, 0).perform();
		a.dragAndDropBy(minLabel, 50, 0).perform();

	}

}
