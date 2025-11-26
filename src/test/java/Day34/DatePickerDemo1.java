package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		
		
		//Switch to frame
		driver.switchTo().frame(0);
		
		//Method using sendkeys
		//driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("08/26/2025");
		
		
		//Method 2
		String date = "26";
		String month = "August";
		String year = "2026";
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		//Select month and year
		while(true) 
		{
			String currentmonth = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
			String currentyear = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
			
			if(currentmonth.equals(month) && currentyear.equals(year)) 
			{
				break;
			}
			
			driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
			
			
			//select the date
			List<WebElement> dates = driver.findElements(By.xpath("//*[@data-handler=\"selectDay\"]"));
			for(WebElement dt : dates) 
			{
				if(dt.getText().equals(date)) 
				{
					dt.click();
					break;
				}
			}
			
		}
		
	}

}
