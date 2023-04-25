package March8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight_Booking_Register {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Regist")).click();
		driver.findElement(By.name("name")).sendKeys("Ramu");
		driver.findElement(By.name("contact")).sendKeys("6305967867");
		driver.findElement(By.name("email")).sendKeys("test06@gmai.com");
		driver.findElement(By.name("password")).sendKeys("test@143");
		driver.findElement(By.name("gender")).sendKeys("Male");
		driver.findElement(By.name("dob")).click();
		driver.findElement(By.linkText("11")).click();
		driver.findElement(By.id("flexCheckChecked")).click();
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
