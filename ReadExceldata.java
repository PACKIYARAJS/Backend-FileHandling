package sample1.sample12;
import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

                     // READ INDEX FORMAT OF EXCEL FILE SHEET

public class ReadExceldata {
	
/*	public void readdata() throws Exception{
		
		String path = "C:\\Users\\AGASH\\OneDrive\\Desktop\\java-practice\\Excel.xlsx";
		
		File file = new File(path);
		
		FileInputStream read = new FileInputStream (file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(read);
		
		XSSFSheet sheets = workbook.getSheet("Sheet1");
		
		XSSFRow rows = sheets.getRow(1);
		
		XSSFCell cells = rows.getCell(2);	
		
		String celldata = cells.getStringCellValue();
		
		System.out.println(celldata);
		
	}*/
	
	
	
	                // READ ENTIRE EXCEL FILE SHEET
	
	    public void readdata() throws Exception{
	    	
	    	String path = "C:\\Users\\AGASH\\eclipse-workspace\\FILE READ AND WRITE\\Excel.xlsx";
	    	
	    	File file = new File (path);
	    	
	    	FileInputStream read = new FileInputStream(file);
	    	
	    	XSSFWorkbook workbook = new XSSFWorkbook(read);
	    	
	    	XSSFSheet sheets = workbook.getSheet("Sheet1");
	    	
	    	int countrow = sheets.getLastRowNum()-sheets.getFirstRowNum();
	    	
	    	for(int i=0; i<=countrow; i++) {
	    		
	    		int countcell = sheets.getRow(i).getLastCellNum();
	    		
	    		System.out.println("Row Data "+i);
	    		
	    		for (int j=0; j<countcell; j++) {
	    			
	    			System.out.print(sheets.getRow(i).getCell(j).getStringCellValue()+ ", ");
	    		}
	    		
	    		System.out.println();
	    		
	    	}
	    	
	    }
	
   public static void main(String[] args) throws Exception {
	   ReadExceldata r = new ReadExceldata();
	   r.readdata();
   }
	

}
