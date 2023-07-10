package testNG_By_Shammi;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG5 {
	
	// implementation of @BeforeMethod before every test case as per priorities
	
	@Test(priority=2)
	public void a() {
		System.out.println("a test method");
	}
	
	@Test(invocationCount=2,priority=-1,enabled=false)
	public void b() {
		System.out.println("b test method");
	}
	
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("c test method");
	}
	
	@BeforeMethod
	public void d() {
		System.out.println("d test method");
	}

}
