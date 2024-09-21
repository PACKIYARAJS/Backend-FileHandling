package sample1.sample12;
import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExceldata {
	
	public void Writedata() throws Exception{
		
        XSSFWorkbook workbook = new XSSFWorkbook();
	    
	    XSSFSheet sheet = workbook.createSheet("Sheet1");
	    
	    sheet.createRow(0).createCell(1).setCellValue("NAME");
	    
	    sheet.createRow(0).createCell(2).setCellValue("AGE");
	    
	    sheet.createRow(1).createCell(1).setCellValue("RAJ");
	    
	    sheet.createRow(1).createCell(2).setCellValue(21);
	    
	    File file = new File ("C:\\Users\\AGASH\\eclipse-workspace\\FILE READ AND WRITE\\Excel2.xlsx");
	    
	    FileOutputStream write = new FileOutputStream(file);
	    
	    workbook.write(write);
	    
	    workbook.close();
	    
	    System.out.print("Done");
		
	}
	
	public static void main(String[] args) throws Exception{
		
		new WriteExceldata().Writedata();
	}

}
