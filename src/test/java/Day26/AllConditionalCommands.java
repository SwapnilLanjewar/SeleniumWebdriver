package Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllConditionalCommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

	    Boolean logostatus = driver.findElement(By.xpath("//h1[contains(text(),\"Automation Testing Practice\")]")).isDisplayed();
	    System.out.println("Status is: "+ logostatus);
	    
	    Boolean namestatus = driver.findElement(By.xpath("//*[@id=\"name\"]")).isEnabled();
	    System.out.println("Name field status: "+ namestatus);
	    
	    WebElement malebutton = driver.findElement(By.xpath("//*[@id=\"male\"]"));
	    
	    System.out.println("Male button status before:"+ malebutton.isSelected());
	    
	    Thread.sleep(5000);
	    
	    malebutton.click();
	    
	    System.out.println("Male button status after:"+ malebutton.isSelected());
	    
	    
	    Boolean headingstatus = driver.findElement(By.xpath("//*[@class=\"description\"]")).isDisplayed();
	    
	    System.out.println("Heading status is:"+ headingstatus);
	    
	    driver.quit();
	    
	}

}
