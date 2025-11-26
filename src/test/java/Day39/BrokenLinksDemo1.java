package Day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.reactivex.rxjava3.exceptions.Exceptions;

public class BrokenLinksDemo1 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement linkElement : links) {
			String hrefValue = linkElement.getAttribute("href");

			if (hrefValue == null || hrefValue.isEmpty()) {
				System.out.println("href value is not null or empty. So not possible to check");
				continue;
			}

			try {
				URL linkurl = new URL(hrefValue);
				HttpURLConnection conlinkurl = (HttpURLConnection) linkurl.openConnection();
				conlinkurl.connect();

				if (conlinkurl.getResponseCode() >= 400) {
					System.out.println(hrefValue + "It is Broken link");
				} else {
					System.out.println(hrefValue + "It is not Broken link");
				}
			}

			catch (Exception e) {

			}
		}

	}

}
