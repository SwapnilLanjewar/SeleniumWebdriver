package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataDemo1 {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\CarData2.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int row = sheet.getLastRowNum();

		int cell = sheet.getRow(0).getLastCellNum();

		for (Row row1 : sheet) {
			for (Cell cell1 : row1) {
				System.out.println(cell1.toString() + "\n");
			}
			System.out.println(" ");
		}

		workbook.close();
		file.close();

		System.out.println("File is successfully passed");
	}

}
