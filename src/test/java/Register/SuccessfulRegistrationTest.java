package Register;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.MenuPage;
import PageObject.RegistrationPage;
import coreClasses.BaseTest;

public class SuccessfulRegistrationTest extends BaseTest {

	@Test
	public void VerifyRegistration() throws InterruptedException {
    //object of page object 
		MenuPage menupage = new MenuPage(BaseTest.driver);

		menupage.ClickOnMenu("Register");

		RegistrationPage registrationpage = new RegistrationPage(BaseTest.driver);
		Assert.assertTrue(registrationpage.VerifyTitleAndUrl(), "Registration Title  is not showing ");
		registrationpage.FillPersonalInfo();

		registrationpage.FillPersonalContactdetails();

		registrationpage.FillPassWordFields();

		registrationpage.SelectAllDropDown();

		registrationpage.ClickOnTermsAndCondition();

		registrationpage.ClickOnRegistrationButton();

	}

}

//1. Open Google Chrome
//2. Open Test.Textingpro website.
//3.Click on Register menu
//4.Verify user is on register page.
//5.Fill personal info fields.
//6.Fill personal contact details fields
//7.Fill passwords fields
//8.Select all dropdown
//9.Click on termandconditioncheckbox
//10.Click on register button
//11.User should be able to register successfully.
