package qedge_March18;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Verify_item {
	public static void main(String[] args) throws Throwable {
		String Expected_Item="baby";
		boolean Item_Exist=false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_Items = listbox.getOptions();
		for (WebElement each : all_Items) {
			String Actual_Items = each.getText();
			Thread.sleep(1000);
			System.out.println(Actual_Items);
			if(Actual_Items.equalsIgnoreCase(Expected_Item))
			{
				Item_Exist=true;
				break;
			}
		}
		if(Item_Exist)
		{
			System.out.println("Item Found in Listbox::"+Expected_Item);
		}
		else
		{
			System.out.println("Item Not Found in Listbox::"+Expected_Item);
		}
		Thread.sleep(5000);
		driver.quit();
	}
}