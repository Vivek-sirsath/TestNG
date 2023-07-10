package testNG_By_Shammi;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {
	
	// Skipping the test cases
	
	//@Test                                     // Intentionally commented ( // ) @Test to skip a test case
	public void a() {
		System.out.println("a test method");
	}
	//Industry mostly use - Recommended
	@Test(enabled=false)
	public void b() {
		System.out.println("b test method");
	}
	@Test(invocationCount=2)
	public void c() {
		System.out.println("c test method");
	}
	@Test(invocationCount=0)
	public void d() {
		System.out.println("d test method");
	}
	@Test
	public void e() {
		System.out.println("e test method");
		throw new SkipException("Skipping e test method");
		//System.out.println("Hello");
	}

}
