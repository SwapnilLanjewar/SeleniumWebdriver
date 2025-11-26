package Day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(myurl);
		*/
		
		
		//navigate().to()
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.err.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
	}

}
