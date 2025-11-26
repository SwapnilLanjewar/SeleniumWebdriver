package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		Thread.sleep(5000);
         
		WebElement logo = driver.findElement(By.xpath("//*[@alt=\"nopCommerce demo store\"]"));
		System.out.println("Is logo displayed: " + logo.isDisplayed());
		
		Boolean newsletter = driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).isEnabled();
		System.out.println("Is newsletter enabled:"+ newsletter);
		
		driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
		
		System.out.println("Is newsletter disabled:" + newsletter);
		
		WebElement beforeclick =driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		System.out.println("Before click:" + beforeclick.isSelected());
		
		driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		
		WebElement afterclick = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		System.out.println("After click:" + afterclick.isSelected());
		
		
		
		
		
	}

}
