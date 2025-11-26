package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownExample3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
	
		WebElement colourelement = driver.findElement(By.xpath("//select[@id='colors']"));
		
		Select colour = new Select(colourelement);
		colour.selectByIndex(2);
		
		System.out.println("Testcase passed");
		
		
		List<WebElement> c = colour.getOptions();
		
		System.out.println("Total options are: "+ c.size());
		
		
		
		for(int i = 0; i<=c.size(); i++) 
		{
			System.out.println(c.get(i).getText());
		}
		
		
		
	}
	

}
