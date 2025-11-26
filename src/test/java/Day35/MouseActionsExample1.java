package Day35;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsExample1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement pointmebutton = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(pointmebutton).build().perform();
		
		System.out.println("Testcase passed");
		
		List<WebElement> op = driver.findElements(By.xpath("//*[@class=\"dropdown-content\"]"));
		
		System.out.println(op.size());
		
		
		for(int i = 0 ; i<=op.size() ; i++) 
		{
		System.out.println(op.get(i).getText());
		}
		
		
	}

}
