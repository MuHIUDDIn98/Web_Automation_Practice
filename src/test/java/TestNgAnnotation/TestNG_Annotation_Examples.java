package TestNgAnnotation;

import org.testng.annotations.*;

public class TestNG_Annotation_Examples {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite Example");
		
	}
	
	@Test (priority=1)
	public void TestExample1() {
		
		System.out.println("Test_Example...1");
	}
	
	@AfterSuite
	public void AfterSuite() {
		
		System.out.println("AfterSuite");
	}
	
	@BeforeClass
	public void beforeClassExample() {
		System.out.println("Before class");
	}
	
	
	@AfterClass
	public void afterClassExample() {
		
		System.out.println("After class");
	}
	
	@Test (priority=3)
	public void TestExample2() {
		System.out.println("Test example...2");
	}
	
	@AfterTest
	public void AfterTestExample() {
		System.out.println("After Test ");
	}
	
	
	@BeforeTest
	public void BeforeTestExample() {
		
		System.out.println("BeforeTest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethode");
	}
	
	@Test (priority=1)
	public void TestExample3(){
		System.out.println("Test example....3");
	}
	
	@AfterMethod
	public void AfterMethode() {
		System.out.println("AfterMethode");
	}
	
}
