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
	
	@Given("^User navigates to \"([^\"]*)\" page$")
	public void user_navigates_to_page(String arg1) throws Throwable {
	    arg1 = data.getUrl();
	    driver.get(arg1);
	}

	@When("^User enter (.+) and (.+)$")
	public void user_enter_Luke_and_Skywalker(String username, String password) throws Throwable {
		Assert.assertTrue(loginPage.performLogin(username, password), "- Login does not work");
	}

	@Then("^user validates correct login with (.+) message$")
	public void user_validates_correct_login_with_Hello_Luke_message(String greeting) throws Throwable {
		Assert.assertTrue(employeesPage.getGreeting().equals(greeting), "- Greeting message is not present");
	}

	@Then("^User logout$")
	public void user_logout() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(employeesPage.logout(), "- Incorrect logout");
		Thread.sleep(1000);
	}

}
