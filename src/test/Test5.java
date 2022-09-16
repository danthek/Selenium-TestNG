package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test5 {

	@AfterClass
	public void Test5Method0() {
		System.out.println("this methods executes really at the emd of alll");
	}

	@AfterMethod
	public void Test5Method1() {
		System.out.println("Test5Method 1: Last method executed inside the Test5 class");
	}

	@Test(dependsOnMethods= {"Test5Method6"})
	public void Test5Method2() {
		System.out.println("Test5Method 2");
	}

	@Test(groups = { "Smoke" })
	public void Test5Method3() {
		System.out.println("Test5Method 3: Is part of a group");
	}

	@BeforeClass
	public void Test5Method7() {
		System.out.println("The very very first method that should be executed");
	}

	@Test(dependsOnMethods= {"Test5Method8", "Test5Method9" })
	public void Test5Method4() {
		System.out.println("Test5Method 4");
	}

	@BeforeMethod
	public void Test5Method5() {
		System.out.println("Test5Method 5: First Method executed insite Test5");
	}

	@Test
	public void Test5Method6() {
		System.out.println("Test5Method 6");
	}
	@Test
	public void Test5Method8() {
		System.out.println("Test5Method 8");
	}
	@Test(timeOut=7000)
	public void Test5Method9() {
		System.out.println("Test5Method 9");
	}
	@Test(enabled=false)
	public void Test5Method10() {
		System.out.println("Test5Method 10");
	}

}
