package pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Page extends BasePage {

	WebDriver driver;

	// ------- ELEMENTS -------

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
	}
	
	
	

	public boolean createNewEmployee(String firstname, String lastName, String startDate, String newEmail) {
		try {
			ArrayList<WebElement> elementsCreateEmployee = new ArrayList<WebElement>();
			elementsCreateEmployee.add(txtFirstName);
			elementsCreateEmployee.add(txtLastName);
			elementsCreateEmployee.add(txtStartDate);
			elementsCreateEmployee.add(txtEmail);
			
			waitForElements(elementsCreateEmployee, 3000);
			
			
			enterText(txtFirstName, firstname);
			enterText(txtLastName, lastName);
			enterText(txtStartDate, startDate);
			enterText(txtEmail, newEmail);
			clickOnElement(btnAdd);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		return false;
	}


}
