package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public String[][] readExcel(String fileName) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		// to get into worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowNum = ws.getLastRowNum();
		System.out.println(rowNum);
		
		int cellNum = ws.getRow(1).getLastCellNum();
		System.out.println(cellNum);
		
		//to declare 2D array
		
		String[][] data = new String[rowNum][cellNum];
		
		for (int i = 1; i <=rowNum; i++) {
			for (int j = 0; j < cellNum; j++) {
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				
				//first value of i is 1, but i want to save it 0; so we are using i-1
				 data[i-1][j]=cellValue; 
				/* System.out.print(cellValue+" "); */
			}
			
		}
		
		
		// to get no of rows
		
		//int rowNum = ws.getLastRowNum();
		//System.out.println(rowNum);
		
		// to get no of clo
		
		//int cellNum = ws.getRow(0).getLastCellNum();
		//System.out.println(cellNum);
		
		// to get all values
		wb.close();
		return data;
		
		
	}
}


