package Day34;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePickerDemo2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

        // Navigate to the site
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Get today's date in MM/dd/yyyy format
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        // Locate the date picker and enter today's date
        WebElement dateInput = driver.findElement(By.id("datepicker"));
        dateInput.clear();
        dateInput.sendKeys(formattedDate);

        // Optional pause to observe result
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();
    
	}

}
