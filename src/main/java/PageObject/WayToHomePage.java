package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import coreClasses.BasePage;

public class WayToHomePage extends BasePage {

	String window;

	public WayToHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnBuyNow() {
		window = GetCurrentWindowID();

		click(By.xpath(
				"//div[@class='btn-group margin_top_53']//a[@class='btn btn-danger'][contains(text(),'BUY NOW')] "));
//*[@id="wrapper"]/header/div[2]/div/div[2]/div/a[2]

	}

	public boolean verifyURLofHomePage() {
		switchToParentWindow(window);
		System.out.println(GetUrlOfCurrentPage());

		if (GetUrlOfCurrentPage().contains("automation")) {

			return true;

		}

		return false;
	}

}