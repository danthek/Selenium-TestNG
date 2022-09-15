package test;

import org.testng.annotations.Test;

public class Test1 {
	// whatever methods follow after @test , will be created as a test case by
	// testNG
	// dont forget to hover @Test and import it

	@Test
	public void Login() {
		// automation method
		System.out.println("Login Test");
	}

	@Test
	public void Register() {
		System.out.println("Register Test");

	}
}
