package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BeforeLogin;
import pages.DanskIndskolingPage;
import pages.Homepage;
import pages.LoginPage;
import util.TestBase;

public class ClientSteps extends TestBase {

	LoginPage login;
	Homepage homePage;
	DanskIndskolingPage DAIN;

	@Given("^I navigate to login page$")
	public void i_navigate_to_login_page() throws Throwable {
		TestBase.initialization();
		BeforeLogin before = new BeforeLogin();
		login = before.navigateToLogin();

	}

	@When("^I login with my username and password$")
	public void i_login_with_my_username_and_password() throws Throwable {
		homePage = login.loginIntoClio(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^I am on Clio landing page$")
	public void i_am_on_Clio_landing_page() throws Throwable {
		DAIN = homePage.navigateToDAIN();
		DAIN.navigateToPageWIthReadingGuide();

	}

}
