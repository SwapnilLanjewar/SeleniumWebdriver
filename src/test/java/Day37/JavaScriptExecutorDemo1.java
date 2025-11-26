package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
	    WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
	    WebElement start = driver.findElement(By.xpath("//button[normalize-space()='START']"));
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    js.executeScript("arguments[0].setAttribute('value','John')",name);
	    
	    js.executeScript("arguments[0].click()",start);
	}

}
