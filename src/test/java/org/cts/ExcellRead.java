package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellRead {
 public static void main(String[] args) throws IOException {
	 
  File f = new File("C:\\Users\\prsannt\\eclipse-workspace\\ProjectFrameWork\\src\\test\\resources\\Excell\\excell proj.xlsx");
 
  FileInputStream finput = new FileInputStream(f);  // to READ d file v use this.
  
  Workbook w =new XSSFWorkbook(finput);
  
  Sheet s = w.getSheet("project");
 
  Row r = s.getRow(1);
 
  Cell c = r.getCell(6);
 
 System.out.println(c);
  
   //to get particular words in excell; this one 
 
   int prow = s.getPhysicalNumberOfRows();
   System.out.println(prow);
 
 
  int pcell = r.getPhysicalNumberOfCells();
  System.out.println(pcell);
 
 
}
}