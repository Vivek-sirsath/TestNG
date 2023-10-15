package extentReportBySarthak;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class PaymentTest {
	
	// Make the objects
	public static ExtentReports extent; // Subject
	public static ExtentSparkReporter spark; // Observer
	public static ExtentTest test;
	
	@BeforeMethod
	public void initializePaymentTest() {
		extent = ExtentReportBaseManager.getReports(); // using OOP concept		
		test = extent.createTest("Payment Test");
				
	}
	
	@Test
	public void loginTest() {
		test.log(Status.INFO, "Payment module opened");
		test.log(Status.INFO, "Entered Amount");
		test.log(Status.INFO, "Clicked on Payment button");
		test.log(Status.FAIL, "Payment test failed");
		Assert.assertFalse(true);
	}
	
	@AfterMethod
	public void finish() {
		extent.flush();
	}



}
