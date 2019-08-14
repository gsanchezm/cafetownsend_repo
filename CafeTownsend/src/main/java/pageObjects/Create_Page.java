package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testData.Data;

public class Create_Page extends BasePage {

	WebDriver driver;
	Data data;

	// ------- ELEMENTS -------

	@FindBy(xpath = "//a[@class='subButton bCancel']")
	WebElement btnCancel;

	@FindBy(xpath = "//input[@ng-model='selectedEmployee.firstName']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@ng-model='selectedEmployee.lastName']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@ng-model='selectedEmployee.startDate']")
	WebElement txtStartDate;

	@FindBy(xpath = "//input[@ng-model='selectedEmployee.email']")
	WebElement txtEmail;

	@FindBy(xpath = "//button[@ng-show='isCreateForm']")
	WebElement btnAdd;

	// ------- METHODS -------

	public Create_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		data = new Data();
	}

	public boolean clickCancelBtn() {
		try {
			waitForElement(btnCancel, 3000);
			clickOnElement(btnCancel);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean enterFirstName() {
		String firstName = data.getFirstName();

		try {
			waitForElement(txtFirstName, 3000);
			enterText(txtFirstName, firstName);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean enterLastName() {
		String lastName = data.getLastName();

		try {
			waitForElement(txtLastName, 3000);
			enterText(txtLastName, lastName);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean enterStartDate() {
		String startDate = data.getStartdate();

		try {
			waitForElement(txtStartDate, 3000);
			enterText(txtStartDate, startDate);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean enterEmail() {
		String email = data.getEmail();

		try {
			waitForElement(txtEmail, 3000);
			enterText(txtEmail, email);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean clickAddBtn() {
		try {
			waitForElement(btnAdd, 3000);
			clickOnElement(btnAdd);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
