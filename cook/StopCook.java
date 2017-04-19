
package cook;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Wrappers.LeafTapsWrappers;



public class StopCook extends LeafTapsWrappers{
	

	@Test(dataProvider="fromExcel")
	public void userRegisteration(String un, String pwd, String cnfpd) throws Exception {
		// TODO Auto-generated method stu
		
		
	
		invokeApp("chrome", "http://www.stopcook.com/demo/");//parametarize
		clickByXpath("//*[@id='header']/div[2]/nav/div/ul/li[2]/a");
		clickByClassName("signupclick");
		enterByName("customer_name", un);
		//enterByName("customer_phone", "data");
//		enterByName("address_title", "data");
//		enterByName("customer_street", "data");
//	    selectVisibileTextById("customer_city", "value");
//	    selectVisibileTextById("customer_area", "value");
//	    enterByXpath("//*[@id='customer_zip']", "data");
//		enterById("customer_email", "data");
		enterById("customer_password", pwd);
		enterById("customer_conpassword", cnfpd);
		clickByXpath("//*[@id='customer_terms']");
		clickByXpath("//*[@id='customerRegister']");
		
		
		ExtentReports extent = new ExtentReports("./reports/stopcook.html", false);
		ExtentTest test = extent.startTest("user Registeration");
		test.log(LogStatus.PASS, "stopcook user registration passed");
		//test.log(LogStatus.FAIL, "stopcook user registration failed");
		//test.log(LogStatus.INFO, "stopcook user registration Info");
		
		extent.flush();
	}
}
	


	


		
                 
	