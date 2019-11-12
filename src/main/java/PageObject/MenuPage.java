package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import coreClasses.BasePage;

public class MenuPage extends BasePage {

	public MenuPage(WebDriver driver) {
		super(driver);

	}

	public void ClickOnMenu(String menuname) throws InterruptedException {

		
		click(By.xpath("//*[@id= 'cssmenu']//a[text()='" + menuname + "']"));

//*[@id='cssmenu']//a[text()='"+menuname+"']

	}

//	public void ClickOnLoginButton() {
//		click(By.xpath("//a[contains(text(),'Login')]"));
//	}

	
	
}

