package Submit.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitionsImpl {

	@Given("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page() {
		System.out.println("The @Before has been succesfull connected with his Cucumber step");
	}

	@Given("^I want to write a step with (.+)$")
	public void I_want_to_write_a_step_with(String name) {
		System.out.println("Scenario @tag2 connected with 'GIVEN' and throwed paramete 'name': " + name);
	}

	@When("^I check for the (.+) tips of this course$")
	public void I_check_for_the_value_tips_of_this_course(int value) {
		System.out.println("Scenario @tag2 connected with 'WHEN' and throwed parameter 'value': " + value);
	}

	@And("{string} with help of my skills")
	public void I_GET_A_BETTER_JOB_with_help_of_my_skills(String msg) {
		System.out.println("Scenario @tag2 connected with 'AND' and throwed parameter 'string': " + msg);
	}

	@Then("^With those (.+) tips I will (.+) in  my career$")
	public void With_those_tips_I_will_in_my_career(int value, String status) {
		System.out.println("Scenario @tag2 connected with 'THEN' and throwed parameter 'value': " + value
				+ " and 'status: '" + status);
	}

}
