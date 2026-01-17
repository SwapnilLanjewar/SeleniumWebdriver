package PracticeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestMainA {
	
	
	WebDriver driver;
	
	TestMainA(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"name\"]") WebElement namefield;
	@FindBy(xpath = "//*[@id=\"email\"]") WebElement emailfield;

	
	public void setname(String name) 
	{
		namefield.sendKeys(name);
	}
	
	public void setemail(String email) 
	{
		emailfield.sendKeys(email);
	}
	
}
