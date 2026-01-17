package PracticeDemo2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAlertMain {

	WebDriver driver;

	TestAlertMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "button#alertBtn")
	WebElement simplealert;
	@FindBy(css = "button#confirmBtn")
	WebElement confirmalert;
	@FindBy(css = "button#promptBtn")
	WebElement promptalert;

	public void click_simplealert() throws InterruptedException {
		simplealert.click();

		Alert alt = driver.switchTo().alert();
		Thread.sleep(5000);
		alt.accept();
	}
	
	public void click_confirmalert() throws InterruptedException 
	{
		
		confirmalert.click();
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(5000);
		alt.dismiss();
	}
	
	public void click_promptalert() throws InterruptedException 
	{
		
		promptalert.click();
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(5000);
		alt.accept();
	}

}
