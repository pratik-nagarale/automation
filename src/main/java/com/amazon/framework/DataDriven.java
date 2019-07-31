package com.amazon.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class DataDriven  {
	
	@Test
	public void readExcel() throws IOException{
	FileInputStream filepath = new FileInputStream("E://Project//ProjectLearning//amazon_test//src//test//resources//TestData.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(filepath);
	
	int sheets = workbook.getNumberOfSheets();
	for(int i=0;i<sheets;i++){
		workbook.getSheetName(i).equalsIgnoreCase("Sheet1");
		XSSFSheet sheet = workbook.getSheetAt(i);
		
		Iterator<Row> rows =sheet.iterator();//collection of row
		Row firstrow = rows.next();
		Iterator<Cell> cell= firstrow.cellIterator(); //row is collection of cell
		int k=0;
		int column=0;
		while(cell.hasNext()){
			Cell value=cell.next();
			if(value.getStringCellValue().equals("Testcases")){
				//desired column
				column = k;
			}
			k++;
		}
		System.out.println(column);
			//scan row in first column
		while (rows.hasNext()){
		Row r= rows.next();
		if(r.getCell(column).getStringCellValue().equals("Add Profile")){
			//pull all the data of that row
			Iterator<Cell> cv =r.cellIterator();
			while(cv.hasNext()){
			System.out.println(cv.next().getStringCellValue());
			}
			}
		}
	  }
	
	}
}
