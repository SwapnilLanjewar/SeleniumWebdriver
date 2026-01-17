package PracticeDemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAutomationPageclass {

	WebDriver driver;
	WebDriverWait mywait;

	TestAutomationPageclass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy(css = "input#name")
	WebElement name;
	@FindBy(xpath = "//h1[normalize-space()='Automation Testing Practice']")
	WebElement heading;
	@FindBy(xpath = "//img[@class='wikipedia-icon']") WebElement wikipediaicon;

	public void set_name() {
		name.sendKeys("Peter");
	}

	public void verify_title() {
		mywait.until(ExpectedConditions.visibilityOf(heading));
	}
	
	public void wikipedia_window() 
	{
		String parentwindow = driver.getWindowHandle();
		wikipediaicon.click();
		
		Set<String> childwindow = driver.getWindowHandles();
		 for(String handle:  childwindow) 
		 {
			 System.out.println(handle);
			 
			 if(!parentwindow.equals(handle)) 
			{
				 driver.switchTo().window(handle);
				 driver.getTitle();
				 driver.get(handle);
			}
			 System.out.println("---------");
			 driver.switchTo().window(parentwindow);
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			 
		 }
		
		
	}

}
