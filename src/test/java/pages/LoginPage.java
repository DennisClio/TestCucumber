package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "user")
	WebElement username;

	@FindBy(id = "pass")
	WebElement password;

	@FindBy(id = "login")
	WebElement btn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public Homepage loginIntoClio(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		btn.click();
		return new Homepage();
	}
}
