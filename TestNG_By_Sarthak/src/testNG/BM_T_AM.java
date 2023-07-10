package testNG;

//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BM_T_AM {

	/*
	 * @BeforeMethod public void userRegistration() {
	 * System.out.println("User is getting registered"); }
	 */

	@Test(priority = 1 , invocationCount = 2)
	public void userLogin() {
		System.out.println("User is able to login");
	}

	@Test(priority = 2, enabled= false)
	public void clickOnHome() {
		System.out.println("User is able to click on home");
	}
	
	@Test(priority = 3)
	public void userLogout() {
		System.out.println("User is able to Logout");
	}

	/*
	 * @AfterMethod public void userLogout() {
	 * System.out.println("User is able to logout"); }
	 */

}
