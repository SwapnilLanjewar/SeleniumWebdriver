package Day40;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadStudentDataDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\Studentdata.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		/*
		 * XSSFRow row = sheet.getRow(0);
		 * 
		 * XSSFCell cell = row.getCell(0);
		 */

		for (Row row : sheet) {
			for (Cell cell : row) {
				System.out.println(cell.toString() + "\t");
			}
			System.out.println();
		}

		workbook.close();
		file.close();

	}

}
