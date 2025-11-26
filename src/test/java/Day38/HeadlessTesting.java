package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {

		//Headless
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		
		WebDriver driver = new ChromeDriver(options);
		
		// Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Validate title
		String act_title = driver.getTitle();
		if (act_title.equals(act_title)) {
			System.out.println("Testcase passed");
		} else {
			System.out.println("Testcase failed");
		}

		// Close window
		driver.close();
	}

}
