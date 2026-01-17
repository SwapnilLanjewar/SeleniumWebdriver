package PracticeDemo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestDropdownMain {

	WebDriver driver;

	TestDropdownMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='country']")
	WebElement countrydropdown;
	@FindBy(xpath = "//input[@id='Wikipedia1_wikipedia-search-input']")
	WebElement wikisearch;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement searchbutton;
	
	@FindBy(xpath = "//*[@title=\"Search\"]") WebElement searchgoogle;
	
	/*
	public void select_countryname() {
		Select s = new Select(countrydropdown);
		s.selectByIndex(1);
	}

	public void set_wikisearch(String searchvalue) {
		wikisearch.sendKeys(searchvalue);
	}

	public void search_wiki() {
		searchbutton.click();
	}
*/
	
	public void set_googlesearch(String searchtext) {
		searchgoogle.sendKeys(searchtext);
	}
	
	public void select_dropdownelement() {
		List<WebElement> suggestions = driver
				.findElements(By.xpath("//ul[@role=\"listbox\"]"));
		System.out.println(suggestions.size());

		if (!suggestions.isEmpty()) {
			suggestions.get(0).click();
		} else {
			System.out.println("Suggestions are empty");
		}
	}

}
