package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	//read date from IPL sheet
	//implementation of data from Excel

 //Read multiple value or data from excel sheet by using for loop
	
	
	
	for(int i=1;i<=10;i++)
	{
	
	
	
	FileInputStream fis = new FileInputStream("./data/TestData.xlsx"); //Provide the path of File
	
	Workbook wb = WorkbookFactory.create(fis);// make the file ready to read   
    
	   Sheet sheet = wb.getSheet("IPL");//get into the sheet
		
       Row row = sheet.getRow(i); //get into the desire row

        Cell cell = row.getCell(1);   //get  into desire column or cell
        
        String data = cell.getStringCellValue();//read the data
   Thread.sleep(2000);
        System.out.println(data);
}
}
}