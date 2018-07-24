package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class BeforeLogin extends TestBase {

	@FindBy(className = "clio-login-btn")
	WebElement btn;

	public BeforeLogin() {

		PageFactory.initElements(driver, this);

	}

	public LoginPage navigateToLogin() {
		btn.click();
		return new LoginPage();
	}

}
