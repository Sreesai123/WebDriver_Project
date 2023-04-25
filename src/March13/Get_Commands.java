package March13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Commands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String geturl = driver.getCurrentUrl();
		System.out.println(geturl);
		System.out.println(geturl.length());
		Thread.sleep(5000);
		driver.close();
	}

}
