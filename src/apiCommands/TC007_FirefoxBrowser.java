package apiCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC007_FirefoxBrowser {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver", "E:\\Selenium Java\\SeleniumWebDriver2\\browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

	}

}
