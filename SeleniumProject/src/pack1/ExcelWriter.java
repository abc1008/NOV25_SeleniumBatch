package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter
{

	public static void main(String[] args) throws IOException
	{

//		Read Data From Excel: 

		String path = "D:\\TRAININGS\\NOV_25_BATCH\\Excel File.xlsx";
		FileInputStream file = new FileInputStream(path); // Letting java know about file path

		XSSFWorkbook wb = new XSSFWorkbook(file); // open file
		XSSFSheet sheet = wb.getSheet("Sheet2"); // decide sheet
		XSSFRow row1 = sheet.getRow(5); // decide row
		XSSFCell cell = row1.getCell(2); // decide cell

		FileOutputStream fOut = new FileOutputStream(path); // Letting java know about file path
		cell.setCellValue("update2"); // writing the data

		
//		Write data in blank cells
		XSSFRow createdRow = sheet.createRow(7);
		XSSFCell createdCell = createdRow.createCell(3);

		createdCell.setCellValue("New Data");

		wb.write(fOut); // save file
		wb.close(); // close file
		
		System.out.println("Completed");
		
		
//		Always make sure file is closed before writing the data using automation.

	}

}
