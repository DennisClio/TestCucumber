package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\dennis\\eclipse-workspace\\Cucumber_Tutorial_PageObjects\\src\\test\\java\\features\\login.feature", glue = "steps", strict = false, monochrome = true, dryRun = false)

public class TestRunner {

}
