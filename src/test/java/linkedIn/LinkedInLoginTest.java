package linkedIn;

import org.testng.annotations.Test;

import LinkedIn.LinkedInLogin;
import coreClasses.BaseTest;
import junit.framework.Assert;

public class LinkedInLoginTest  extends BaseTest{
	
	@Test
	
	public void verifyUserAbleToLoginToLinkedIn () {
		LinkedInLogin linkedinlogin = new LinkedInLogin(BaseTest.driver);
		linkedinlogin.DoLoginToLinkedIn();
		
		
		
		if(linkedinlogin.verifyImAbleToLogin()) {
			System.out.println("test case pass");
		}else {
			System.out.println("Test case fail");
			
			//Assert.assertTrue(false);
			Assert.assertTrue("user not in linkedin page ", false);
		}
	
	}

}
