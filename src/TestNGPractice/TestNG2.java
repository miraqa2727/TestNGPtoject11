package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG2 {

	SoftAssert SoftAssert=new SoftAssert();
	
	@Test(priority=1, groups="methods")
	public void test1() {
		
		System.out.println("Before");
		
		Assert.assertTrue(2<3, "Verifying Element");
		SoftAssert.assertAll();
		System.out.println("After");
		}
	
	@Test(priority=2, dependsOnMethods= {"test1"}, groups= {"methods","Sanity"})
	public void test2() {
		System.out.println("Before test2");
		Assert.assertEquals("abc", "abc1");
		System.out.println("Matched");
		SoftAssert.assertAll();
	}
	
	
	
}
