package stepDefsCT;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import pageObjects.Create_Page;
import pageObjects.Employees_Page;

public class StepDefs_AddEditAndDeleteEmployee {
	
	WebDriver driver;
	Employees_Page employeePage;
	Create_Page createPage;
	
	public StepDefs_AddEditAndDeleteEmployee() {
		driver = ServiceHooks.driver;	
		employeePage = new Employees_Page(driver);
		createPage = new Create_Page(driver);
	}
	
	@Then("^User adds a new employee with (.+), (.+), (.+) and (.+)$")
	public void user_adds_a_new_employee_with_Donald_Lastname_and_donald_duck_com(String firstName, String lastName, String startDate, String newEmail) throws Throwable {
		Assert.assertTrue(employeePage.clickCreateBtn(), "- Create button was not clicked");
		Assert.assertTrue(createPage.createNewEmployee(firstName, lastName, startDate, newEmail), "- Employee was not created");
	}
	
	@Then("^User edits employee by changing First Name for \"([^\"]*)\"$")
	public void user_edits_employee_by_changing_First_Name_for(String arg1) throws Throwable {
		Assert.assertTrue(employeePage.editEmployee(arg1), "- Employee was not edited");
	}

	
	@Then("^User deletes previously added employee$")
	public void user_deletes_previously_added_employee() throws Throwable {
		Assert.assertTrue(employeePage.deleteEmployee(), "Employee was not selected");
		Thread.sleep(2000);
	}

	
}
