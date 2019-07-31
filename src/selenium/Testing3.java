package selenium;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert=new SoftAssert();
	
	@Test (priority=1, groups="Sanity")
	public void homeTest() {
		System.out.println("I am in home test");
		System.out.println("before assertion");
		Assert.assertTrue(4>3, "Verifying Element");
		System.out.println("After Assertion");
	}
	
	@Test (priority=2, dependsOnMethods= {"homeTest"}, groups= {"Smoke","Sanity"})
	public void mainTest() {
		System.out.println("I am in main test");
		System.out.println("before assertion");
		Assert.assertTrue(2>3, "Verifying Element");
		System.out.println("After Assertion");
		softAssert.assertAll(); //similar to error collector
	}
	
	@Test (priority=3, dependsOnMethods= {"mainTest"}, groups="nikul")
	public void endTest() {
		System.out.println("I am in home test");
		System.out.println("before assertion");
		Assert.assertTrue(2>3, "Verifying Element");
		System.out.println("After Assertion");
		softAssert.assertEquals("abc", "abc1");
		System.out.println("After second Assertion");
		softAssert.assertAll();
	}
	
	
	

}
