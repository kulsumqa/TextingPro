package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import coreClasses.BasePage;

public class FacebookLogin extends BasePage {

	public FacebookLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}

	public void DoLoginTofacebook() {

	//lick(By.xpath("//img[@class='_s0 _4ooo _1x2_ _1ve7 _1gax img']"));

	//lick(By.xpath("]"));
	//witchTOPopUp();
		SendKeys(By.xpath("//input[@id='email']"),"fairoos03@gmail.com");
		//SendKeys(By.xpath("//input[@id='email']"), "fairoos03@gmail.com");
		//SendKeys(By.xpath("//input[@id='pass']"),"kolijaamar" );
		SendKeys(By.xpath("//input[@id='pass']"), "kolijaamar");
		click(By.xpath("//button[@id='loginbutton']"));
		//click(By.xpath("//input[@id='u_0_2']"));
	}

	public boolean verifyUserAbleToLoginFacebook() {
		System.out.println(GetTitleOfCurrentPage());
		if (GetTitleOfCurrentPage().contains("facebook")) {

		}

		return false;

	}

}
