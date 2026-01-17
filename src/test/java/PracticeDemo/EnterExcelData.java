package PracticeDemo;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EnterExcelData {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Automation\\myworkspace\\SeleniumWebdriver\\testdata\\Carinfo.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Car");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.getCell(0).setCellValue("Hyundai");
		row1.getCell(1).setCellValue("Maruti");
		row1.getCell(2).setCellValue("Toyota");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.getCell(0).setCellValue("Hyundai");
		row2.getCell(1).setCellValue("Maruti");
		row2.getCell(2).setCellValue("Toyota");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		
		
	}

}
