package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement inputname = driver.findElement(By.xpath("//input[@id=\"name\"]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','Peter')", inputname);

		WebElement malebtn = driver.findElement(By.xpath("//input[@id=\"male\"]"));
		
		js.executeScript("arguments[0].click()", malebtn);
		

	}

}
