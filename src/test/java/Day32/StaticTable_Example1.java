package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable_Example1 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@name=\"BookTable\"]//tr"));
		
		System.out.println("Row size is: "+ rows.size());
		
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@name=\"BookTable\"]//tr[1]//th"));
		
		System.out.println("Column size is: "+ columns.size());
		
		
		
		driver.quit();
		
		
	}

}
