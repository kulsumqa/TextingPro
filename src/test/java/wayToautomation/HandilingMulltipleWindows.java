package wayToautomation;

import org.apache.log4j.Logger;

import org.testng.annotations.Test;

import PageObject.SeleniumTutorialPage;
import PageObject.WayToHomePage;
import coreClasses.BaseTest;
import junit.framework.Assert;

public class HandilingMulltipleWindows extends BaseTest {

	private static final Logger LOGGER = Logger.getLogger(HandilingMulltipleWindows.class);

	@Test
	public void verifyBUyNowButton() throws InterruptedException {
		WayToHomePage waytohomepage = new WayToHomePage(BaseTest.driver);

		waytohomepage.clickOnBuyNow();
		SeleniumTutorialPage seleniumtutorialpaage = new SeleniumTutorialPage(BaseTest.driver);

		Thread.sleep(2000);

		if (seleniumtutorialpaage.verifyURLName()) {
			// System.out.println("test case pass");
			LOGGER.info("test case pass");
		} else {
			// System.out.println("test case fail, user did not redirect to buy noew page");
			LOGGER.info("test case fail, user did not redirect to buy noew page");
			Assert.assertTrue(false);
		}
		Thread.sleep(2000);

		if (waytohomepage.verifyURLofHomePage()) {
			// System.out.println("test case pass");
			LOGGER.info("test case pass");
		} else {
			//System.out.println("test case fail, ");
			LOGGER.info("test case fail, ");
			Assert.assertTrue(false);
		}

	}
}
