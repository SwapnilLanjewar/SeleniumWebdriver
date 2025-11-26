package Day45;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

public class CrossBrowserLoginTest {
    WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void setup(@Optional("chrome") String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void validateLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Validate Title
        Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Title mismatch");

        // Validate Current URL
        Assert.assertEquals(driver.getCurrentUrl(),
            "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",
            "URL mismatch");

        // Validate Logo is Displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector(".orangehrm-login-branding > img")
        ));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}