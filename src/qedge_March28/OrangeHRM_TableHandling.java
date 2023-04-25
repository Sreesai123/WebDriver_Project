package qedge_March28;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHRM_TableHandling {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		Thread.sleep(1000);
		WebElement webTable = driver.findElement(By.xpath("//table[@id='resultTable']"));
		List<WebElement> rowcoll = webTable.findElements(By.tagName("tr"));
		int rows = rowcoll.size()-1;
		System.out.println("No of rows are::"+rows);
		Thread.sleep(5000);
		for (WebElement eachrow : rowcoll) {
			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				Thread.sleep(2000);
				String celldata = eachcell.getText();
				System.out.println(celldata+"\n");
			}
			System.out.println();
			System.out.println("---------------------------------------------");
		}
		Thread.sleep(500);
		driver.quit();
	}

}
