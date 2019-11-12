package coreClasses;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	protected static WebDriver driver;

	@BeforeTest
	public void openBrowser() {

		PropertyConfigurator.configure("log4j.properties");

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		// open Chrome Browser
		driver = new ChromeDriver();

		// maximize
		driver.manage().window().maximize();

		OpenWebsiteURL();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void OpenWebsiteURL() {
		// driver.get("https://test.textingpro.com");
		 driver.get("http://www.way2automation.com ");
		// driver.get("https://www.facebook.com");
		//driver.get("https://en-gb.facebook.com/login/");
		//driver.get("https://www.linkedin.com");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
