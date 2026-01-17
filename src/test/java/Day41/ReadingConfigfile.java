package Day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingConfigfile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Automation\\myworkspace\\SeleniumWebdriver\\testdata\\cardetails");
		
		Properties pobj = new Properties();
		pobj.load(file);
		
		String car1 = pobj.getProperty("Hyundai");
		String car2 = pobj.getProperty("Kia");
		String car3 = pobj.getProperty("Toyota");
		String car4 = pobj.getProperty("Maruti");
		String car5 = pobj.getProperty("Tata");
		
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		System.out.println(car5);
		
		
		file.close();
		System.out.println("Data is received successfully");
		
	}

}
