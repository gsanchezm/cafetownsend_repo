package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends BasePage{
	
	WebDriver driver;
	
	
	// ------- ELEMENTS -------
	
	@FindBy(xpath = "//div[contains(@class, 'main-view-wrapper main-view-wrapper-loggedIn')]")
	WebElement frmMainModal;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement txtUsername;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnLogin;
	
	// ------- METHODS -------
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}

	public boolean verifUserTextBoxDisplayed() {
		waitForElement(frmMainModal, 3000);
		return waitForElement(txtUsername, 3000);
	}
	
	public boolean performLogin(String username, String password) {
		try {
			waitForElement(txtUsername, 3000);
			enterText(txtUsername, username);
			waitForElement(txtPassword, 3000);
			enterText(txtPassword, password);
			clickOnElement(btnLogin);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		return false;
	}

}
