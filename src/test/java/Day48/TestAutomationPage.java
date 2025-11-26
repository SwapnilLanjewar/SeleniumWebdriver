package Day48;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestAutomationPage {

	WebDriver driver;

	TestAutomationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='name']")
	WebElement txt_inputname;
	@FindBy(xpath = "//input[@id='email']")
	WebElement txt_emailid;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement txt_phoneno;
	@FindBy(xpath = "//textarea[@id='textarea']")
	WebElement txt_address;
	@FindBy(xpath = "//input[@id='male']")
	WebElement male_radiobutton;
	@FindBy(xpath = "//input[@id='monday']")
	WebElement week_radiobutton;
	@FindBy(xpath = "//select[@id='country']")
	WebElement country_dropdown;
	@FindBy(xpath = "//select[@id='colors']")
	WebElement colour_dropdown;
	@FindBy(xpath = "//select[@id='animals']")
	WebElement animal_dropdown;

	public void enter_inputname() {
		txt_inputname.sendKeys("Peter");
	}

	public void enter_emailid() {
		txt_emailid.sendKeys("peter@gmail.com");
	}

	public void enter_phoneno() {
		txt_phoneno.sendKeys("99887665544");
	}

	public void enter_address() {
		txt_address.sendKeys("XYZ street.com");
	}

	public void select_gender() {
		male_radiobutton.click();
	}

	public void select_days() {
		week_radiobutton.click();
	}

	public void select_country() {
		Select country = new Select(country_dropdown);

		country_dropdown.click();
		country.selectByIndex(5);
	}

	public void select_colour() {
		Select colour = new Select(colour_dropdown);
		colour_dropdown.click();
		colour.selectByValue("blue");
	}
	
	public void select_animal() 
	{
		Select animal = new Select(animal_dropdown);
		animal_dropdown.click();
		animal.selectByIndex(3);
	}

}
