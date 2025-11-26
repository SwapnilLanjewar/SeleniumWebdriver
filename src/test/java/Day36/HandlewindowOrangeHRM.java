package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlewindowOrangeHRM {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		List<String> id = new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(id.get(1));
		
		driver.findElement(By.xpath("//div[@id='CybotCookiebotDialogBodyContentTitle']")).isDisplayed();
		
		System.out.println("Testcase is passed in new tab");
		driver.close();
		
		driver.switchTo().window(id.get(0));
		
		driver.findElement(By.xpath("//h5[normalize-space()='Login']")).isDisplayed();
		
		System.out.println("Testcase is passed in old tab");
		
		driver.quit();
		
		
	}

}
