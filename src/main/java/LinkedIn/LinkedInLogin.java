package LinkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import coreClasses.BasePage;

public class LinkedInLogin extends BasePage {

	public LinkedInLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void DoLoginToLinkedIn() {

		click(By.xpath("//a[@class='nav__button-secondary']"));
		SendKeys(By.id("username"), "kulsum.begumqa@gmail.com");
		SendKeys(By.id("password"), "");
		click(By.xpath("//button[@class='btn__primary--large from__button--floating']"));
	}

	public boolean verifyImAbleToLogin() {
		System.out.println(GetTitleOfCurrentPage());
		if (GetTitleOfCurrentPage().contains("linkedin")) {

			return true;

		}

		return false;
	}
}
