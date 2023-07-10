package testNG_By_Shammi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG8_SDET {

	@Test(dataProvider = "LoginData")
	public void loginTest(String username, String password) {
		System.out.println(username + " " + password);
	}

	/*
	 * This data provider annotated method will provide the data to @Test method
	 * Also this data can be provide to the same @Test method in different class
	 * also (Refer SDET Tutorial 09) To use @DataProvider annotation, first we have
	 * to give the name to the method Which will be given to test method, because
	 * One Test Case can have any no of data provider methods
	 */
	@DataProvider(name = "LoginData")
	public Object[][] setData() {

		Object[][] data = { { "abc@gmail.com", "abc" }, { "mno@rediffmail.com", "mno" },
				{ "xyz@hotmail.com}", "xyz" } };

		return data;

	}
}
