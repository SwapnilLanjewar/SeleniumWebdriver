package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set windowid = driver.getWindowHandles();
		
		List<String> windowlist = new ArrayList(windowid);
		String parentid = windowlist.get(0);
		String childid = windowlist.get(1);
		
		driver.switchTo().window(childid);
		WebElement titleofpage = driver.findElement(By.xpath("//title[contains(text(),'Human Resources Management Software | HRMS | Orang')]"));
		titleofpage.equals("Human Resources Management Software | HRMS | Orang");
		
		System.out.println("Match found Test is passed");
		}

}
