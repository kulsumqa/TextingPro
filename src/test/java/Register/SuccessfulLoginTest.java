package Register;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.RenewPage;
import PageObject.LoginPage;
import PageObject.MenuPage;
import coreClasses.BaseTest;

public class SuccessfulLoginTest extends BaseTest {

	@Test
	public void VerifyLoginpage() throws InterruptedException {

		MenuPage menupage = new MenuPage(BaseTest.driver);

		menupage.ClickOnMenu("Log In");

		LoginPage loginpage = new LoginPage(BaseTest.driver);
		// Assert.assertTrue(loginpage.VerifyUserUserIsInRenewPage(),"Successfully lands
		// on Renew page");
		loginpage.doLogin();

		RenewPage dashboardpage = new RenewPage(BaseTest.driver);
		if (dashboardpage.verifyUserOnRenewPage()) {
			System.out.println("Test case pass");

		} else {
			System.out.println("test case failed ");

			Assert.assertTrue(false, "Test Case failed because user did't redirect to Renew Page");

		}

		Thread.sleep(4000);

		// loginpage.doubleClickOnUserNsame();
		loginpage.ClickOnUserName();
		loginpage.ClickOnUserName();
		Thread.sleep(2000);

		loginpage.ClickOnSignOut();

		Thread.sleep(1000);

		if (loginpage.VerifyTitleAndURL()) {
			System.out.println("successfully logged out");

		} else {

			System.out.println("was not able to log out");
			Assert.assertTrue(false, "test case failed");

		}

	}

}

//=> Positive logged in scenario:
//
//Open test.textingpro website.
//2) Click on the login menu.
//3) Log in with below credential.
//4) Verify use is logged in and see re-new page.
//5) Click on the user Icon in the right corder.
//6) Click on the logout button from it.
//7) Verify user successfully logout.
//
//
//=> Negative logged in scenario:
//
//Open test.textingpro website.
//2) Click on the login menu.
//3) Verify user is on login page.
//4) Enter “test” in email address field.
//5) Verify “Please enter a valid email address.” Error message from textbox.
