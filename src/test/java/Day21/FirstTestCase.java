package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1. Launch browser
 2. Open URL https://demo.opencart.com/
 3. Validate title should be "Your store"
 4. Close browser
 */
public class FirstTestCase {

	public static void main(String[] args) {

		//Launch browser
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Validate title
		String act_title = driver.getTitle();
		if(act_title.equals(act_title)) 
		{
			System.out.println("Testcase passed");
		}
		else 
		{
			System.out.println("Testcase failed");
		}
		
		
		//Close window
		driver.close();
	}

}
