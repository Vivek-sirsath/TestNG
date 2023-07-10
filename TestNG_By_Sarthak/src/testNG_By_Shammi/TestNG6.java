package testNG_By_Shammi;

import org.testng.Assert;
import org.testng.annotations.Test;

// Dependency (DependsOnMethods)
public class TestNG6 {

	@Test
	public void z() {

		Assert.assertTrue(3 > 12); // False Condition
		System.out.println("This is z test method");
	}

	@Test(dependsOnMethods = "z")
	public void b() {
		System.out.println("This is test method executes only if z test method becomes True");
	}

}
