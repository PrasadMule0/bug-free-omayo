package autoSuggestiveDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC001_dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='From']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		//Handling dates
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		WebElement months = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));
		

		while(!months.getText().contains("November"))
		{
			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
		}
		
		driver.findElement(By.cssSelector("div[aria-label='Sat Nov 15 2025'] p:nth-child(1)")).click();

		
	}

}
