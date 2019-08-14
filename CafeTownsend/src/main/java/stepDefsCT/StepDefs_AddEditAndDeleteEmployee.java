package stepDefsCT;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import pageObjects.Create_Page;
import pageObjects.Edit_Page;
import pageObjects.Employees_Page;

public class StepDefs_AddEditAndDeleteEmployee {
	
	WebDriver driver;
	Employees_Page employeePage;
	Create_Page createPage;
	Edit_Page editPage;
	
	public StepDefs_AddEditAndDeleteEmployee() {
		driver = ServiceHooks.driver;
		employeePage = new Employees_Page(driver);
		createPage = new Create_Page(driver);
		editPage = new Edit_Page(driver);
	}
	

	
	
	@Then("^User adds a new employee to the system$")
	public void user_adds_a_new_employee_to_the_system() throws Throwable {
		
		Assert.assertTrue(employeePage.clickCreateBtn(), "- Create button was not clicked");
		Assert.assertTrue(createPage.enterFirstName(), "- First name was not entered");
		Assert.assertTrue(createPage.enterLastName(), "- Last name was not entered");
		Assert.assertTrue(createPage.enterStartDate(), "- Start date was not entered");
		Assert.assertTrue(createPage.enterEmail(), "- Email was not entered");
		Assert.assertTrue(createPage.clickAddBtn(), "- Add button was not clicked");
	
		Assert.assertTrue(employeePage.verifyEmployee(), "Employee is not displayed");
		
	}
	
	@Then("^User edits employee$")
	public void user_edits_employee() throws Throwable {
		Assert.assertTrue(employeePage.selectEmployee(), "- Employee was not selected");
	    Assert.assertTrue(employeePage.clickEditBtn());
	    Assert.assertTrue(editPage.editFirstName());
	    Assert.assertTrue(editPage.clickUpdateBtn());
	}
	
	@Then("^User deletes previously added employee$")
	public void user_deletes_previously_added_employee() throws Throwable {
	   
		Assert.assertTrue(editPage.selectEditedEmployee(), "Edited employee was not selected");
		Assert.assertTrue(employeePage.clickDeleteBtn(), "- Delete button was not clicked");
		Assert.assertTrue(employeePage.acceptAlert(), "- Alert was not accepted");
		Thread.sleep(2000);
	}

	
}
