package Register;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.MenuPage;
import PageObject.NegativeLogin;
import coreClasses.BaseTest;

public class UnsuccesfulLoginTest extends BaseTest{

	
	@Test
	public void verifyFailLogin () throws InterruptedException {
		
		MenuPage menupage = new MenuPage(BaseTest.driver);
		NegativeLogin neglogin=new NegativeLogin(BaseTest.driver);

		menupage.ClickOnMenu("Log In");
		neglogin.Loginfail();
		neglogin.HitEnteronEmailaddress();
		
		if (neglogin.verifyPLeaseEnterEmailAddressText()) {
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test Case has Failed");
			
			Assert.assertTrue(false, "Test Caee Failed because There is no Text Like Please Enter Valid Email Address ");
		}
		Thread.sleep(2000);

		
		
			
		}
		
		
		
	}
	

