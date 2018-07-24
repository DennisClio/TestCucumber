package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class Homepage extends TestBase {

	@FindBy(className = "dropdown")
	WebElement dropdown;

	@FindAll(@FindBy(className = "dropdown-content-link"))
	List<WebElement> allElementsInList;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public DanskIndskolingPage navigateToDAIN() {
		dropdown.click();
		// WebElement indsk = allElementsInList.iterator().next();
		WebElement indsk = allElementsInList.get(0);
		indsk.click();
		return new DanskIndskolingPage();
	}

}
