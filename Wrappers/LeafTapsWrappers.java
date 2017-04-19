
package Wrappers;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import cook.DataBaseProvider;


public class LeafTapsWrappers extends GenericWrappers {
	
		
	
	@DataProvider(name="fromExcel")
	public Object[][] getData() throws IOException{
		DataBaseProvider db= new DataBaseProvider();
		
		return db.getDataFromExcel();		
	}	
	


}






