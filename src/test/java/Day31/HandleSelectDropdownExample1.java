package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDropdownExample1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://testautomationpractice.blogspot.com/");

		/*
		WebElement dropdowncountry = driver.findElement(By.xpath("//*[@id=\"country\"]"));

		Select drpcountry = new Select(dropdowncountry);
		*/
		
		// drpcountry.selectByContainsVisibleText("Austr");

		/*
		List<WebElement> options = drpcountry.getOptions();
		System.out.println(options.size());

		for (int i = 0; i <= options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		*/
		
		driver.get("https://practice.expandtesting.com/dropdown");
	
		List<WebElement> optionsfield = driver.findElements(By.xpath("//*[@id=\"dropdown\"]"));
		
		for(WebElement op: optionsfield) 
		{
			System.out.println(op.getText());
		}
	}

}
