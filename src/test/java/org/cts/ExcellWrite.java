package org.cts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellWrite {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\prsannt\\eclipse-workspace\\ProjectFrameWork\\src\\test\\resources\\Excell\\writeexcel.xlsx");
		
		boolean b = f.createNewFile();
		System.out.println(b);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.createSheet("Clarks");
		
		Row r = s.createRow(1);
		
		Cell c = r.createCell(1);
		
		c.setCellValue("CT");
		
		FileOutputStream fout = new FileOutputStream(f);
		
		w.write(fout);
		
		System.out.println("Ohho");
		
		
	}

}
