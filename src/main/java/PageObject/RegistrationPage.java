package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import coreClasses.BasePage;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);

	}

	public boolean VerifyTitleAndUrl() {

		String Title = GetTitleOfCurrentPage();
		if (Title.contains("Register")) {
			return true;
		}
		return false;

	}

	public void FillPersonalInfo() {
		SendKeys(By.id("companyName"), " abc business");
		SendKeys(By.id("firstName"), " kulsum");
		SendKeys(By.id("lastName"), "lastname ");

	}

	public void FillPersonalContactdetails() {

		SendKeys(By.id("mobile"), "9173339999");
		SendKeys(By.id("EmailAddree"), "kulsumQA@gmail.com");
	}

	public void FillPassWordFields() {
		
		SendKeys(By.id("password"),"123456");
	     SendKeys(By.id("ConfirmPassword"), "123456");
	}

	public void SelectAllDropDown() {
		// TODO Auto-generated method stub
		//SelectOptionFromDropdown(By.name("country","tonga");
		SelectOptionFromDropDown(By.name("country"), "Tonga");
		SelectOptionFromDropDown(By.name("hearabout"), "Friend");
		SelectOptionFromDropDown(By.name("plan"), "Pay as you go");
		SelectOptionFromDropDown(By.name("paymenttype"), "Credit card");
	}

	public void ClickOnTermsAndCondition() {
	click(By.id("TermsAndConditions"));
		
	}

	public void ClickOnRegistrationButton() {
		// TODO Auto-generated method stub
		click(By.id("button"));
	}

}
