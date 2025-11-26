package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement Countryelement = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select drpCountry = new Select(Countryelement);
		
		//Select option from dropdown
		//drpCountry.selectByVisibleText("France");
		//drpCountry.selectByValue("india");
		//drpCountry.selectByIndex(2);
		
		
		
		//Capture the options from the dropdown
		List<WebElement> options = drpCountry.getOptions();
		System.out.println(options.size());
		
		//Print using normal for loop
		/*
		for(int i = 0;i<=options.size();i++) 
		{
			System.out.println( options.get(i).getText());
		}
		*/
		
		
		//Print using enhanced for loop
		for(WebElement op: options) 
		{
			System.out.println(op.getText());
		}
		
		
	}

}
