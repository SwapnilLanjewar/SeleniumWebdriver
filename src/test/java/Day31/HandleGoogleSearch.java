package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleGoogleSearch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("Selenium");
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		
		for(WebElement op:options) 
		{
			System.out.println(op.getText());
		}
		
	}

}
