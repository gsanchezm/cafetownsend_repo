package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testData.Data;

public class Edit_Page extends BasePage {
	

	WebDriver driver;
	Data data;

	// ------- ELEMENTS -------
	
	@FindBy(xpath = "//input[@ng-model='selectedEmployee.firstName']")
	WebElement txtEditFirstName;
	
	@FindBy(xpath = "//button[contains(text(),'Update')]")
	WebElement btnUpdate;
	
	@FindBy(xpath = "//ul[@id='employee-list']")
	WebElement lstEmployees;
	
	@FindBy(xpath = "//li[contains(text(),'Cuack')]")
	WebElement userEditedCuack;
	
	// ------- METHODS -------

		public Edit_Page(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			data = new Data();
		}
		
		public boolean editFirstName() {
			String editFirstName = data.getEditFirstName();

			try {
				waitForElement(txtEditFirstName, 3000);
				txtEditFirstName.clear();
				enterText(txtEditFirstName, editFirstName);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		
		public boolean clickUpdateBtn() {
			try {
				waitForElement(btnUpdate, 3000);
				clickOnElement(btnUpdate);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		
		public boolean selectEditedEmployee() {
			try {
				waitForElement(lstEmployees, 3000);
				waitForElement(userEditedCuack, 3000);
				clickOnElement(userEditedCuack);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

}
