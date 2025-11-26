package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
     	driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@placeholder=\"Search store\"]")).isDisplayed();
	

	}

}
