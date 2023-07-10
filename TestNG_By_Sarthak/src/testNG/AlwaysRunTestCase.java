package testNG;

// Here any test cases will not execute because 'enabled = false'
// 'enabled = false' is more powerful than 'alwaysRun = true'

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunTestCase {

	@Test(priority = 1)
	public void First() {
		System.out.println("This is first test case");
		Assert.fail("We are deliberately failing this test case");
	}

	@Test(priority = 2, dependsOnMethods = "First") // If remove alwaysRun = true, test will skipped because it depends
													// on First test
	public void Second() {
		System.out.println("This is second test case");
	}

	@Test(priority = 3, dependsOnMethods = { "First", "Second" }, alwaysRun = true, enabled = false)
	public void Third() {
		System.out.println("This is third test case");
	}

	@Test(priority = 4, dependsOnMethods = { "First", "Second", "Third" }, alwaysRun = true, enabled = false)
	public void Fourth() {
		System.out.println("This is fourth test case");
	}

}
