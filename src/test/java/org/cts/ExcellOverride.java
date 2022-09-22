package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellOverride {
	public static void main(String[] args) throws IOException {
		 
		  File f = new File("C:\\Users\\prsannt\\eclipse-workspace\\ProjectFrameWork\\src\\test\\resources\\Excell\\excell proj.xlsx");
		 
		  FileInputStream finput = new FileInputStream(f);  // to READ d file v use this.
		  
		  Workbook w =new XSSFWorkbook(finput);
		  
		  Sheet s = w.getSheet("project");
		 
		 Row r = s.getRow(2);
		 Cell c = r.getCell(5);
		
		 int cellType = c.getCellType();
		
		 if (cellType==1) {
			String value = c.getStringCellValue();
			
		  if (value.equals("sss")) {
				c.setCellValue("AAAA");
				
			
				FileOutputStream fout = new FileOutputStream(f);
				
				w.write(fout);
				System.out.println("Ohhho");	
			}
			
		}
		
	}
}

	

