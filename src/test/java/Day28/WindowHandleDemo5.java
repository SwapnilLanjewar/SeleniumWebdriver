package Day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo5 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).click();
		
		Set<String> WindowIds = driver.getWindowHandles();
		
		for(String Winid: WindowIds) 
		{
			String title = driver.switchTo().window(Winid).getTitle();

			if(title.equals("Wikipedia, the free encyclopedia'")) 
			{
				driver.close();
			}
			
			
		}

	}

}
