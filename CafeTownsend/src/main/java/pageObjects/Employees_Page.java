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


	// ------- ELEMENTS -------
	
	@FindBy(xpath = "//div[@ng-controller='MainController']")
	WebElement mainController;

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

	public boolean clickLogoutBtn() {
		try {
			waitForElement(bntLogout, 3000);
			clickOnElement(bntLogout);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
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

	public boolean clickEditBtn() {
		try {
			waitForElement(btnEdit, 3000);
			clickOnElement(btnEdit);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean clickDeleteBtn() {
		try {
			waitForElement(btnDelete, 3000);
			clickOnElement(btnDelete);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean selectEmployee() {
		try {
			waitForElement(lstEmployees, 3000);
			waitForElement(userDonald, 3000);
			clickOnElement(userDonald);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean verifyEmployee() {
		waitForElement(lstEmployees, 3000);
		return waitForElement(userDonald, 3000);
	}
	
	public boolean acceptAlert() {
		try {
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
