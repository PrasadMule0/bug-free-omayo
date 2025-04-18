package dropDownsAndMultiselectionBoxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC002_Multiselection {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement multiSelection = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiSelection);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		
		Thread.sleep(3000);
		select.deselectByVisibleText("Audi");

	}

}
