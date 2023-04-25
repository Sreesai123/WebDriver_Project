package march15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text_Attribute {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		Thread.sleep(5000);
		String Expected = driver.findElement(By.linkText("Gmail")).getText();
		String linkUrl = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(linkUrl);
		String Actual = "gmail";
		if (Expected.equalsIgnoreCase(Actual)) 
		{
			System.out.println("Link Foud in Page::"+Expected+"     "+Actual);
		} 
		else 
		{
			System.out.println("Link Not Foud in Page::"+Expected+"     "+Actual);
		}
		driver.close();
	}

}
