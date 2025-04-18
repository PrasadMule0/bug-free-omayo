package takeScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_screenshot1 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Take screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        // Save to a location
        File destFile = new File("screenshots\\screenshot1.png");
        FileUtils.copyFile(srcFile, destFile);
        
        driver.findElement(By.linkText("theautomatedtester")).click();
        
        // Take screenshot
        TakesScreenshot ts1 = (TakesScreenshot) driver;
        File srcFile1 = ts1.getScreenshotAs(OutputType.FILE);

        // Save to a location
        File destFile1 = new File("screenshots\\screenshot2.png");
        FileUtils.copyFile(srcFile1, destFile1);
        
	}

}
