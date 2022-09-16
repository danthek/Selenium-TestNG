package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test3 {
	@Test
	public void ShoppingCart() {
		System.out.println("Add item to cart");
	}

	@Test
	public void FAQs() {
		System.out.println("FAQs section");
	}

	@Test
	public void AboutUs() {
		System.out.println("About us section");
	}

	@Test
	public void Features2() {
		System.out.println("Mobile Features");
	}

	@Test
	public void MobileFeatures3() {
		System.out.println("Mobile Features");
	}

	@Parameters({"URL"})
	@Test
	public void Features4(String urlName) {
		System.out.println("This method catches parameters");
		System.out.println("The URL as parameter is: " + urlName);
	}

	@Test
	public void MobileFeatures5() {
		System.out.println("Mobile Features");
	}

	@Test(groups = { "Smoke" })
	public void MobileFeatures7() {
		System.out.println("Mobile Features: Is part of a group");
	}

	@Test
	public void Features8() {
		System.out.println("Mobile Features");
	}

	@Test
	public void BuyRecord() {
		System.out.println("Buy record section");
	}

}
