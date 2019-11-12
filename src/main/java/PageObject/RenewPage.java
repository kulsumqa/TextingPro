package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import coreClasses.BasePage;

public class RenewPage extends BasePage {

	public RenewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean verifyUserOnRenewPage() {
		String text = getText(By.xpath("//a[contains(text(),'Renew Now')]"));
		if (text.contains("Renew Now")) {
			return true;

		}
		return false;
	}
	
//	public class RenewPage extends BasePage {
//
//		public RenewPage(WebDriver driver) {
//			super(driver);
//			
//		}
//		
//		public boolean verifyUserOnRenewPage() {
//			
//			String text = getText(By.xpath("//a[contains(text(),'Renew Now')]"));
//			
//			if (text.contains("Renew")) {
//				
//			return true;
//			}
//			return false;
//			
//			
//		}
//		
//
//	}

	
	
	
	
}