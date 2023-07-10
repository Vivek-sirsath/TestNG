package testNG_By_Shammi;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void a2() {
		System.out.println("Hello a2 test method");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("b method BeforeTest");
	}
	
	@BeforeSuite
	public void c() {
		System.out.println("c method BeforeSuite");
	}
	
	@AfterMethod
	public void d() {
		System.out.println("d method AfterMethod");
	}
	
	@BeforeClass
	public void e() {
		System.out.println("e method BeforeClass");
	}
	
	@AfterTest
	public void f() {
		System.out.println("f method AfterTest");
	}
	
	@AfterClass
	public void g() {
		System.out.println("g method AfterClass");
	}
	
	@BeforeMethod
	public void h() {
		System.out.println("h method BeforeMethod");
	}
	
	@AfterSuite
	public void i() {
		System.out.println("i method AfterSuite");
	}
	
	@Test
	public void a1() {
		System.out.println("Hello a1 test method");
	}

}
