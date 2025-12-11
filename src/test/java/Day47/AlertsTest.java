package Day47;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AlertsTest {

    WebDriver driver;

    @BeforeClass
    @Parameters("browser")   // Browser name will come from TestNG XML
    void setup(String browser) throws MalformedURLException {
        // Correct Grid Hub endpoint
        String hubURL = "http://192.168.0.201:4444/wd/hub";

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new RemoteWebDriver(new URL(hubURL), options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new RemoteWebDriver(new URL(hubURL), options);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new RemoteWebDriver(new URL(hubURL), options);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println(browser + " launched successfully on Selenium Grid");
    }

    @Test
    void alerttest() {
        AlertsDemo a = new AlertsDemo(driver);

        a.clicksimplealert();
        a.alertaccept();
        System.out.println("Simple alert passed");

        a.clickconfirmationalert();
        a.alertaccept();
        System.out.println("Confirmation alert passed");

        a.clickpromptalert();
        a.alertaccept();
        System.out.println("Prompt alert passed");
    }

    @AfterClass
    void teardown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed successfully");
        }
    }
}