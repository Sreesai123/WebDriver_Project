package March8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Amazon_Resgister {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("reddy");
		driver.findElement(By.name("lastname")).sendKeys("raj");
		driver.findElement(By.name("reg_email__")).sendKeys("6306756789");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@1234");
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
		driver.close();


	}

}
