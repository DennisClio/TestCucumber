package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;
import util.WindowHandler;

public class DanskIndskolingPage extends TestBase {

	@FindAll(@FindBy(className = "ga-portal-topnav-item"))
	List<WebElement> allElementsInList;

	public DanskIndskolingPage() {
		PageFactory.initElements(driver, this);
	}

	public void navigateToPageWIthReadingGuide() {

		try {
			WindowHandler.waitForNewWindowAndSwitchToIt(driver);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement emner = allElementsInList.get(1);
		emner.click();
	}

}
