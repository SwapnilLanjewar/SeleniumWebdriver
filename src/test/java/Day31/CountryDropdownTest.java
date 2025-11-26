package Day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CountryDropdownTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Select "India" from Country dropdown
        driver.findElement(By.xpath("//select[@id='country']/option[text()='India']")).click();

        // Count total options in Country dropdown
        List<WebElement> options = driver.findElements(By.xpath("//select[@id='country']/option"));
        System.out.println("Total options: " + options.size());

        driver.quit();
    }
}