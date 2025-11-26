package Day40;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromConfigFile {

	public static void main(String[] args) throws IOException {
			
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\NewConfig.properties");

		
		Properties pobj = new Properties();
		
		pobj.load(file);
		
		//Reading data from property file
		String url = pobj.getProperty("URL");
		
		String name = pobj.getProperty("Name");
		
		String email = pobj.getProperty("Email");
		
		String phone = pobj.getProperty("Phone");
		
		String address = pobj.getProperty("Address");
		
		System.out.println(url);
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(address);
		
		
		
		System.out.println(pobj.stringPropertyNames());
		
		System.out.println(pobj.values());
	}

}
