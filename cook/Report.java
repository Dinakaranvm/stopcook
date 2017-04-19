package cook;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public abstract class Report{
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testCaseName, testDescription;
	
		public ExtentReports extentReportGenerator(){
		extent = new ExtentReports("./reportstopcook/result.html", false);
		extent.loadConfig(new File("./src/main/resourcesstopcook/extent-config.xml"));
		return extent;
		}
		public ExtentTest startTestCase(){
		test = extent.startTest(testCaseName, testDescription);
		return test;
		}

}
