package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable1Readdata {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		int rows = driver.findElements(By.xpath("//*[@name=\"BookTable\"]//tr")).size();
		System.out.println("Total rows: "+ rows);
		
		
		int column = driver.findElements(By.xpath("//*[@name=\"BookTable\"]//th")).size();
		System.out.println("Total rows: "+ column);
		
		String data = driver.findElement(By.xpath("//*[@name=\"BookTable\"]//tr[2]")).getText();
		System.out.println("Data info: "+ data);
		
	}

}
