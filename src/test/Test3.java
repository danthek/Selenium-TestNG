package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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

	@Test(dataProvider="getData")
	public void CartCheckOut(String userName, String password) {
		System.out.println(userName + password);
	}

	@Test
	public void MobileFeatures3() {
		System.out.println("Mobile Features");
	}

	@Parameters({ "URL", "Country", "habitants" })
	@Test
	public void Features4(String urlName, String Country, int habitants) {
		System.out.println("This method catches parameters");
		System.out.println("The URL as parameter is: " + urlName);
		System.out.println("The Selected Country is:  " + Country);
		System.out.println("The number of habitants  is:  " + habitants);
	}

	@Test
	public void MobileFeatures5() {
		// Hardcoded Failure to show how a failure listener works
		System.out.println("This is a failed Test");
		Assert.assertTrue(false);
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

	@DataProvider
	public Object[][] getData() {
		// 1st combination -> username & Password - good credit history
		// 2nd combination -> username & Password- no credit history
		// 3rd combination -> username & Password - bad credit history

		// create multidimensional array, write Object with caps.
		// we are defining an Array with 3 rows (3 possible combinations) and 2 columns(2 values-user & password).
		Object[][] data = new Object[3][2];
		// fill the object data
		//1st set
		data[0][0] = "First User Name  ";
		data[0][1] = "First Password";
		//2nd set
		data[1][0] = "Second User Name  ";
		data[1][1] = "Second Password";
		//3rd set
		data[2][0] = "Third User Name  ";
		data[2][1] = "Third Password";
		return data;
	}

}
