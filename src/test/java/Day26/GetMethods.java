package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		//get(URL)
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		//getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		
		//getCurrenturl();
		System.out.println(driver.getCurrentUrl());
		
		//getPagesource();
		System.out.println(driver.getPageSource());
		
		//getWindowhandle();
		String windowid = driver.getWindowHandle();
		System.out.println("Window Id is: "+ windowid);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);
			
	}

}
