package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectdropdownExample1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpCountry = new Select(drpCountryEle);
		
		//drpCountry.selectByIndex(5);
		drpCountry.selectByVisibleText("India");
		//drpCountry.selectByValue("canada");
		
		//Capture options from the dropdown
		List<WebElement> optioncount = drpCountry.getOptions();
		System.out.println(optioncount.size());
		
		
		for(int i=0; i<optioncount.size();i++) 
		{
			System.out.println(optioncount.get(i).getText());
		}
		
	}

}
