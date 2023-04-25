package March16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Counting_links {
	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.naukri.com");
Thread.sleep(5000);
List<WebElement>all_Links = driver.findElements(By.tagName("a"));
System.out.println("No of links are::"+all_Links.size());
Thread.sleep(5000);
for (WebElement each : all_Links) {
	System.out.println(each.getText());
	System.out.println(each.getAttribute("href"));
	}
Thread.sleep(5000);
driver.close();
	}

}
