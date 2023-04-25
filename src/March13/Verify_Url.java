package March13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Url {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://in.search.yahoo.com");
		Thread.sleep(5000);
		String expected =driver.getCurrentUrl();
		String actual ="https://";
		if (expected.startsWith(actual)) 
		{
			System.out.println("Url is Secured");
		} 
		else 
		{
			System.out.println("Url is not Secured");
		}
		driver.close();
	}

}
