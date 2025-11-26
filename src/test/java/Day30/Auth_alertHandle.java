package Day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auth_alertHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
			
		driver.get("https://admin:admin@the-internet.hackerearth.com/basic_auth");
		
		driver.manage().window().maximize();
		
	}

}
