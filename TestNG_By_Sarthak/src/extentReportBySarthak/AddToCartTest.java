package extentReportBySarthak;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddToCartTest {

	// Make the objects
	public static ExtentReports extent; // Subject
	public static ExtentSparkReporter spark; // Observer
	public static ExtentTest test;

	@BeforeMethod
	public void initializeAddToCartTest() {
		extent = ExtentReportBaseManager.getReports(); // using OOP concept

		test = extent.createTest("Add To Cart Test");

	}

	@Test
	public void addToCartTest() {
		test.log(Status.INFO, "Item selected");
		test.log(Status.INFO, "Order qty. selected");
		test.log(Status.INFO, "Clicked on Add To Cart button");
		test.log(Status.PASS, "Add To Cart test passed");
	}

	@AfterMethod
	public void finish() {
		extent.flush();
	}

}
