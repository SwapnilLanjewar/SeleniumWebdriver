package Day48;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAutomationPageTest {
    WebDriver driver;
    public Logger logger; // log4j
    public Properties p;

    @BeforeClass
    @Parameters({ "browser" })
    public void setup(String br) throws IOException {

        // Load config.properties
        FileReader file = new FileReader(
            "C:\\Automation\\myworkspace\\SeleniumWebdriver\\src\\test\\resources\\Config.properties");
        p = new Properties();
        p.load(file);

        logger = LogManager.getLogger(this.getClass());

        // Launch local browser (no Grid)
        if (br.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);

        } else if (br.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();   // ✅ FIXED
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
            driver.manage().window().maximize();

        } else if (br.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();      // ✅ FIXED
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
            driver.manage().window().maximize();

        } else {
            throw new IllegalArgumentException("Invalid browser: " + br);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(p.getProperty("URL"));
        System.out.println("Browser launched successfully on local machine");
    }

    @Test
    public void testpage() {
        logger.info("*******Starting Testcase for TestAutomation Page********");

        TestAutomationPage tap = new TestAutomationPage(driver);
        logger.info("******Providing all details*******");
        tap.enter_inputname();
        tap.enter_emailid();
        tap.enter_phoneno();
        tap.enter_address();
        tap.select_gender();
        tap.select_days();
        tap.select_country();
        tap.select_colour();
        tap.select_animal();
        System.out.println("All fields are entered successfully");
    }

    @Test
    public void verifyTitle() {
        String title = driver.getTitle();
        logger.info("Page title is: " + title);
        assert title.contains("Automation");
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        if (driver != null) {
            driver.quit();
        }
        System.out.println("Browser closed successfully");
        logger.info("********Testcase is passed*******");
    }
}