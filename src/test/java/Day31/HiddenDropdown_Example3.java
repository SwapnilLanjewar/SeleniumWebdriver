package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown_Example3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@value=\"IN\"]")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> countrynames = driver.findElements(By.xpath("//*[@name=\"country\"]//option"));
		
		System.out.println(countrynames.size());
		
		
		for(WebElement ct :countrynames) 
		{
			System.out.println(ct.getText());
		}
		
		
		driver.findElement(By.xpath("//*[@value=\"IN\"]")).click();
		
	
	}

}
