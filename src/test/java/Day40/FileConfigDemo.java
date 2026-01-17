package Day40;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileConfigDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Automation\\myworkspace\\SeleniumWebdriver\\testdata\\Config.properties");

		Properties pobj = new Properties();
		
		pobj.load(file);
		
		String url = pobj.getProperty("URL");
		
		String id = pobj.getProperty("id");
		
	}

}
