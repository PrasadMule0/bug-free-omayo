package tabel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_allTableData {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']//td"));
		
		for(int i=0; i<tableData.size(); i++)
		{
			System.out.println(tableData.get(i).getText());
		}
		
		driver.quit();
	}

}
