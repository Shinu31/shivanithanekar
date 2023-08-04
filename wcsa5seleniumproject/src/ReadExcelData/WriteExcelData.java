package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//write the date in excel sheet
		
		
	    FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.createRow(11);         
	
		
		//create cell by using cell
		Cell cell = row.createCell(0);
	    
	   //write the data in cell
		cell.setCellValue("Pune");
		
		
		FileOutputStream fos=new FileOutputStream("./data/Testdata.xlsx");
	    wb.write(fos);
	}
	
	

}
