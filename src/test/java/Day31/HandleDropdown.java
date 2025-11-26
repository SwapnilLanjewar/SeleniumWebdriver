package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()=\"PIM\"]")).click();
		driver.findElement(By.xpath("(//*[@class=\"oxd-select-text-input\"])[3]")).click();
		//driver.findElement(By.xpath("//*[@class=\"oxd-select-option\"]//*[text()=\"Content Specialist\"]")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> options = driver.findElements(By.xpath("//*[@role=\"option\"]"));
		System.out.println("Total number of options: " + options.size());
		
		//Print all the options from the dropdown
		for(WebElement op : options) 
		{
			System.out.println(op.getText());
		}
		
		driver.findElement(By.xpath("//*[@class=\"oxd-userdropdown-tab\"]")).click();
		driver.findElement(By.xpath("//*[@role=\"menuitem\"][contains(text(),\"Logout\")]")).click();
		
		driver.quit();
		
	}

}
