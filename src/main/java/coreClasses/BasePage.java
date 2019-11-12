package coreClasses;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;
	public Alert alert;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void SendKeys(By by, String value) {
		getHighlightElement(driver.findElement(by));
		driver.findElement(by).sendKeys(value);
	}

	public void click(By by) {
		getHighlightElement(driver.findElement(by));
		driver.findElement(by).click();
	}

	public Boolean IsDisplay(By by) {
		getHighlightElement(driver.findElement(by));
		return driver.findElement(by).isDisplayed();

	}

	public String GetTitleOfCurrentPage() {

		return driver.getTitle();

	}

	public String GetUrlOfCurrentPage() {

		return driver.getCurrentUrl();

	}

	public void SelectOptionFromDropDown(By by, String option) {
		getHighlightElement(driver.findElement(by));

		WebElement dropdown = driver.findElement(by);

		Select select = new Select(dropdown);

		select.selectByVisibleText(option);

	}

	public String getText(By by) {
		getHighlightElement(driver.findElement(by));
		return driver.findElement(by).getText();

	}

	public void doubleClick(By by) {
		getHighlightElement(driver.findElement(by));
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(by);
		actions.doubleClick(elementLocator).perform();
	}

	public void HitENTER(By by) {
		getHighlightElement(driver.findElement(by));
		driver.findElement(by).sendKeys(Keys.ENTER);

	}

	public void switchTOPopUp() {

		alert = driver.switchTo().alert();

	}

	public String getPopUpText() {
		alert = driver.switchTo().alert();
		// switchTOPopUp();
		String alertText = alert.getText();
		return alertText;

	}

	public void acceptPopUp() {

		alert.accept();
	}

	public void getHighlightElement(final WebElement element) {

		try

		{

			Wait<WebDriver> wait = new WebDriverWait(driver, 10);

			// Wait for search to complete

			wait.until(new ExpectedCondition<Boolean>()

			{

				public Boolean apply(WebDriver webdriver)

				{

					return element != null;

				}
			});

			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='2px solid red'", element);

		}

		catch (Exception e) {

			// logger.info ("Fail to highlight the element");

		}

//		public String  getPopUpAlertText() {
//			
//			alert =driver.switchTo().alert();
//			String alertTest=alert.getText();
//			return alertTest;		
//		}
//		public void  AcceptingPopUpsAlert() throws InterruptedException {
//			
//			Thread.sleep(2000);
//			alert.accept();
//					
	}

	public void SwitchToNewWindows() {

		Set<String> allWindows = driver.getWindowHandles();
		//System.out.println(allWindows);

		for (String window : allWindows) {
			driver.switchTo().window(window);
		}

	}

	public void switchToParentWindow(String window) {

		// driver.switchTo().window(GetCurrentWindowID());
		driver.switchTo().window(window);
	}

	public String GetCurrentWindowID() {

		String currentwindow = driver.getWindowHandle();
		System.out.println(currentwindow);
		return currentwindow;

	}

}
