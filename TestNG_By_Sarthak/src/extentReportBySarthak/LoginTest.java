
/*
  
  Extent Reports: It is logger style reporting library for automated tests.
  It adds info about test cases, screenshots,tags, series of steps (In sequential order).
  All methods inside extent reports are thread safe - 
  Recommended to make one instance of ExtentReports.
 
 */
package extentReportBySarthak;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginTest {
	
	// Make the objects
	public static ExtentReports extent; // Subject
	public static ExtentSparkReporter spark; // Observer
	public static ExtentTest test;
	
	@BeforeMethod
	public void initializeLoginTest() {
		extent = ExtentReportBaseManager.getReports(); // using OOP concept
		
		test = extent.createTest("Login Test");
				
	}
	
	@Test
	public void loginTest() {
		test.log(Status.INFO, "Login link clicked");
		test.log(Status.INFO, "Entered credentials");
		test.log(Status.INFO, "Clicked on submit button");
		test.log(Status.PASS, "Login test passed");
	}
	
	@AfterMethod
	public void finish() {
		extent.flush();
	}

}
