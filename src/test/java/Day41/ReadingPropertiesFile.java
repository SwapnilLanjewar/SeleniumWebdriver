package Day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Config.properties");
		
		
		//Loading properties file
		Properties propertiesobj = new Properties();
		propertiesobj.load(file);
		
		//Reading data from properties file
		String url = propertiesobj.getProperty("URL");
		String id = propertiesobj.getProperty("id");
		String password = propertiesobj.getProperty("password");
		
		System.out.println(url + "  " + id + "  " + password + "  " );
		
		
		//Reading all keys from property file
		Set<String> keys = propertiesobj.stringPropertyNames();
		System.out.println(keys);
		
		
		//Reading all keys from property file
	    Collection<Object> value = propertiesobj.values();
		System.out.println(value);
		
	}
	

}
