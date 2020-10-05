package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	
	XSSFSheet sh;
	Row r;
	Cell c;

	public Excelread() throws IOException {

		 FileInputStream f= new FileInputStream("C:\\Users\\v-dhkar.REDMOND\\Desktop\\LoginSelenium.xlsx");

		 XSSFWorkbook w= new XSSFWorkbook(f);

	sh = w.getSheet("Sheet1");

	}
	
	public String readData(int i, int j) {
		
		String value="";
		
		r = sh.getRow(i);
		c = r.getCell(j);
		
		//System.out.println(c.getCellType());
		
		switch(c.getCellType()) {
		
		case NUMERIC:value=Double.toString(c.getNumericCellValue());
		 
		// System.out.println("value for numeric "+value);
		 
		 break;
		 
		case STRING:value=c.getStringCellValue();
		
		//System.out.println("value for String "+value);
		
		
		}
		
	
		 return value;
		
	}

}
