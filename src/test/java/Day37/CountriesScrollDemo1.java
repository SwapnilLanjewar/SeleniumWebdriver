package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountriesScrollDemo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	    
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    
	    js.executeScript("window.scrollBy(0,1600)"," ");
	   
	   
	    WebElement target = driver.findElement(By.xpath("//td[normalize-space()='India']"));
	    js.executeScript("arguments[0].scrollIntoView()",target);
	  
	    
	}

}
