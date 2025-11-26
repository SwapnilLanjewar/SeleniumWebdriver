package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDatainExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(
				System.getProperty("user.dir") + "\\testdata\\Myfile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("Data");

		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("John");
		row1.createCell(1).setCellValue(true);

		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Peter");
		row2.createCell(1).setCellValue(false);

		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("Adam");
		row3.createCell(1).setCellValue(true);

		workbook.write(file);
		
		workbook.close();
		file.close();
		
		System.out.println("File is created");

	}

}
