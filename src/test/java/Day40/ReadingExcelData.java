package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelData {

    public static void main(String[] args) throws IOException {
        // Path to your Excel file
        String filePath = "C:\\Automation\\myworkspace\\SeleniumWebdriver\\testdata\\StateData.xlsx";

        // Open the file
        FileInputStream fis = new FileInputStream(filePath);

        // Load workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // Load sheet by name
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        // Get total rows
        int rowCount = sheet.getLastRowNum();

        // Get total columns (from first row)
        int colCount = sheet.getRow(0).getLastCellNum();

        System.out.println("Rows: " + rowCount + " | Columns: " + colCount);

        // Loop through rows and columns
        for (int i = 0; i <= rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell.toString() + " | ");
            }
            System.out.println();
        }

        // Close resources
        workbook.close();
        fis.close();

        System.out.println("Excel data read successfully!");
    }
}