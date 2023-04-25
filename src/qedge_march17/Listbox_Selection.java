package qedge_march17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Selection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create new accou")).click();
		Thread.sleep(1000);
		Select daylist = new Select(driver.findElement(By.name("birthday_day")));
		Select monthlist = new Select(driver.findElement(By.name("birthday_month")));
		Select yearlist = new Select(driver.findElement(By.name("birthday_year")));
		boolean value = monthlist.isMultiple();
		System.out.println(value);
		daylist.selectByVisibleText("20");
		Thread.sleep(5000);
		monthlist.selectByIndex(7);
		Thread.sleep(5000);
		monthlist.selectByVisibleText("Sep");
		Thread.sleep(5000);
		yearlist.selectByVisibleText("1997");
		Thread.sleep(5000);
		driver.close();
	}

}
