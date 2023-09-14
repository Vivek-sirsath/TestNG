package testNG_By_Prachi;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization1 {

	// Here We'll give same parameters to all test methods

	@Test
	@Parameters({ "i", "j" }) // We provide the values to parameters i and j using xml file
	public void addition(int a, int b) {
		System.out.println("addition: " + (a + b)); // addition: 9
	}

	@Test
	@Parameters({ "i", "j" })
	public void subtraction(int a, int b) {
		System.out.println("subtraction: " + (a - b)); // subtraction: 1
	}

	@Test
	@Parameters({ "i", "j" })
	public void multiplication(int a, int b) {
		System.out.println("multiplication: " + (a * b)); // multiplication: 20
	}
}
