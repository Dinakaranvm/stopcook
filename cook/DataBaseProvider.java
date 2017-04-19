package cook;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataBaseProvider {
	
	
	public String[][] getDataFromExcel() throws IOException{
		int rowCount, colCount;
		
		FileInputStream fis = new FileInputStream("D:\\Test Leaf\\Stopcook.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(0);
		rowCount= sheet.getLastRowNum();
		colCount= sheet.getRow(0).getLastCellNum();
		String [][]obj= new String[rowCount][colCount];
		
		
		for (int i=1;i<=rowCount;i++){
			
			XSSFRow row= sheet.getRow(i);
			
			for (int j=0;j<colCount;j++){
				
				XSSFCell cell = row.getCell(j);
					
					obj[i-1][j]= cell.getStringCellValue();
					//obj[i][j]= cell.getNCellValue();
				
			}
			
			
			
		}
		
		return obj;
		
			
		
	}
}

	

