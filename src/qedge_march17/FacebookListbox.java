package qedge_march17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookListbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Create new accou")).click();
		Thread.sleep(1000);
		Select yearlistbox = new Select(driver.findElement(By.name("birthday_year")));
		List<WebElement> all_items =yearlistbox.getOptions();
		System.out.println("No of items are::"+all_items.size());
		Thread.sleep(5000);
		for (WebElement each : all_items) {
			Thread.sleep(500);
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
