package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDropdown1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.findElement(By.xpath("//*[@value=\"blue\"]")).click();
		
		
		//Capture options 
		WebElement colours = driver.findElement(By.xpath("//select[@id=\"colors\"]"));
		Select colourname = new Select(colours);
		
		List<WebElement> options = colourname.getOptions();
		System.out.println(options.size());
		
		
		//Print options in console
		for(int i = 0; i<options.size();i++) 
		{
			System.out.println(options.get(i).getText());
		}
		
	

		
		 
	}

}
