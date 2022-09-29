package cucumber;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.BeforeClass;

import cucumber.api.testng.TestNGCucumberRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/cucumber", glue = "Submit.StepsDefinition", monochrome = true, plugin = {
		"html:target/cucumber.html" })

public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	private TestNGCucumberRunner testNGCucumberRunner;
	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
}
