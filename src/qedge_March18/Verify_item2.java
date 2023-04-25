package qedge_March18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_item2 {

	public static void main(String[] args) throws Throwable {
		String Expected_Item = "Furniture";
		boolean ItemExist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		Select Listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>all_items = Listbox.getOptions();
		for (WebElement each : all_items) {
			String Actual_Items = each.getText();
			Thread.sleep(1000);
			System.out.println(Actual_Items);
			if (Actual_Items.equalsIgnoreCase(Expected_Item)) 
			{
				ItemExist= true;
				break;
			}
		}
		if (ItemExist) 
		{
			System.out.println("Item Found in Listbox::"+Expected_Item);	
		} 
		else 
		{
			System.out.println("Item is Not Found in Listbox::"+Expected_Item);
		}
		Thread.sleep(5000);
		driver.close();
	}
}
