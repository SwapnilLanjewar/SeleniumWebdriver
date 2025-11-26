package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drpcountry =driver.findElement(By.xpath("//select[@id='country']"));
	
		
		Select drpcountryele = new Select(drpcountry);
		
		drpcountryele.selectByContainsVisibleText("India");
		
		Thread.sleep(5000);
		
		drpcountryele.selectByIndex(3);
		
		Thread.sleep(5000);
		
		drpcountryele.selectByValue("japan");
		
		
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='country']"));
		
		
		for(WebElement op:  options) 
		{
			System.out.println(op.getText());
		}
		
		
	}

}
