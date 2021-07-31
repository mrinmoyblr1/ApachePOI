import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		XSSFWorkbook workbook=new XSSFWorkbook(new FileInputStream("D:\\Study\\POI\\Test.xlsx"));
		System.out.println(workbook.getSheetAt(0).getRow(1).getCell(2).getStringCellValue());
		
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testData"))
			{			
			XSSFSheet sheet=workbook.getSheetAt(i);
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
