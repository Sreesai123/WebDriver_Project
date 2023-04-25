package qedge_March28;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassTable_data {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webTable = driver.findElement(By.className("dataTable"));
		List<WebElement> rowscoll = webTable.findElements(By.tagName("tr"));
		int rows=rowscoll.size()-1;
		System.out.println("No of rows are::"+rows);
		Thread.sleep(5000);
		for (WebElement eachrow : rowscoll) {
			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				Thread.sleep(500);
				String celldata =eachcell.getText();
				System.out.print(celldata+"\n");
			}
			System.out.println();
			System.out.println("===================================================");	
		}
		Thread.sleep(500);
		driver.quit();
	}

}
