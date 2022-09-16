package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void MobileRegister() {
		System.out.println("Sign up on Mobile");
	}

	@Test
	public void WebRegister() {
		System.out.println("Sign up on Web App");
	}

	@Test(groups= {"Smoke"})
	public void APIHome() {
		System.out.println("Log in on API Home: IS PART OF A GROUP");
	}
	
	@BeforeSuite
	public void FirstMethodToRun() {
		System.out.println("This is the 1st method executed in the suite thanks to the @BeforeTest");
	}

}
