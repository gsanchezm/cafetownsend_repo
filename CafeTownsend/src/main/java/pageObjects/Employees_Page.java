package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Employees_Page extends BasePage {

	WebDriver driver;
	WebDriverWait wait;
	Edit_Page editPage;
	Login_Page loginPage;

	// ------- ELEMENTS -------

	@FindBy(xpath = "//p[@id='greetings']")
	WebElement txaGreeting;

	@FindBy(xpath = "//p[contains(@class, 'main-button')]")
	WebElement bntLogout;

	@FindBy(xpath = "//a[@id='bAdd']")
	WebElement btnCreate;

	@FindBy(xpath = "//a[@id='bEdit']")
	WebElement btnEdit;

	@FindBy(xpath = "//a[@id='bDelete']")
	WebElement btnDelete;
	
	@FindBy(xpath = "//ul[@id='employee-list']")
	WebElement lstEmployees;
	
	@FindBy(xpath = "//li[contains(text(),'Donald')]")
	WebElement userDonald;

	// ------- METHODS -------

	public Employees_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
		editPage = new Edit_Page(driver);
		loginPage = new Login_Page(driver);
	}

	public String getGreeting() {
		try {
			waitForElement(txaGreeting, 3000);
			return txaGreeting.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean clickCreateBtn() {
		try {
			waitForElement(btnCreate, 3000);
			clickOnElement(btnCreate);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean editEmployee(String newFirstName) {
		try {
			waitForElement(lstEmployees, 3000);
			waitForElement(userDonald, 3000);
			clickOnElement(userDonald);
			waitForElement(btnEdit, 3000);
			clickOnElement(btnEdit);
			editPage.editFirstName(newFirstName);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		return false;
	}
	
	public boolean deleteEmployee() {
		try {
			editPage.selectEditedEmployee();
			waitForElement(btnDelete, 3000);
			clickOnElement(btnDelete);
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		return false;
	}
	
	public boolean logout() {
		try {
			waitForElement(bntLogout, 3000);
			clickOnElement(bntLogout);
			loginPage.verifUserTextBoxDisplayed();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		return false;
	}

}
