package Register;

import org.testng.annotations.Test;

import PageObject.ContactUsEmail_PoPUp;
import PageObject.MenuPage;
import coreClasses.BaseTest;
import junit.framework.Assert;

public class ContactUsEmail_PopUpTest extends BaseTest {
	@Test
	public void verifyContactUsEmailPOPUP() throws InterruptedException {

		ContactUsEmail_PoPUp contactuspopup = new ContactUsEmail_PoPUp(BaseTest.driver);

		contactuspopup.clickOnContactUsWidget();
		contactuspopup.fillEmailUsForm();
		contactuspopup.clickOnSendEmail();
		if (contactuspopup.verifyEmailSqureBoxAppearrs()) {
			System.out.println("test case pass succesfully sent email");

		} else {
			System.out.println("testcase fail");
			Assert.assertTrue(false);

		}

	}

}
