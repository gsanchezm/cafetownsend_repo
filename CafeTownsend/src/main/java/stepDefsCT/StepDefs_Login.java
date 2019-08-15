package stepDefsCT;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Employees_Page;
import pageObjects.Login_Page;
import testData.Data;

public class StepDefs_Login {
	
	WebDriver driver;
	Data data;
	Login_Page loginPage;
	Employees_Page employeesPage;
	
	
	public StepDefs_Login() {
		driver = ServiceHooks.driver;
		data = new Data();
		loginPage = new Login_Page(driver);
		employeesPage = new Employees_Page(driver);	
	}
	
	
	@Given("^User navigates to CafeTownsend page$")
	public void user_navigates_to_CafeTownsend_page() throws Throwable {
	  driver.get(data.getUrl());
	}

	@When("^User enter Valid credentials$")
	public void user_enter_Valid_credentials() throws Throwable {
		Assert.assertTrue(loginPage.enterUsername(), "- Username was not entered");
		Assert.assertTrue(loginPage.enterPassword(), "- Password was not entered");
		Assert.assertTrue(loginPage.clickLoginBtn(), "- Login button was not clicked");
		Thread.sleep(2000);
	}
	
	@Then("^user validates correct login$")
	public void user_validates_correct_login() throws Throwable {
		String actualGreeting = data.getGreeting();
		Assert.assertTrue(employeesPage.getGreeting().contentEquals(actualGreeting), "- Greeting message is missing ");
		Thread.sleep(2000);
	}
	
	@Then("^User logout$")
	public void user_logout() throws Throwable {
		Thread.sleep(1000);
	    Assert.assertTrue(employeesPage.clickLogoutBtn(), "- Logout button was not clicked");
	    Assert.assertTrue(loginPage.verifUserTextBoxDisplayed(), "- Username text box is not displayed");
	    Thread.sleep(2000);
	}

}
