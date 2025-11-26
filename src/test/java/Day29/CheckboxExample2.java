package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> colors = driver.findElements(By.xpath("//select[@id=\"colors\"]"));
		System.out.println(colors.size());

		for(int i = 0;i<colors.size();i++) 
		{
			System.out.println(colors.get(i).getText());
		}
	}

}
