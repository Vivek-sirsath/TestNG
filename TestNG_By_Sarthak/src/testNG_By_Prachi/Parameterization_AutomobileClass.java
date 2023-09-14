package testNG_By_Prachi;

import org.testng.annotations.*;

public class Parameterization_AutomobileClass {

	@Test
	@Parameters("AutomobileName")
	public void tc1(String name) {
		System.out.println("Automobile Name: " + name);
	}
}
