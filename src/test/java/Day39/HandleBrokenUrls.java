package Day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenUrls {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			String hrefvalue = link.getAttribute("href");

			if (hrefvalue == null || hrefvalue.isEmpty()) {
				System.out.println("href is null");
				continue;
			}

			try {

				URL linkurl = new URL(hrefvalue);
				HttpURLConnection conlinkurl = (HttpURLConnection) linkurl.openConnection();
				conlinkurl.connect();

				if (conlinkurl.getResponseCode() >= 400) {
					System.out.println("This is broken url");
				} else {
					System.out.println("This is not broken url");
				}

			}

			catch (Exception e) {
			}
		}

	}

}
