package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@BeforeSuite
	public void beforesuit() {
		System.out.println("Before suit");
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("After suit");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
	}
	
	

}
