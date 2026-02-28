package pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader
{
	
	public static void main(String[] args) throws IOException
	{
		
		
//		Read Data From Excel: 
		
//		String path = "D:\\TRAININGS\\NOV_25_BATCH\\Excel File.xlsx";
//		FileInputStream file = new FileInputStream(path); // Letting java know about file path
//		
//		XSSFWorkbook wb = new XSSFWorkbook(file); // open file
//		XSSFSheet sheet = wb.getSheet("Sheet2"); // decide sheet
//		XSSFRow row1 = sheet.getRow(1); // decide row
//	 	XSSFCell cell = row1.getCell(2); // decide cell
////	 	String data = cell.getStringCellValue();  // read String data  
//	 	
//	 	double numData = cell.getNumericCellValue();  // read Numeric data 
//		
//		System.out.println(numData);
		
		
//		Row : 0 to 2
//		col : 1 to 2
		
		String path = "D:\\TRAININGS\\NOV_25_BATCH\\Excel File.xlsx";
		FileInputStream file = new FileInputStream(path); // Letting java know about file path
		
		XSSFWorkbook wb = new XSSFWorkbook(file); // open file
		XSSFSheet sheet = wb.getSheet("Sheet2"); // decide sheet
		
		
		for(int row = 0; row <= 2; row++) // 2
		{
			for(int col = 1; col<=2; col++) // 3
			{
				XSSFRow row1 = sheet.getRow(row); // decide row      0
			 	XSSFCell cell = row1.getCell(col); // decide cell    2
			 	String data = cell.getStringCellValue();  // read String data     (0,1) (0,2)
//			 	double numData = cell.getNumericCellValue();  // read Numeric data 
				System.out.print(data + " ");
			}
			System.out.println();  // next line
		}
		
		
		
	}

}
