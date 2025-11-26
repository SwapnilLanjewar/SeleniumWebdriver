package Day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownDemo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practice.expandtesting.com/dropdown");

		/*
		 * WebElement countryoptions =
		 * driver.findElement(By.xpath("//select[@id='country']")); Select countryname =
		 * new Select(countryoptions); countryname.selectByContainsVisibleText("India");
		 */

		driver.findElement(By.xpath("//select[@id='dropdown']")).click();

		driver.findElement(By.xpath("//*[contains(text(),\"Option 2\")]")).click();

	}

}
