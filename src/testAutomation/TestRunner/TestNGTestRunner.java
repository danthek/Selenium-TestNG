package testAutomation.TestRunner;

import org.testng.annotations.DataProvider;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "./features/", glue = "Submit.stepsDefinitions", tags = {"@tag, @tag2" }, monochrome = true, plugin = { "html:target/cucumber.html" })

public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider()
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
