package extentReportBySarthak;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportBaseManager {

	// Make the objects globally at class level
	public static ExtentReports extent; // Subject
	public static ExtentSparkReporter spark; // Observer
	public static ExtentTest test;
	
	public static ExtentReports getReports() {
		if(extent == null) { // If subject is not making report, keeping it null
			extent = new ExtentReports(); // Tell extent to make new report
			
			// Set path of ExtentReport.html
			spark = new ExtentSparkReporter(System.getProperty("user.dir") + "\\extentReports\\ExtentReport.html");
			
			spark.config().setReportName("Srthak Extent Report"); // report name
			spark.config().setDocumentTitle("Login Test Extent Report"); // tab name
			spark.config().setTheme(Theme.DARK);
			spark.config().setEncoding("utf-8");
			spark.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
			
			// Attach reporter to extent object
			extent.attachReporter(spark);
		}
		return extent; // will return new report
	}
}
