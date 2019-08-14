package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testData.Data;

public class Login_Page extends BasePage{
	
	WebDriver driver;
	Data data;
	
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
		data = new Data();
		
	}
	
	
	public boolean verifymainModal() {
		return waitForElement(frmMainModal, 3000);
	}
	
	public boolean verifUserTextBoxDisplayed() {
		waitForElement(frmMainModal, 3000);
		return waitForElement(txtUsername, 3000);
	}
	
	public boolean enterUsername() {
		String username = data.getUsername();

		try {
			waitForElement(txtUsername, 3000);
			enterText(txtUsername, username);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean enterPassword() {
		String password = data.getPassword();

		try {
			waitForElement(txtPassword, 3000);
			enterText(txtPassword, password);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean clickLoginBtn() {
		try {
			waitForElement(btnLogin, 3000);
			clickOnElement(btnLogin);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
