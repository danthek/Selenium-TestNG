package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void Blog(){
		System.out.println("Post comment");
	}


@AfterTest
	public void FirstMethodToRun() {
		System.out.println("This is the last  method executed thanks to the @AfterTest");
	}

@BeforeSuite
public void SecondBeforeSuite() {
	System.out.println("Second Before Suite");
}


}

