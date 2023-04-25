package March16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nav_Commands1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://in.search.yahoo.com");
		Thread.sleep(5000);
		System.out.println("pagettitle[1]"+driver.getTitle());
		driver.findElement(By.xpath("//div[@title='Mail']")).click();
		System.out.println("pagetitle[2]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("pagetitle[3]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("pagetitle[4]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}

}
