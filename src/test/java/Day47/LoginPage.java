package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//Constructor
	//Locators
	//Action methods
	
	WebDriver driver;
	
	//Constructor
	LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//Locators
	By txt_username_loc = By.xpath("//input[@name='username']");
	By txt_password_loc = By.xpath("//input[@name='password']");
	By btn_button_loc = By.xpath("//button[@type='submit']");
	
	
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
	
	
	
	
	
	
	
	
}
