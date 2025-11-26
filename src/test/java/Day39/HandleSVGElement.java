package Day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSVGElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()=\"PIM\"]//*[name()=\"svg\"]")).click();
		
		String title = driver.findElement(By.xpath("//div[@class=\"oxd-topbar-header\"]//h6")).getText();
		
		if(title.equals("PIM")) 
		{
			System.out.println("Testcase passed");
		}
		else
		{
			System.out.println("Testcase failed");
		}
		
		driver.quit();
	}

}
