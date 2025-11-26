package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
	
		WebElement username = driver.findElement(By.name("search"));
		username.sendKeys("Admin");
		
		//driver.findElement(By.name("username")).sendKeys("Admin");       //Another way to user the statement
		
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		driver.close();
		
	}

}
