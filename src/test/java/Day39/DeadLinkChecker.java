package Day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeadLinkChecker {
    public static void main(String[] args) {
        // Step 1: Setup WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Step 2: Launch the URL
            driver.get("http://www.deadlinkcity.com");

            // Step 3: Wait for the link and click "400 Bad Request"
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement errorLink = wait.until(
                ExpectedConditions.elementToBeClickable(By.partialLinkText("400"))
            );
            errorLink.click();

            // Step 4: Print the error page content
            WebElement body = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.tagName("body"))
            );
            System.out.println("Error Page Content:\n" + body.getText());

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}