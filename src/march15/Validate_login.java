package march15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_login {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		String user = username.getAttribute("value");
		WebElement password =driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String passwd = password.getAttribute("value");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println(user+"    "+passwd);
		Thread.sleep(5000);
		String Expected ="dashboard";
		String Actual = driver.getCurrentUrl();
		if (Actual.contains(Expected)) 
		{
			System.out.println("Login Sucess::"+Expected+"   "+Actual);
		} 
		else 
		{
			String error_message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println("error_message::"+Expected+"     "+Actual);
		}
		driver.quit();

	}

}
