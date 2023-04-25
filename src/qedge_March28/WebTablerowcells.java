package qedge_March28;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTablerowcells {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webTable = driver.findElement(By.className("dataTable"));
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
		int rowcoll = rows.size()-1;
		System.out.println("No of rows are::"+rowcoll);
		Thread.sleep(5000);
		for (int i = 1; i<=rowcoll; i++) 
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(500);
			System.out.println("Row No."+i+"   "+"column size::"+cols.size());

		}
		driver.quit();
	}

}
