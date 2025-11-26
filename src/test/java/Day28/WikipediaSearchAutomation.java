package Day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import java.util.List;
import java.util.Set;

public class WikipediaSearchAutomation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // 1. Launch URL
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        // 2. Wikipedia search input (XPath)
        WebElement wikiInput = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
        wikiInput.sendKeys("Selenium");
        wikiInput.sendKeys(Keys.ENTER);
        Thread.sleep(3000); // Wait for search results to load

        // 3. Count total number of search result links (XPath)
        List<WebElement> searchLinks = driver.findElements(By.xpath("//div[@id='wikipedia-search-result']/div/a"));
        int totalSearchItems = searchLinks.size();
        System.out.println("Total number of search results displayed: " + totalSearchItems);

        // 4. Click on each searched link using for loop (XPath)
        String mainWindow = driver.getWindowHandle();
        for (WebElement link : searchLinks) {
            link.click();
            Thread.sleep(1500); // Wait for new tab to load
        }

        // 5. Get window Ids for every browser window
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window IDs:");
        for (String handle : windowHandles) {
            System.out.println(handle);
        }

        // 6. Close the newly opened links' tabs
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                driver.close();
                Thread.sleep(1000);
            }
        }

        // Switch back to main window
        driver.switchTo().window(mainWindow);

        driver.quit();
    }
}
