package test;

import org.testng.annotations.Test;

public class Test1 {
	// whatever methods follow after @test , will be created as a test case by
	// testNG
	// dont forget to hover @Test and import it

	@Test
	public String Login() {
		// automation method
		System.out.println("////////////////////////////////////////////////////////////Login Test");
		String hola = "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOque onda";
		return hola;
	}
	@Test
	public void Proof() {
		// automation method
		System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
		
	}

	@Test
	public void Register() {
		System.out.println("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwRegister Test");

	}
}
