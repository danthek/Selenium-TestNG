package test;

import org.testng.annotations.Test;

public class Test1 {
	//whatever methods follow after @test , will be created as a test case by testNG
	//dont forget to hover @Test and import it
	
	@Test
	public void Demo() {
		//automation method
		System.out.println("First Test");
	}

	@Test
	public void SecondTest() {
		System.out.println("Second Test");
		
	}
}
