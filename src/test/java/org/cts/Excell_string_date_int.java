package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell_string_date_int {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\prsannt\\eclipse-workspace\\ProjectFrameWork\\src\\test\\resources\\Excell\\excell proj.xlsx");
		
		FileInputStream finput = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(finput);
		
		Sheet s = w.getSheet("project");
		
		// to get particular words in excell; this one 
		Row row = s.getRow(2);
		Cell cell = row.getCell(5);
		System.out.println(cell); // 
		
		
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			
			int cellType = c.getCellType();
			
			if (cellType==1) {
				String Value = c.getStringCellValue();
				System.out.println(Value);
				
			}
			else if (DateUtil.isCellDateFormatted(c)) {
				
				Date d = c.getDateCellValue();
				
				SimpleDateFormat simdatefr = new SimpleDateFormat("dd,mmm,yyyy");
				 String value = simdatefr.format(d);
				 System.out.println(value);
				
				
			}
			else {
				double d = c.getNumericCellValue();
				
				long l=(long)d;
				
				String value = String.valueOf(l);
				System.out.println(value);
				
			}
			}
		
		}
		
		}
	

}