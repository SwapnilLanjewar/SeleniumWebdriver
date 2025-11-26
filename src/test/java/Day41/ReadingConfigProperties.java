package Day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingConfigProperties {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\Config.properties");

		Properties propertiesobj = new Properties();
		propertiesobj.load(file);

		String url = propertiesobj.getProperty("URL");
		String id = propertiesobj.getProperty("id");
		String password = propertiesobj.getProperty("password");
		String applicationname = propertiesobj.getProperty("Applicationname");

		System.out.println(url);
		System.out.println(id);
		System.out.println(password);
		System.out.println(applicationname);

	}

}
