package Day47;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsDemo {
	WebDriver driver;

	AlertsDemo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='alertBtn']")
	WebElement simplealert;

	@FindBy(xpath = "//button[@id='confirmBtn']")
	WebElement confirmationalert;

	@FindBy(xpath = "//button[@id='promptBtn']")
	WebElement promptalert;

	public void clicksimplealert() {

		simplealert.click();
	}

	public void clickconfirmationalert() {
		confirmationalert.click();
	}
	
	public void clickpromptalert() 
	{
		promptalert.click();
	}

	public void alertaccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
