package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class NopCommerceRegister {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Step 1: Launch login page
        driver.get("https://demo.nopcommerce.com/login");

        // Step 2: Maximize browser
        driver.manage().window().maximize();

        // Step 3: Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 4: Get Register link URL and open in new tab
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        String registerUrl = registerLink.getAttribute("href");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(registerUrl);

        // Step 5: Fill registration form
        driver.findElement(By.id("gender-male")).click(); // Gender
        driver.findElement(By.id("FirstName")).sendKeys("Swapnil");
        driver.findElement(By.id("LastName")).sendKeys("Tester");

        // Generate unique email to avoid duplicate registration
        String email = "swapnil" + System.currentTimeMillis() + "@test.com";
        driver.findElement(By.id("Email")).sendKeys(email);

        driver.findElement(By.id("Company")).sendKeys("TestCorp");
        driver.findElement(By.id("Password")).sendKeys("SecurePass123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("SecurePass123");

        // Step 6: Click Register
        driver.findElement(By.id("register-button")).click();

        // Step 7: Validate success message
        WebElement result = driver.findElement(By.className("result"));
        String message = result.getText();

        if (message.contains("Your registration completed")) {
            System.out.println("✅ Registration successful: " + message);
        } else {
            System.out.println("❌ Registration failed or message not found.");
        }

        driver.quit();
    }
}