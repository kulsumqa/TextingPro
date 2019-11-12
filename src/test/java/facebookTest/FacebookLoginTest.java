package facebookTest;

import org.testng.annotations.Test;

import coreClasses.BaseTest;
import facebook.FacebookLogin;
import junit.framework.Assert;

public class FacebookLoginTest extends BaseTest {
	
	
    @Test
	public void verifyUserLoginfacebook() throws InterruptedException {
		FacebookLogin facebooklogin = new FacebookLogin(BaseTest.driver);
		facebooklogin.DoLoginTofacebook();
		Thread.sleep(2000);

		if (facebooklogin.verifyUserAbleToLoginFacebook()) {
			System.out.println("test case pass");

		} else {
			System.out.println("test case fail");

			Assert.assertTrue(false);
		
	}
}}