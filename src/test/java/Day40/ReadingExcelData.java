package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelData {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		
		int totalcell = sheet.getRow(1).getLastCellNum();
		
		
		System.out.println(rows);
		System.out.println(totalcell);
		
		for (int i = 0; i <= rows; i++) {
		    Row row = sheet.getRow(i);
		    if (row == null) continue;

		    for (int j = 0; j < totalcell; j++) {
		        Cell cell = row.getCell(j);
		        if (cell == null) {
		            System.out.print("EMPTY | ");
		            continue;
		        }

		        CellType type = cell.getCellType();

		        for (int k = 0; k < 1; k++) { // Dummy loop to avoid if-else
		            boolean isString = type == CellType.STRING;
		            boolean isNumeric = type == CellType.NUMERIC;
		            boolean isBoolean = type == CellType.BOOLEAN;
		            boolean isFormula = type == CellType.FORMULA;
		            boolean isBlank = type == CellType.BLANK;

		            if (isString) System.out.print(cell.getStringCellValue() + " | ");
		            if (isNumeric && !DateUtil.isCellDateFormatted(cell)) System.out.print(cell.getNumericCellValue() + " | ");
		            if (isNumeric && DateUtil.isCellDateFormatted(cell)) System.out.print(cell.getDateCellValue() + " | ");
		            if (isBoolean) System.out.print(cell.getBooleanCellValue() + " | ");
		            if (isFormula) System.out.print(cell.getCellFormula() + " | ");
		            if (isBlank) System.out.print("BLANK | ");
		        }
		    }
		    System.out.println(); // New line after each row
		}
		
		
		workbook.close();
		file.close();
	
		
		
	}

}
