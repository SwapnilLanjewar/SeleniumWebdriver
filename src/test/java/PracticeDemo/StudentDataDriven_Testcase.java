package PracticeDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentDataDriven_Testcase {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Automation\\myworkspace\\SeleniumWebdriver\\testdata\\Studentdata.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet  sheet = workbook.getSheet("Studentdata");
		
		for(Row row : sheet) 
		{
			for(Cell cell : row) 
			{
				System.out.println(cell.toString() + "\t");
			}
			System.out.println();
		}

	}

}
