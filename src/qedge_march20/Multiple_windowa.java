package qedge_march20;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Multiple_windowa {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		String parent = brw.get(0);
		String child1 = brw.get(1);
		String child2 = brw.get(2);
		String child3 = brw.get(3);
		driver.switchTo().window(child2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(.,'Terms of Service')])[1]")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}

