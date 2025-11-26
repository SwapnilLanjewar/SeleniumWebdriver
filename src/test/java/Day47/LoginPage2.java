package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	//Constructor
	//Locators
	//Action methods
	
	WebDriver driver;
	
	//Constructor
	LoginPage2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']") WebElement txt_username;
	@FindBy(xpath="//input[@name='password']") WebElement txt_password;
	@FindBy(xpath="//button[@type='submit']") WebElement btn_login;
	
	
	
	//Action Method
	public void setUserName(String user) 
	{
		txt_username.sendKeys(user);
	}
	
	
	public void setPassword(String pwd) 
	{
		txt_username.sendKeys(pwd);
	}
	
	public void clickLogin() 
	{
		btn_login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//Locators
	//By txt_username_loc = By.xpath("//input[@name='username']");
	//By txt_password_loc = By.xpath("//input[@name='password']");
	//By btn_button_loc = By.xpath("//button[@type='submit']");
	
	/*
	public void setUserName(String user) 
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	
	
	public void setPassword(String pwd) 
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	
	public void clickLogin() 
	{
		driver.findElement(btn_button_loc).click();
	}
	*/
	
	
	
	
	
	
	
	
	
}
