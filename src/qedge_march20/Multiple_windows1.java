package qedge_march20;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Multiple_windows1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Conditions of Use")).click();
		driver.findElement(By.linkText("Privacy Notice")).click();
		driver.findElement(By.partialLinkText("Help")).click();
		Thread.sleep(1000);
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		String parent = brw.get(0);
		String child1 = brw.get(1);
		String child2 = brw.get(2);
		String child3 = brw.get(3);
		driver.switchTo().window(child2);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
