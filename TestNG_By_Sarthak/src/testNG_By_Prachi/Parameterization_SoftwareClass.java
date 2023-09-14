package testNG_By_Prachi;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_SoftwareClass {

	@Test
	@Parameters("SoftwareName")
	public void tc1(String name) {
		System.out.println("Software Name: " + name);
	}
}
