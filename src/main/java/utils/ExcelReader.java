package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public FileInputStream fis = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	String Path = null;
	String cellValue;
	
	/*Accessing the Excel data from our machine*/
	public ExcelReader()  {
				try {
			fis = new FileInputStream("E:\\Selenium\\base\\Data\\dataSet.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = workbook.getSheetAt(0);
	}
	
	/*provide number of Rows in sheet*/
	public int getsheetRows(String SheetName) {
		int index = workbook.getSheetIndex(SheetName);
		sheet = workbook.getSheetAt(index);
		return(sheet.getLastRowNum() +1);
	}
	/*provide total no of columns in sheet*/
	public int getSheetColoumns(String SheetName) {
		int index = workbook.getSheetIndex(SheetName);
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(0);
		return(row.getLastCellNum());
	}
	/*provide cellvalue -testdata*/
	public String getCellData(String SheetName, int colNum, int rowNum) {
		int index = workbook.getSheetIndex(SheetName);
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		if(cell.getCellType()==CellType.STRING) {
			 cellValue=cell.getStringCellValue();
		}
		else if(cell.getCellType()==CellType.NUMERIC){
			Double cellValueint=cell.getNumericCellValue();
			Long longValue = cellValueint.longValue();
			cellValue = new String(longValue.toString());
		}
		return cellValue;
	}
	/*provide cell value -testdata by passing the parameters*/
	public String getCellData(String SheetName, String colName, int rowNum) {
		
		int index = workbook.getSheetIndex(SheetName);
		sheet = workbook.getSheetAt(index);
		for (int i = 0; i < getSheetColoumns(SheetName); i++) {
			row = sheet.getRow(0);
			cell = row.getCell(i);
			if (cell.getStringCellValue().equals(colName)) {
				break;
			}
		}
		return cellValue;
	}
	
}


