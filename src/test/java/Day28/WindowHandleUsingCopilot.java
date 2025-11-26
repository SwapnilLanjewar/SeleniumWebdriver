package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleUsingCopilot {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. Launch URL
        driver.get("https://testautomationpractice.blogspot.com/");

        // 2. Click on "Blogger" hyperlink (bottom of page)
        WebElement bloggerLink = driver.findElement(By.linkText("Blogger"));
        bloggerLink.click();

        // 3. Handle tabs
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        // Switch to new tab
        driver.switchTo().window(tabs.get(1));
        String newTabTitle = driver.getTitle();
        System.out.println("New Tab Title: " + newTabTitle);

        // Switch back to original tab
        driver.switchTo().window(tabs.get(0));
        String originalTabTitle = driver.getTitle();
        System.out.println("Original Tab Title: " + originalTabTitle);

        // 4. Close Blogger tab
        driver.switchTo().window(tabs.get(1));
        driver.close();

        // 5. Switch back and enter name
        driver.switchTo().window(tabs.get(0));
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Swapnil");

        // Optional: close browser
        Thread.sleep(2000);
        driver.quit();
    }
}