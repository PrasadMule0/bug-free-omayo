package tabel;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC001_allHeadings {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table = driver.findElement(By.id("table1"));
		List<WebElement> headings = driver.findElements(By.xpath("//table[@id='table1']//th"));
		
		for(int i=0; i<headings.size(); i++)
		{
			System.out.println(headings.get(i).getText());
		}

		driver.quit();
	}

}
