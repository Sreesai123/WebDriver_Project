package qedge_March28;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable_Handling {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		String celldata1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[1]")).getText();
		String celldata2 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[8]/td[2]")).getText();
		System.out.println(celldata1+"    "+celldata2);
		Thread.sleep(5000);
	}

}
