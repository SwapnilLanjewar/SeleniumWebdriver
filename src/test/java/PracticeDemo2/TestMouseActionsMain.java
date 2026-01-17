package PracticeDemo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestMouseActionsMain {
	
	WebDriver driver;
	Actions act;
	
	TestMouseActionsMain(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		act = new Actions(driver);
	}
	
	@FindBy(xpath = "//button[normalize-space()='Point Me']") WebElement pointme;
	@FindBy(xpath ="//button[normalize-space()='Copy Text']") WebElement copybutton;
	
	
	public void hover_pointme() 
	{
		act.moveToElement(pointme).build().perform();
		List<WebElement> items = driver.findElements(By.xpath("//div[@class=\"dropdown-content\"]/a"));
		System.out.println("Size of items is:" + items.size());
	}
	
	public void click_copybutton() 
	{
		act.doubleClick(copybutton).build().perform();
	}
	
}
