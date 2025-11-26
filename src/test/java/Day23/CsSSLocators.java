package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsSSLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();

		// Tag id ------------> tag#id
		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone");
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Samsung");

		// Tag class ---------> tag.classname
		// driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Headphone");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Headphone");
		
		//Tag attribute ------> tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Nokia");
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Nokia");
		
		//Tag class attribute ------> tag.classname[attribute="value"]
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Airpods");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Airpods");
	}

}
