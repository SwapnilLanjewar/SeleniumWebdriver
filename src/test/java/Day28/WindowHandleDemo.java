package Day28;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {

		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//*[text()=\"OrangeHRM, Inc\"]")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		List<String>  windowList = new ArrayList(windowIds);
		
		String parentId = windowList.get(0);
		String childid = windowList.get(1);
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
	}

}
